package neforon.sunshine.project.facade;

import neforon.sunshine.model.Project;
import neforon.sunshine.utils.ResultData;

/**
 * Created by sunshine on 4/12/15.
 */
public interface ProjectFacade {
    public ResultData queryActiveProject(String projectId);

    public ResultData addProject(Project project);

    public ResultData queryActiveProjects();

    public ResultData drawProject(String projectId);

    public ResultData queryHistoryProjects();
}
