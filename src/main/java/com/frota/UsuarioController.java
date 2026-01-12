package com.frota;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class UsuarioController {

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios() {
        return Arrays.asList(
            new Usuario(1L, "Augusto", "augusto@unb.br", "ADMIN"),
            new Usuario(2L, "Professor UnB", "faculdade@unb.br", "MOTORISTA")
        );
    }
}
