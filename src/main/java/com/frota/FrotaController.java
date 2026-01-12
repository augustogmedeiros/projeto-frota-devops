package com.frota;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrotaController {

    @GetMapping("/veiculo")
    public Veiculo getVeiculo() {
        return new Veiculo(1L, "Toyota Corolla", "ABC-1234", "DISPONIVEL");
    }
}
