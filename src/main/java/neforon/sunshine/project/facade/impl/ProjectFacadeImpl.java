package neforon.sunshine.project.facade.impl;

import neforon.sunshine.model.Project;
import neforon.sunshine.project.facade.ProjectFacade;
import neforon.sunshine.project.service.ProjectService;
import neforon.sunshine.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sunshine on 4/12/15.
 */
public class ProjectFacadeImpl implements ProjectFacade {
    @Autowired
    private ProjectService projectService;

    @Override
    public ResultData queryActiveProject(String projectId) {
        ResultData result = new ResultData();
        result = projectService.queryActiveProjectById(projectId);
        return result;
    }

    @Override
    public ResultData addProject(Project project) {
        ResultData result = new ResultData();
        result = projectService.addProject(project);
        return result;
    }

    @Override
    public ResultData queryActiveProjects() {
        ResultData result = new ResultData();
        result = projectService.queryActiveProjects();
        return result;
    }

    @Override
    public ResultData drawProject(String projectId) {
        ResultData result = new ResultData();
        result = projectService.drawProjectById(projectId);
        return result;
    }

    @Override
    public ResultData queryHistoryProjects() {
        ResultData result =  new ResultData();
        result = projectService.queryHistoryProjects();
        return result;
    }
}
