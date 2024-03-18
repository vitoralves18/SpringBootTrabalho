package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Funcionario extends Pessoa{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    private String nome;

//    @NotNull(message = "Campo cpf não pode ser nulo.")
//    @Column(nullable = false)
//    @Size(min = 11, max = 14)
//    private String cpf;
    @NotNull
    @Column(nullable = false)
    @Min(value = 1)
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, String idade, double salario) {
        super(nome, cpf, idade);
        this.salario = salario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
