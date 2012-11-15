package rhogenwizard.debugger.model.actions;

import java.util.List;

import org.eclipse.core.resources.IProject;

public class BpActionFactory 
{
	private static List<IBpAction> createRhodesActions()
	{
		return null;
	}
	
	private static List<IBpAction> createRhoconnectActions()
	{
		return null;
	}
	
	private static List<IBpAction> createRhoelementsActions()
	{
		return createRhodesActions();
	}
	
	public static List<IBpAction> create(IProject project)
	{
		return null;
	}
}
