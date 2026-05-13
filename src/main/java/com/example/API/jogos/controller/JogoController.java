package com.example.API.jogos.controller;

@RestController
@RequestMapping("/api/jogos")
public class JogoController {

    @GetMapping
    public ResponseEntity<List<String>> listarJogos() {
        return ResponseEntity.ok(Arrays.asList("The Witcher 3", "Elden Ring", "Zelda: BotW", "Death Stranding"));
    }
}
