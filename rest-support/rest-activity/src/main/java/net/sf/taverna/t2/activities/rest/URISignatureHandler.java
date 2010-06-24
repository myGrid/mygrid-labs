package net.sf.taverna.t2.activities.rest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


/**
 * 
 * 
 * @author Sergejs Aleksejevs
 */
public class URISignatureHandler
{
  public static final char PLACEHOLDER_START_SYMBOL = '{';
  public static final char PLACEHOLDER_END_SYMBOL = '}';
  
  
  /**
   * 
   * @param uriSignature
   * @return
   */
  public static LinkedHashMap<String,Integer> extractPlaceholdersWithPositions(String uriSignature)
  {
    LinkedHashMap<String,Integer> foundPlaceholdersWithPositions = new LinkedHashMap<String,Integer>();
    
    int nestingLevel = 0;
    int startSymbolIdx = -1;
    
    for (int i = uriSignature.indexOf(PLACEHOLDER_START_SYMBOL); i < uriSignature.length(); i++) {
      switch (uriSignature.charAt(i)) {
        case PLACEHOLDER_START_SYMBOL:
          if (nestingLevel == 0) {
            nestingLevel++;
            startSymbolIdx = i;
          }
          else {
            throw new URISignatureParsingException("Malformed URI signature: nested placeholders encountered in the URI signature.");
          }
          break;
        
        case PLACEHOLDER_END_SYMBOL:
          if (nestingLevel == 1) {
            nestingLevel--;
            
            String placeholderCandidate = uriSignature.substring(startSymbolIdx + 1, i);
            if (!foundPlaceholdersWithPositions.containsKey(placeholderCandidate)) {
              foundPlaceholdersWithPositions.put(placeholderCandidate, startSymbolIdx + 1);
            }
            else {
              throw new URISignatureParsingException("Malformed URI signature: duplicate placeholder \"" + placeholderCandidate + "\" found");
            }
          }
          else {
            throw new URISignatureParsingException("Malformed URI signature: placeholder closing character found before the opening one");
          }
          break;
        
        default: continue;
      }
    }
    
    return (foundPlaceholdersWithPositions);
  }
  
  
  /**
   * 
   * @param uriSignature
   * @return
   */
  public static List<String> extractPlaceholders(String uriSignature) {
    return (new ArrayList<String>(extractPlaceholdersWithPositions(uriSignature).keySet()));
  }
  
  
  /**
   * 
   * @param uriSignature
   * @param parameters
   * @return
   */
  public static String generateCompleteURI(String uriSignature, Map<String,String> parameters)
  {
    // TODO - check failure on duplicate placeholders in here 
    LinkedHashMap<String,Integer> placeholdersWithPositions = extractPlaceholdersWithPositions(uriSignature);
    
    // the 'placeholders' linked list is guaranteed to be in the order of occurrence of placeholders in the URI signature;
    // this will allow to traverse the URI signature and replace the placeholders in the reverse order --
    // this way it is possible to use the indices of placeholders that were already found during their extraction to
    // improve performance
    LinkedList<String> placeholders = new LinkedList<String>(placeholdersWithPositions.keySet());
    Iterator<String> placeholdersIterator = placeholders.descendingIterator();
    
    StringBuilder completeURI = new StringBuilder(uriSignature);
    while (placeholdersIterator.hasNext()) {
      String placeholder = placeholdersIterator.next();
      if (parameters.containsKey(placeholder)) {
        int placeholderStartPos = placeholdersWithPositions.get(placeholder) - 1;
        int placeholderEndPos = placeholderStartPos + placeholder.length() + 2;
        completeURI.replace(placeholderStartPos, placeholderEndPos, parameters.get(placeholder));
      }
      else {
        throw new URIGenerationFromSignatureException("Parameter map does not contain a key/value for \"" + placeholder + "\" placeholder");
      }
    }
    
    
    return (completeURI.toString());
  }
  
  
  /**
   * @author Sergejs Aleksejevs
   */
  public static class URISignatureParsingException extends IllegalArgumentException
  {
    public URISignatureParsingException() { }
    public URISignatureParsingException(String message) { super(message); }
  }
  
  /**
   * @author Sergejs Aleksejevs
   */
  public static class URIGenerationFromSignatureException extends RuntimeException
  {
    public URIGenerationFromSignatureException() { }
    public URIGenerationFromSignatureException(String message) { super(message); }
  }
}
