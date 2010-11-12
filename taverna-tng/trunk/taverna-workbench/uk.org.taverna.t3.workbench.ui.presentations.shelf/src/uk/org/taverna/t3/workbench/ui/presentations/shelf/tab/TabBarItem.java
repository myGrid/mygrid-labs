package uk.org.taverna.t3.workbench.ui.presentations.shelf.tab;

import org.eclipse.swt.widgets.Item;

public class TabBarItem extends Item
{
    private TabBar parent;
    
    public TabBarItem(TabBar parent, int style)
    {
        super(parent, style);
     
        this.parent = parent;
        parent.newItem(this,-1);
    }

    /** 
     * {@inheritDoc}
     */
    @Override
    public void setText(String string)
    {
        super.setText(string);
        parent.updateItemSize();
        parent.redraw();
    }

    /**
     * @return the parent
     */
    public TabBar getParent()
    {
        return parent;
    }

}
