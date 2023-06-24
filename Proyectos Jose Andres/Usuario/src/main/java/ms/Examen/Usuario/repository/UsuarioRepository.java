package ms.Examen.Usuario.repository;

import ms.Examen.Usuario.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,String> {

    Usuario findByLogin(String login);

    List<Usuario> findByStatus(String status);

    List<Usuario> findByNombre(String nombre);

    List<Usuario> findByFechaAlta(String fechaAlta);

    List<Usuario> findByFechaBaja(String fechaBaja);
}
