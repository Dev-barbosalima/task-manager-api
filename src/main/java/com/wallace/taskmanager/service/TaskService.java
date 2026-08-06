package com.wallace.taskmanager.service;

import com.wallace.taskmanager.model.Task;
import com.wallace.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    //Consultar
    public List<Task> listar(){
        return repository.findAll();
    }

    //Consultar por Id
    public Optional<Task> buscarPorId(Long id){
        return repository.findById(id);
    }

    //Criar Tarefa
    public Task criar(Task task){
        return repository.save(task);
    }

    //Atualizar Tarefa
    public Task atualizar(Long id, Task novaTask){
        Optional<Task> taskExistente = repository.findById(id);

        if(taskExistente.isPresent()){
            Task task = taskExistente.get();

            task.setStatus(novaTask.getStatus());
            task.setTitulo(novaTask.getTitulo());
            task.setDescricao(novaTask.getDescricao());

            return repository.save(task);
        }
        return null;
    }

    //Excluir Tarefa
    public void deletar(Long id){
        repository.deleteById(id);
    }
}
