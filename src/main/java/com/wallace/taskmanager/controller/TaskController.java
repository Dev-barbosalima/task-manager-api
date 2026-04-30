package com.wallace.taskmanager.controller;

import com.wallace.taskmanager.model.Task;
import com.wallace.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService service;

    //Metodo GET - Listar todas tarefas
    @GetMapping
    public List<Task> listar(){
        return service.listar();
    }

    //Metodo GET - Listar tarefa por Id
    @GetMapping("/{id}")
    public Optional<Task> buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    //Metodo POST - Criar uma Tarefa
    @PostMapping
    public Task criar(@RequestBody Task task){
        return service.criar(task);
    }

    //Metodo PUT - Atualizar uma Tarefa
    @PutMapping("/{id}")
    public Task atualizar(@PathVariable Long id, @RequestBody Task task){
        return service.atualizar(id, task);
    }

    //Metodo DELETE - Deletar uma Tarefa
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
