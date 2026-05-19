package com.example.API.jogos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/jogos")
public class JogoController {

    @GetMapping
    public ResponseEntity<List<String>> listarJogos() {
        return ResponseEntity.ok(Arrays.asList("The Witcher 3", "Elden Ring", "Zelda: BotW", "Death Stranding"));
    }

    @PostMapping
    public ResponseEntity<String> criarJogo(@RequestBody String nomeDoJogo) {
        return ResponseEntity.status(HttpStatus.CREATED).body("Jogo '" + nomeDoJogo + "' adicionado com sucesso!");
    }
}
