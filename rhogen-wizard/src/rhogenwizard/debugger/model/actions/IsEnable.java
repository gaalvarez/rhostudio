package rhogenwizard.debugger.model.actions;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.model.IBreakpoint;

import rhogenwizard.Activator;

public class IsEnable extends AbstractAction
{
	private final IBreakpoint m_bp;
	
	public IsEnable(IBreakpoint bp)
	{
		m_bp = bp;
	}

	@Override
	public boolean checkAction() 
	{
		try 
		{
			m_isPassed = m_bp.isEnabled();
		}
		catch (CoreException e) 
		{
			Activator.logError(e);
			e.printStackTrace();
		}
		
		return m_isPassed;
	}
}
