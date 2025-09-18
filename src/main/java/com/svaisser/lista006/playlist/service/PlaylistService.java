package com.svaisser.lista006.playlist.service;

import com.svaisser.lista006.playlist.model.Playlist;
import com.svaisser.lista006.playlist.model.Musica;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PlaylistService {

    private Map<Long, Playlist> playlists = new HashMap<>();
    private Long proximoId = 1L;

    public Playlist criarPlaylist(Playlist playlist) {
        playlist.setId(proximoId++);
        if (playlist.getMusicas() == null) {
            playlist.setMusicas(new ArrayList<>());
        }
        playlists.put(playlist.getId(), playlist);
        return playlist;
    }

    public List<Playlist> listarPlaylists() {
        return new ArrayList<>(playlists.values());
    }

    public boolean adicionarMusica(Long idPlaylist, Musica musica) {
        Playlist playlist = playlists.get(idPlaylist);
        if (playlist != null) {
            playlist.getMusicas().add(musica);
            return true;
        }
        return false;
    }

    public List<Musica> listarMusicas(Long idPlaylist) {
        Playlist playlist = playlists.get(idPlaylist);
        if (playlist != null) {
            return playlist.getMusicas();
        }
        return Collections.emptyList();
    }
}