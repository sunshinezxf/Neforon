package neforon.sunshine.project.service.impl;

import neforon.sunshine.model.Project;
import neforon.sunshine.project.dao.ProjectDao;
import neforon.sunshine.project.service.ProjectService;
import neforon.sunshine.project.vo.ProjectVo;
import neforon.sunshine.utils.ResponseCode;
import neforon.sunshine.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by sunshine on 4/12/15.
 */
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectDao projectDao;

    @Override
    public ResultData queryActiveProjectById(String projectId) {
        ResultData result = new ResultData();
        ProjectVo vo = projectDao.selectActiveProjectById(projectId);
        if (vo == null) {
            result.setStatusCode(ResponseCode.MESSAGE_NULL);
        } else {
            result.setStatusCode(ResponseCode.MESSAGE_OK);
            result.setData(vo);
        }
        return result;
    }

    @Override
    public ResultData addProject(Project project) {
        ResultData result = new ResultData();
        boolean status = projectDao.insertProject(project);
        if (status) {
            result.setStatusCode(ResponseCode.MESSAGE_OK);
            result.setData(status);
        } else {
            result.setStatusCode(ResponseCode.MESSAGE_NULL);
        }
        return result;
    }

    @Override
    public ResultData queryActiveProjects() {
        ResultData result = new ResultData();
        List<Project> project = projectDao.selectActiveProjects();
        if (project == null) {
            result.setStatusCode(ResponseCode.MESSAGE_NULL);
        } else {
            result.setStatusCode(ResponseCode.MESSAGE_OK);
            result.setData(project);
        }
        return result;
    }

    @Override
    public ResultData drawProjectById(String projectId) {
        ResultData result = new ResultData();
        boolean status = projectDao.deleteProjectById(projectId);
        if (status) {
            result.setStatusCode(ResponseCode.MESSAGE_OK);
            result.setData(status);
        } else {
            result.setStatusCode(ResponseCode.MESSAGE_NULL);
        }
        return result;
    }

    @Override
    public ResultData queryHistoryProjects() {
        ResultData result = new ResultData();
        List<Project> project = projectDao.selectDrawProjects();
        if (project == null) {
            result.setStatusCode(ResponseCode.MESSAGE_NULL);
        } else {
            result.setStatusCode(ResponseCode.MESSAGE_OK);
            result.setData(project);
        }
        return result;
    }
}
