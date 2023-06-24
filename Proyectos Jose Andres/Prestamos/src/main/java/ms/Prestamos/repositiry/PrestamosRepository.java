package ms.Prestamos.repositiry;

import ms.Prestamos.entity.Prestamos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PrestamosRepository extends JpaRepository<Prestamos,Long> {

    List<Prestamos> findByClienteAndEstadoIsFalse(String cliente);

}
