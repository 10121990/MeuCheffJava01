package controller;

import model.Usuario.ModelUsuario;
import org.apache.coyote.Response;
import org.aspectj.apache.bcel.Repository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.UsuarioRepository;

@RestController
public class UsuarioController {
    private UsuarioRepository repository;
    private Integer codigo;
    private ModelUsuario Usuario;


    @GetMapping(path = "/api/usuario/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer Código){
        return repository.findById(codigo).
                map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());

    }
    @PostMapping (path = "/api/usuario/salvar")
    public ModelUsuario salvar(@RequestBody ModelUsuario usuario){
        return repository.save(Usuario);
    }
}
