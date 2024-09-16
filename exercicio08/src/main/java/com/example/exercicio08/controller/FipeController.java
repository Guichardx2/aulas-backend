package com.example.exercicio08.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class FipeController {
    RestClient cliente = RestClient.create("https://parallelum.com.br");

    private static final HashMap<String, String> modeloCodigoMap = new HashMap<>();

    @GetMapping("/marcas")
    public List<String> getMarcaCodigoMap() {
        List<HashMap<String, String>> resposta = cliente
                .get()
                .uri("/fipe/api/v1/carros/marcas")
                .retrieve()
                .body(List.class);

        List<String> marcas = new ArrayList<>();
        if (resposta != null) {
            for (HashMap<String, String> marca : resposta) {
                marcas.add(marca.get("nome"));
                marcas.add(marca.get("codigo"));
            }
        }
        return marcas;
    }
    @GetMapping("/modelos")
    public List<String> getModeloCodigoMap(@RequestParam String marca) {
        List<HashMap<String, String>> resposta = cliente
                .get()
                .uri("/fipe/api/v1/carros/marcas/" + marca + "/modelos")
                .retrieve()
                .body(List.class);

        List<String> modelos = new ArrayList<>();
        if (resposta != null) {
            for (HashMap<String, String> modelo : resposta) {
                modelos.add(modelo.get("nome"));
                modelos.add(modelo.get("codigo"));
            }
        }
        return modelos;
    }
    @GetMapping("/anos")
    public List<String> getAnoCodigoMap(@RequestParam String marca, @RequestParam String modelo) {
        List<HashMap<String, String>> resposta = cliente
                .get()
                .uri("/fipe/api/v1/carros/marcas/" + marca + "/modelos/" + modelo + "/anos")
                .retrieve()
                .body(List.class);

        List<String> anos = new ArrayList<>();
        if (resposta != null) {
            for (HashMap<String, String> ano : resposta) {
                anos.add(ano.get("codigo"));
            }
        }
        return anos;
    }

    @PostMapping("/fipe")
    @ResponseBody
    public HashMap<String, String> valor(@RequestBody CarroRequest carroRequest) {
        HashMap<String, String> respostaRequisicao = new HashMap<>();

        HashMap<String, String> resposta = cliente
                .get()
                .uri("/fipe/api/v1/carros/marcas/" + carroRequest.getMarca() + "/modelos/" + carroRequest.getModelo() + "/anos/" + carroRequest.getAno())
                .retrieve()
                .body(HashMap.class);

        if (resposta != null) {
            respostaRequisicao.put("valor", resposta.get("Valor"));
            respostaRequisicao.put("mes", resposta.get("MesReferencia"));
        }
        return respostaRequisicao;
    }

}
