package rhogenwizard.debugger.model.actions;

import org.eclipse.debug.core.model.IBreakpoint;

public class IsEnable implements IBpAction
{
	public IsEnable(IBreakpoint bp)
	{
	}
	
	@Override
	public boolean isPassed() 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkAction() 
	{
		return false;
	}
}
