package neforon.sunshine.project.dao;

import neforon.sunshine.project.vo.ProjectVo;

/**
 * Created by sunshine on 4/12/15.
 */
public interface ProjectDao {
    public ProjectVo selectProjectById(String projectId);
}
