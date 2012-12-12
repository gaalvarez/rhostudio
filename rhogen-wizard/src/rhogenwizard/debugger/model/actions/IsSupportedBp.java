package rhogenwizard.debugger.model.actions;

import org.eclipse.debug.core.model.IBreakpoint;

import rhogenwizard.constants.DebugConstants;

public class IsSupportedBp extends AbstractAction
{
	private IBreakpoint m_bp = null;
	
	public IsSupportedBp(IBreakpoint bp)
	{
		m_bp = bp;
	}
	
	@Override
	public boolean checkAction() 
	{
        if (m_bp.getModelIdentifier().equals(DebugConstants.debugModelId))
        {
        	m_isPassed = true;
        }

        return m_isPassed;
	}
}
