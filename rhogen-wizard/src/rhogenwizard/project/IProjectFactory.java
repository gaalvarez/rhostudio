package rhogenwizard.project;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

import rhogenwizard.BuildInfoHolder;
import rhogenwizard.project.extension.AlredyCreatedException;
import rhogenwizard.project.extension.BadProjectTagException;
import rhogenwizard.project.extension.ProjectNotFoundException;

public interface IProjectFactory 
{
	//
	IRhomobileProject createProject(Class<? extends IRhomobileProject> projectTag, BuildInfoHolder projectInfo) throws CoreException, AlredyCreatedException, BadProjectTagException, ProjectNotFoundException;
	//
	IRhomobileProject createProject(Class<? extends IRhomobileProject> projectTag, rhogenwizard.wizards.rhosync.BuildInfoHolder projectInfo) throws CoreException, ProjectNotFoundException,	AlredyCreatedException, BadProjectTagException;
	//
	IRhomobileProject convertFromProject(IProject project) throws BadProjectTagException;
	//
	IProject getSelectedProject();
	//
	boolean isProjectLocationInWorkspace(final String projectPath);
	//
	Class<?> typeFromProject(IProject project) throws BadProjectTagException;
	//
	IPath getWorkspaceDir();
}
