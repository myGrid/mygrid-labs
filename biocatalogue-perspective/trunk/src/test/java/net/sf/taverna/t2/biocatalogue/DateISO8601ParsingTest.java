package net.sf.taverna.t2.biocatalogue;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.w3c.util.DateParser;

public class DateISO8601ParsingTest {

  public static void main(String[] args) throws Exception
  {
    String strDate = "2009-06-26T11:46:48Z";
    
    // fails
    //DateFormat formatter = DateFormat.getDateTimeInstance();
    //System.out.println(formatter.parse(strDate));
    
    // fails
    //SimpleDateFormat simpleFormatter = new SimpleDateFormat();
    //System.out.println(simpleFormatter.parse(strDate));
    
    // works!
    DateParser parser = new DateParser();
    System.out.println(DateParser.parse(strDate));
  }

}
