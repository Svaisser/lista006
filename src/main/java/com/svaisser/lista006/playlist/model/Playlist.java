package com.svaisser.lista006.playlist.model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private Long id;
    private String nome;
    private List<Musica> musicas = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public Playlist(Long id, String nome, List<Musica> musicas) {
        this.id = id;
        this.nome = nome;
        this.musicas = musicas;
    }
}