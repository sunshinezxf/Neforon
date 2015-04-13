package neforon.sunshine.project.service.impl;

import neforon.sunshine.project.dao.ProjectDao;
import neforon.sunshine.project.service.ProjectService;
import neforon.sunshine.project.vo.ProjectVo;
import neforon.sunshine.utils.ResponseCode;
import neforon.sunshine.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sunshine on 4/12/15.
 */
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectDao projectDao;

    @Override
    public ResultData queryProjectById(String projectId) {
        ResultData result = new ResultData();
        ProjectVo vo = projectDao.selectProjectById(projectId);
        if (vo == null) {
            result.setStatusCode(ResponseCode.MESSAGE_NULL);
        } else {
            result.setStatusCode(ResponseCode.MESSAGE_OK);
            result.setData(vo);
        }
        return result;
    }
}
