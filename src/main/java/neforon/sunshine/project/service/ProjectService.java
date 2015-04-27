package neforon.sunshine.project.service;

import neforon.sunshine.model.Project;
import neforon.sunshine.utils.ResultData;

/**
 * Created by sunshine on 4/12/15.
 */
public interface ProjectService {
    public ResultData queryActiveProjectById(String projectId);

    public ResultData addProject(Project project);

    public ResultData queryActiveProjects();

    public ResultData drawProjectById(String projectId);

    public ResultData queryHistoryProjects();
}
