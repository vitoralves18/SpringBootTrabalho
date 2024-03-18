package com.example.demo.model;

public abstract class FuncionarioBase extends Funcionario implements Cargo {
    public FuncionarioBase(String nome, String cpf, int idade, double salario) {
        super(nome, cpf, idade, salario);
    }
}