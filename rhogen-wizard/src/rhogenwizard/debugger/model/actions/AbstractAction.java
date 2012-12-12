package rhogenwizard.debugger.model.actions;

public abstract class AbstractAction implements IBpAction 
{
	protected boolean m_isPassed = false;

	@Override
	public boolean isPassed() 
	{
		return m_isPassed;
	}
}
