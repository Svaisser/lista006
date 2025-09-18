package com.svaisser.lista006.jogador;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jogador")
public class JogadorController {

    private final JogadorService jogadorService;

    public JogadorController(JogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }

    @GetMapping("/{time}/{posicao}")
    public Jogador gerarJogador(@PathVariable String time, @PathVariable String posicao) {
        return jogadorService.gerarJogador(time, posicao);
    }
}