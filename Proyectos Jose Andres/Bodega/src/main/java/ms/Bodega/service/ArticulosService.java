package ms.Bodega.service;

import ms.Bodega.entity.Articulos;
import ms.Bodega.repository.ArticulosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticulosService {
    @Autowired
    ArticulosRepository articulosRepository;
    public Articulos agregarArticulo(Articulos articulo){

        return  articulosRepository.save(articulo);
    }
    public List<Articulos> obtenerTodosArticulos() {

        return articulosRepository.findAll();
    }
    public Articulos editarArticulo(Articulos articulos){
        Optional<Articulos> artOpt=articulosRepository.findById(articulos.getId());

        if(artOpt.isPresent()){
            return articulosRepository.save(articulos);
        }else{
            return null;
        }

    }
    public Optional<Articulos> buscarId(Long id){

        return articulosRepository.findById(id);
    }
    public Articulos buscarPorCodigoBarras(String codigoBarra) {
        return articulosRepository.findByCodigoBarra(codigoBarra);
    }
    public List<Articulos> buscarPorNombre(String nombre) {

        return articulosRepository.findByNombre(nombre);
    }
    public String eliminarArticulo(Long id) {
        Optional<Articulos> articulo = articulosRepository.findById(id);
        if (articulo.isPresent()) {
            articulosRepository.deleteById(id);
            return "El artículo con ID " + id + " ha sido eliminado exitosamente.";
        } else {
            return "No se encontró un artículo con ID " + id + ".";
        }

    }
}
