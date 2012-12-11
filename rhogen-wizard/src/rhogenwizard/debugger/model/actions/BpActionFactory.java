package rhogenwizard.debugger.model.actions;

import org.eclipse.core.resources.IProject;

public class BpActionFactory 
{
	private static IBpSetter createRhodesActions()
	{
		return null;
	}
	
	private static IBpSetter createRhoconnectActions()
	{
		return null;
	}
	
	private static IBpSetter createRhoelementsActions()
	{
		return createRhodesActions();
	}
	
	public static IBpSetter create(IProject project)
	{
		return null;
	}
}
