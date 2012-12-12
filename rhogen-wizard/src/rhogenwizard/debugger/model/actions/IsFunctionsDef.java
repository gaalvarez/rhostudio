package rhogenwizard.debugger.model.actions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.dltk.internal.debug.core.model.ScriptLineBreakpoint;

public class IsFunctionsDef extends AbstractAction
{
	private final IBreakpoint m_bp;

    //TODO - hot fix 
    private boolean isFunctionDefinition(ScriptLineBreakpoint lineBp)
    {
        IFile file = (IFile) lineBp.getResource();
        
		try 
		{
	    	BufferedReader contentBuffer = new BufferedReader(new InputStreamReader(file.getContents()));
	    	
	    	String buf = "";
    	
    		for (int i=0; i < lineBp.getLineNumber(); i++)
    		{
    			buf = contentBuffer.readLine();
    		}
    		
    		return buf.matches("^\\s*def\\s.*$");
		} 
		catch (CoreException e) 
		{
			e.printStackTrace();
		}
    	catch (IOException e) 
    	{
			e.printStackTrace();
		}	
		
		return false;
    }
    
	public IsFunctionsDef(IBreakpoint bp)
	{
		m_bp = bp;
	}
	
	@Override
	public boolean checkAction() 
	{
		m_isPassed = isFunctionDefinition((ScriptLineBreakpoint) m_bp);
		
		return m_isPassed;
	}
}
