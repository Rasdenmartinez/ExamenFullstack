package ms.Bodega.repository;
import ms.Bodega.entity.Articulos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticulosRepository extends JpaRepository<Articulos,Long> {

    Articulos findByCodigoBarra(String codigoBarra);

    List<Articulos> findByNombre(String nombre);
}
