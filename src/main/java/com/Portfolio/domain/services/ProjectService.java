package com.Portfolio.domain.services;

import com.Portfolio.domain.models.Project;
import com.Portfolio.infra.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;
    @Autowired
    public ProjectService(ProjectRepository projectRepository){
        this.projectRepository = projectRepository;
    }

    public List<Project> getProjectsList(){
        return projectRepository.findAll();
    }

    public Project getProjectById (Long id) {
        Optional<Project> projectById = projectRepository.findById(id);
        Project project = null;
        if(projectById.isPresent()) {
            project = projectById.get();
        }
        return project;
    }

    public void addProject(Project newProject) {
        projectRepository.save(newProject);
    }

    public void updateProject(Long id, Project project) {
        Optional<Project> projectById = projectRepository.findById(id);

        if(projectById.isPresent()) {
            Project oldProject = projectById.get();

            oldProject.setName(project.getName());
            oldProject.setDescription(project.getDescription());
            oldProject.setImage(project.getDescription());
            oldProject.setRepositoryLink((project.getRepositoryLink()));
            oldProject.setRepositoryDeploy(project.getRepositoryDeploy());

            projectRepository.save(oldProject);
        }
    }

    public void deleteProject(Long id) {
        Optional<Project> projectById = projectRepository.findById(id);
        Project project = null;
        if(projectById.isPresent()) {
            project = projectById.get();
            projectRepository.delete(project);
        }
    }
}
