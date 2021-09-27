package repository;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<model.Usuario.ModelUsuario, Integer> {
}
