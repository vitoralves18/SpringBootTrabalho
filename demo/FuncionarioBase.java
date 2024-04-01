// Classe FuncionarioBase
package com.example.demo.model;

public abstract class FuncionarioBase extends Funcionario implements Cargo {
    public FuncionarioBase(String nome, String cpf, int idade, double salario) {
        super(nome, cpf, String.valueOf(idade), salario);
    }

    @Override
    public double getSalarioMinimo() {
        // Implementação do método
        return 0; // Substitua pelo valor correto
    }

    @Override
    public double getSalarioMaximo() {
        // Implementação do método
        return 0; // Substitua pelo valor correto
    }
}