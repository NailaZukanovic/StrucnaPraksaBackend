package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProjectController {

    @Autowired
    ProjectRep projectRep;

    @GetMapping("/getAllProjects")
    public List<Project> getAllProjects()
    {
        return projectRep.findAll();
    }

    @GetMapping("/getProjectById/{id}")
    public Optional<Project> getProjectById(@PathVariable(value="id") Long id)
    {
        return projectRep.findById(id);
    }

    @PostMapping("/addProject")
    public Project addProject(@RequestBody Project project)
    {
        return projectRep.save(project);
    }


    @DeleteMapping("/deleteCategory/{id}")
    public void deleteCategory(@PathVariable(value="id") Long id)
    {
        Optional<Project> project=projectRep.findById(id);
        Project project_new=project.get();
        projectRep.delete(project_new);
    }

}