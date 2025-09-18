package com.svaisser.lista006;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecomendacaoController {

    @GetMapping("/recomendar")
    public String recomendarDestino(
            @RequestParam String clima,
            @RequestParam String estilo
    ) {
        if (clima.equalsIgnoreCase("calor") && estilo.equalsIgnoreCase("natureza")) {
            return "Rio de Janeiro";
        } else if (clima.equalsIgnoreCase("calor") && estilo.equalsIgnoreCase("praia")) {
            return "Fernando de Noronha";
        } else if (clima.equalsIgnoreCase("frio") && estilo.equalsIgnoreCase("montanha")) {
            return "Gramado";
        } else if (clima.equalsIgnoreCase("frio") && estilo.equalsIgnoreCase("historia")) {
            return "Ouro Preto";
        } else {
            return "Destino não encontrado para essa combinação.";
        }
    }
}
