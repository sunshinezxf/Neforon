package neforon.sunshine.project.dao;

import neforon.sunshine.model.Project;
import neforon.sunshine.project.vo.ProjectVo;

import java.util.List;

/**
 * Created by sunshine on 4/12/15.
 */
public interface ProjectDao {
    public ProjectVo selectActiveProjectById(String projectId);

    public boolean insertProject(Project project);

    public List<Project> selectActiveProjects();

    public boolean deleteProjectById(String projectId);

    public List<Project> selectDrawProjects();
}
