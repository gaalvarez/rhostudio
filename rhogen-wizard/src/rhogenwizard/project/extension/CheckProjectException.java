package rhogenwizard.project.extension;

import org.eclipse.core.resources.IProject;

public class CheckProjectException extends Exception
{
    private static final long serialVersionUID = -1443243798511289105L;

    private IProject m_project = null;
	
	public CheckProjectException(IProject project)
	{
		m_project = project;
	}
	
	@Override
	public String getMessage() 
	{
		return this.toString();
	}

	@Override
	public String toString() 
	{
		StringBuilder sb = new StringBuilder();
		sb.append("In project ");
		
		if (m_project != null)
		{
			sb.append(m_project.getName());
		}
		
		sb.append(" was encountered problem.");
		
		return sb.toString();
	}
}
