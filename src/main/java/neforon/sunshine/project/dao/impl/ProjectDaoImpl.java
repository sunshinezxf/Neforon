package neforon.sunshine.project.dao.impl;

import neforon.sunshine.model.Project;
import neforon.sunshine.project.dao.ProjectDao;
import neforon.sunshine.project.vo.ProjectVo;
import neforon.sunshine.utils.BaseDao;

import java.util.HashMap;
import java.util.List;

/**
 * Created by sunshine on 4/12/15.
 */
public class ProjectDaoImpl extends BaseDao implements ProjectDao {
    @Override
    public ProjectVo selectActiveProjectById(String projectId) {
        try {
            return sqlSession.selectOne("project.selectProject", projectId);
        } catch (Exception e) {
            return sqlSession.selectOne("project.selectProject", projectId);
        }
    }

    @Override
    public boolean insertProject(Project project) {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("projectId", project.getProjectId());
        params.put("projectName", project.getProjectName());
        params.put("state", project.getState());
        try {
            return (sqlSession.insert("project.insertProject", params) != 0) ? true : false;
        } catch (Exception e) {
            return (sqlSession.insert("project.insertProject", params) != 0) ? true : false;
        }
    }

    @Override
    public List<Project> selectActiveProjects() {
        try {
            return sqlSession.selectList("project.selectActiveProjects");
        } catch (Exception e) {
            return sqlSession.selectList("project.selectActiveProjects");
        }
    }

    @Override
    public boolean deleteProjectById(String projectId) {
        try {
            return (sqlSession.delete("project.deleteProject", projectId) != 0) ? true : false;
        } catch (Exception e) {
            return (sqlSession.delete("project.deleteProject", projectId) != 0) ? true : false;
        }
    }

    @Override
    public List<Project> selectDrawProjects() {
        try {
            return sqlSession.selectList("project.selectDrawProjects");
        } catch (Exception e) {
            return sqlSession.selectList("project.selectDrawProjects");
        }
    }
}
