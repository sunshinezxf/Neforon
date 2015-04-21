package neforon.sunshine.project.facade.impl;

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
    public ResultData queryProject(String projectId) {
        ResultData result = new ResultData();
        result = projectService.queryProjectById(projectId);
        return result;
    }

    @Override
    public ResultData queryActiveProjects() {
        ResultData result = new ResultData();
        result = projectService.queryActiveProjects();
        return result;
    }
}
