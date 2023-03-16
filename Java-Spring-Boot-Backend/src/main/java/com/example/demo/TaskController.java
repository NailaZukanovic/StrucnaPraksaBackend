package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TaskController {

    @Autowired
    TaskRep taskRep;

    @GetMapping("/getAllTasks")
    public List<Task> getAllTasks()
    {
        return taskRep.findAll();
    }

    @GetMapping("/getTaskById/{id}")
    public Optional<Task> getTaskById(@PathVariable(value="id") Long id)
    {
        return taskRep.findById(id);
    }

    @PostMapping("/addTask")
    public Task addTask(@RequestBody Task task)
    {
        return taskRep.save(task);
    }


    @DeleteMapping("/deleteTask/{id}")
    public void deleteTask(@PathVariable(value="id") Long id)
    {
        Optional<Task> task=taskRep.findById(id);
        Task task_new=task.get();
        taskRep.delete(task_new);
    }

}