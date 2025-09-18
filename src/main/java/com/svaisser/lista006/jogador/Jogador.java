package com.svaisser.lista006.jogador;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Jogador {
    private String nome;
    private String sobrenome;
    private int idade;
    private String posicao;
    private String time;

    public Jogador(String nome, String sobrenome, int idade, String posicao, String time) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.posicao = posicao;
        this.time = time;
    }
}