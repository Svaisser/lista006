package com.svaisser.lista006.jogador;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class JogadorService {

    private final List<String> nomes = List.of("Ronaldo", "Lucas", "Carlos", "João", "Pedro");
    private final List<String> sobrenomes = List.of("Fenômeno", "Silva", "Souza", "Almeida", "Pereira");

    private final Random random = new Random();

    public Jogador gerarJogador(String time, String posicao) {
        String nome = nomes.get(random.nextInt(nomes.size()));
        String sobrenome = sobrenomes.get(random.nextInt(sobrenomes.size()));
        int idade = random.nextInt(18, 40); // entre 18 e 39 anos

        return new Jogador(nome, sobrenome, idade, posicao, time);
    }
}
