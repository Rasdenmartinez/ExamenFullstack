package ms.Prestamos.repositiry;

import ms.Prestamos.entity.Tasas;
import ms.Prestamos.service.PrestamosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface TasasRepository extends JpaRepository<Tasas,Long> {
    @Query(value = "SELECT TASA_INTERES FROM tasas WHERE :plazoEntero BETWEEN PLAZO_MIN AND PLAZO_MAX", nativeQuery = true)
    Double findTasaInteresByRange(@Param("plazoEntero") Integer plazoEntero);


}
