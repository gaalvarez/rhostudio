package rhogenwizard.debugger.model.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.debug.core.model.IBreakpoint;

import rhogenwizard.debugger.backend.DebugServer;

public class BpActionFactory 
{
	private static IBpSetter createRhodesActions(IProject project, IBreakpoint bp, DebugServer debugServer)
	{
		List<IBpAction> actions = new ArrayList<IBpAction>();
		
		actions.add(new IsSupportedBp(bp));
        actions.add(new IsClassDef(bp));
        actions.add(new IsEnable(bp));
        actions.add(new IsGlobalBpEnable());
                
        return new BpSetterImpl(actions, bp, debugServer, project);
	}
	
	private static IBpSetter createRhoconnectActions(IProject project, IBreakpoint bp, DebugServer debugServer)
	{
		return null;
	}
	
	private static IBpSetter createRhoelementsActions(IProject project, IBreakpoint bp, DebugServer debugServer)
	{
		return null; //createRhodesActions();
	}
	
	public static IBpSetter create(IProject project, IBreakpoint bp, DebugServer debugServer)
	{		
		return createRhodesActions(project, bp, debugServer);
	}
}
