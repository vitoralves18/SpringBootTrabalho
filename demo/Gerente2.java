package com.example.demo.model;

    public class Gerente2 extends FuncionarioBase {
        public Gerente2(String nome, String cpf, int idade, double salario) {
            super(nome, cpf, idade, salario);
        }

        @Override
        public double getSalarioMinimo() {
            return 2000.0; // Exemplo de salário mínimo para um gerente
        }

        @Override
        public double getSalarioMaximo() {
            return 10000.0; // Exemplo de salário máximo para um gerente
        }

        // Outros métodos específicos para gerentes
    }
