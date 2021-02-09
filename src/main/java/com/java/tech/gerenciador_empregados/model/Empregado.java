package com.java.tech.gerenciador_empregados.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empregado implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private UUID uuid;
    private String nome;
    private String email;
    private String setor;
    private String telefone;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String codigo;
}
