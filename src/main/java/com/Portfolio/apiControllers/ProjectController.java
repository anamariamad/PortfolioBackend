package com.Portfolio.apiControllers;

import com.Portfolio.domain.models.Project;
import com.Portfolio.domain.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
@RequestMapping(path = "api/portfolio/projects")
public class ProjectController {
    private final ProjectService projectService;
    @Autowired
    public ProjectController(ProjectService projectService) {

        this.projectService = projectService;
    }

    @GetMapping()
    public List<Project> getProjectController() {
        return projectService.getProjectsList();
    }

    @GetMapping("/{id}")
    public Project getProjectByIdController(@PathVariable Long id) {
        return projectService.getProjectById(id);
    }

    @PostMapping()
    public void postProjectController(@RequestBody Project project){
        projectService.addProject(project);
    }

    @PutMapping("/{id}")
    public void putProjectController(@PathVariable Long id, @RequestBody Project project){
        projectService.updateProject(id, project);
    }
    @DeleteMapping("/{id}")
    public void deleteProjectController(@PathVariable Long id) {
        projectService.deleteProject(id);
    }
}