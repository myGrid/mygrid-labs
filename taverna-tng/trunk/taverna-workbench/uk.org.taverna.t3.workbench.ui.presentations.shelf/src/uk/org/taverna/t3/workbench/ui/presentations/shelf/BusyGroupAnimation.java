package uk.org.taverna.t3.workbench.ui.presentations.shelf;

import org.eclipse.swt.graphics.Image;
import org.eclipse.nebula.widgets.pgroup.PGroup;

public class BusyGroupAnimation extends ImageAnimationPlayer
{
    private PGroup group;    
    
    public BusyGroupAnimation(PGroup group)
    {
        super(group.getDisplay());
        this.group = group;
    }    

    @Override
    public void updateImage(Image i)
    {
        if (!i.isDisposed())
            group.setImage(i);
    }

}
