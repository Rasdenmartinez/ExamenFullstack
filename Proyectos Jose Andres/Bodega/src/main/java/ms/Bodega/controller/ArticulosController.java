package ms.Bodega.controller;
import ms.Bodega.entity.Articulos;
import ms.Bodega.service.ArticulosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/articulos")
public class ArticulosController {
   @Autowired
    ArticulosService articulosService;
   @PostMapping("/agregarArticulo")
    public Articulos agregarArticulos(@RequestBody Articulos articulos){
       return  articulosService.agregarArticulo(articulos);

   }
    @GetMapping("/obtenerTodosArticulos")
    public List<Articulos> obtenerTodosArticulos() {
        return articulosService.obtenerTodosArticulos();
    }

    @PutMapping("/actualizar")
    public Articulos editarArticulos(@RequestBody Articulos articulos){
       return articulosService.editarArticulo(articulos);
    }
    @GetMapping("/buscarid/{id}")
    public Optional<Articulos> buscarId(@PathVariable Long id){

       return articulosService.buscarId(id);
    }
    @GetMapping("/buscarcodigo/{codigoBarra}")
    public Articulos buscarPorCodigoBarras(@PathVariable String codigoBarra) {
        return articulosService.buscarPorCodigoBarras(codigoBarra);
    }
    @GetMapping("/buscarNombre/{nombre}")
    public List<Articulos> buscarPorNombre(@PathVariable String nombre) {
        return articulosService.buscarPorNombre(nombre);
    }
    @DeleteMapping("/eliminar/{id}")
    public String buscarPorNombre(@PathVariable Long id) {
       return articulosService.eliminarArticulo(id);
    }
}
