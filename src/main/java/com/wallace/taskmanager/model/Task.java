package com.wallace.taskmanager.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String titulo;

    @Getter
    @Setter
    private String descricao;

    @Getter
    @Setter
    private StatusTarefa status;

    //construtor
    public Task(){}

    public Task(String titulo, String descricao){
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = StatusTarefa.PENDENTE;
    }
}
