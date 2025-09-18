package com.svaisser.lista006.playlist.controller;

import com.svaisser.lista006.playlist.model.Playlist;
import com.svaisser.lista006.playlist.model.Musica;
import com.svaisser.lista006.playlist.service.PlaylistService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playlists")
public class PlaylistController {

    private final PlaylistService playlistService;

    public PlaylistController(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    @PostMapping
    public ResponseEntity<Long> criarPlaylist(@RequestBody Playlist playlist) {
        Playlist novaPlaylist = playlistService.criarPlaylist(playlist);
        return ResponseEntity.ok(novaPlaylist.getId());
    }

    @PostMapping("/{id}/musicas")
    public ResponseEntity<String> adicionarMusica(@PathVariable Long id, @RequestBody Musica musica) {
        boolean sucesso = playlistService.adicionarMusica(id, musica);
        if (sucesso) {
            return ResponseEntity.ok("Música adicionada com sucesso!");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public List<Playlist> listarPlaylists() {
        return playlistService.listarPlaylists();
    }

    @GetMapping("/{id}/musicas")
    public ResponseEntity<List<Musica>> listarMusicas(@PathVariable Long id) {
        List<Musica> musicas = playlistService.listarMusicas(id);
        if (musicas.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(musicas);
        }
    }
}
