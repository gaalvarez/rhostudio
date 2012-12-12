package rhogenwizard.debugger.model.actions;

import org.eclipse.debug.core.DebugPlugin;

public class IsGlobalBpEnable extends AbstractAction
{
	@Override
	public boolean checkAction()
	{
		m_isPassed = DebugPlugin.getDefault().getBreakpointManager().isEnabled();
		return m_isPassed;
	}
}
