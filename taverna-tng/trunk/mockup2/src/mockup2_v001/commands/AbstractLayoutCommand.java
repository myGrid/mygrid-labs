package mockup2_v001.commands;

import org.eclipse.gef.commands.Command;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Rectangle;

public abstract class AbstractLayoutCommand extends Command {
	
	public abstract void setConstraint(Rectangle rect);
	public abstract void setModel(Object model);
}
