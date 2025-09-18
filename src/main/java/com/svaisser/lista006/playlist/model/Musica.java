package com.svaisser.lista006.playlist.model;


public class Musica {
    private Long id;
    private String nome;
    private String artista;
    private String album;
    private int duracao;
    private String genero;

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

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Musica (Long id, String nome, String artista,
                   String album, int duracao, String genero) {
        this.id = id;
        this.nome = nome;
        this.artista = artista;
        this.album = album;
        this.duracao = duracao;
        this.genero = genero;
    }
}
