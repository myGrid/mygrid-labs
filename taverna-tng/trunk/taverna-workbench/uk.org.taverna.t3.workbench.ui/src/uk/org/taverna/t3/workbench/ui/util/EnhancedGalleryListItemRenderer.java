package uk.org.taverna.t3.workbench.ui.util;

import lombok.Getter;
import lombok.Setter;

import org.eclipse.nebula.widgets.gallery.ListItemRenderer;

/**
 * Enhanced list item renderer for the Nebula Gallery widget.
 * 
 * Built on top of the Nebula Gallery {@link ListItemRenderer}, current enhancements are:
 * * TODO: Option to fix image size.
 * * TODO: Only renders as a flat list instead of a grid.
 * 
 * @author Jits
 *
 */
public class EnhancedGalleryListItemRenderer extends ListItemRenderer {
	
	@Getter
	@Setter
	boolean fixedImageSize = true;
	
	// TODO: we have a problem here, since most of the fields in ListItemRenderer 
	// are not available in the subclass (typical!!)
}
