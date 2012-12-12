package rhogenwizard.debugger.model.actions;

import org.eclipse.debug.core.model.IBreakpoint;

public class IsClassDef extends AbstractAction 
{
	public IsClassDef(IBreakpoint bp)
	{
	}

	@Override
	public boolean checkAction() 
	{
		return false;
	}
}
