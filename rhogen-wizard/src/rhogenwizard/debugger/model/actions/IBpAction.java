package rhogenwizard.debugger.model.actions;

import org.eclipse.debug.core.model.IBreakpoint;

public interface IBpAction 
{
	//
	void setBpObjects(IBreakpoint bp);
	//
	boolean isPassed();
}
