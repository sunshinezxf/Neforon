package neforon.sunshine.project.dao.impl;

import neforon.sunshine.model.Project;
import neforon.sunshine.project.dao.ProjectDao;
import neforon.sunshine.project.vo.ProjectVo;
import neforon.sunshine.utils.BaseDao;

import java.util.List;

/**
 * Created by sunshine on 4/12/15.
 */
public class ProjectDaoImpl extends BaseDao implements ProjectDao {
    @Override
    public ProjectVo selectProjectById(String projectId) {
        return sqlSession.selectOne("project.selectProject", projectId);
    }

    @Override
    public List<Project> selectActiveProjects() {
        return sqlSession.selectList("project.selectActiveProject");
    }
}
