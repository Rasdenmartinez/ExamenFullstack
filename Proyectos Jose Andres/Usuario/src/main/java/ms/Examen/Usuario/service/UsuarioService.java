package ms.Examen.Usuario.service;

import ms.Examen.Usuario.entity.Usuario;
import ms.Examen.Usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public String login(String login, String password) {
        Usuario usuario = usuarioRepository.findByLogin(login);
        String contraseniaencrptada=usuario.getPassword();
        boolean coparacionContrasenias=passwordEncoder.matches(password,contraseniaencrptada);
        if (usuario != null) {
            if (coparacionContrasenias) {
                if (usuario.getFechaVigencia() == null || !usuario.getFechaVigencia().before(new Date())) {
                    return "Bienvenido, " + usuario.getNombre() + "! \n" +
                            "Opciones:\n" +
                            "1. Gestión de Usuarios\n" +
                            "2. Tablero de Usuarios";
                } else {
                    return "Acceso denegado. La fecha de caducidad ha vencido.";
                }
            } else {
                return "Acceso denegado. Contraseña incorrecta.";
            }
        } else {
            return "Acceso denegado. Usuario no encontrado.";
        }
    }

    public String agregarUsuario(Usuario usuario) {
        String password=usuario.getPassword();
        String passwordEcriptado=passwordEncoder.encode(password);
        usuario.setPassword(passwordEcriptado);
        String login=usuario.getLogin();
        if (usuarioRepository.findByLogin(login)==null){
            usuarioRepository.save(usuario);
        }else{
            return "Usuario Existentente";
        }
        return null;
    }

    public String eliminarUsuario(String login) {
        Optional<Usuario> usuarioExistente = usuarioRepository.findById(login);
        if (usuarioExistente.isPresent()) {
            usuarioRepository.deleteById(login);
            return "El usuario " + login + " fue eliminado";
        } else {
            return "El usuario " + login + " no existe";
        }
    }

    public String modificarUsuario(Usuario usuario) {
        String password=usuario.getPassword();
        String passwordEcriptado=passwordEncoder.encode(password);
        usuario.setPassword(passwordEcriptado);
        Optional<Usuario> usuarioExistente = usuarioRepository.findById(usuario.getLogin());
        if (usuarioExistente.isPresent()) {

            usuarioRepository.save(usuario);
        }else {
            return "El usuario "+usuario.getLogin()+" no existe";
        }
        return null;
    }

    public Usuario obtenerUsuario(String login) {
        return usuarioRepository.findById(login).orElse(null);
    }

    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepository.findAll();
    }
    public List<Usuario> buscarPorEstatus(String status) {
        return usuarioRepository.findByStatus(status);
    }
    public List<Usuario> buscarPorNombre(String nombre) {
        return usuarioRepository.findByNombre(nombre);
    }
    public List<Usuario> buscarPorFechaInicial(String fechaAlta) {
        return usuarioRepository.findByFechaAlta(fechaAlta);
    }
    public List<Usuario> buscarPorFechaFinal(String fechaBaja) {
        return usuarioRepository.findByFechaBaja(fechaBaja);
    }
}
