package com.example.API.jogos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/jogos")
public class JogoController {

    @GetMapping
    public ResponseEntity<List<String>> listarJogos() {
        return ResponseEntity.ok(Arrays.asList("The Witcher 3", "Elden Ring", "Zelda: BotW", "Death Stranding"));
    }
}
