package com.example.demo.model;

public class Diretor extends FuncionarioBase {
    public Diretor(String nome, String cpf, int idade, double salario) {
        super(nome, cpf, idade, salario);
    }

    @Override
    public double getSalarioMinimo() {
        return 5000.0; // Exemplo de salário mínimo para um diretor
    }

    @Override
    public double getSalarioMaximo() {
        return 20000.0; // Exemplo de salário máximo para um diretor
    }

    // Outros métodos específicos para diretores
}