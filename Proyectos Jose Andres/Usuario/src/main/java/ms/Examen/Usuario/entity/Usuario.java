package ms.Examen.Usuario.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "USUARIO")
public class Usuario {
    @Id
    @Column(name = "LOGIN")
    private String login;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "CLIENTE")
    private Float cliente;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "FECHAALTA")
    private String fechaAlta;

    @Column(name = "FECHABAJA")
    private String fechaBaja;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "INTENTOS")
    private Float intentos;

    @Column(name = "FECHAREVOCADO")
    private Date fechaRevocado;

    @Column(name = "FECHA_VIGENCIA")
    private Date fechaVigencia;

    @Column(name = "NO_ACCESO")
    private Integer noAcceso;

    @Column(name = "APELLIDO_PATERNO")
    private String apellidoPaterno;

    @Column(name = "APELLIDO_MATERNO")
    private String apellidoMaterno;

    @Column(name = "AREA")
    private Integer area;

    @Column(name = "FECHAMODIFICACION")
    private Date fechaModificacion;

    public Usuario() {
    }

    public Usuario(String login, String password, String nombre, Float cliente, String email, String fechaAlta, String fechaBaja, String status, Float intentos, Date fechaRevocado, Date fechaVigencia, Integer noAcceso, String apellidoPaterno, String apellidoMaterno, Integer area, Date fechaModificacion) {
        this.login = login;
        this.password = password;
        this.nombre = nombre;
        this.cliente = cliente;
        this.email = email;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.status = status;
        this.intentos = intentos;
        this.fechaRevocado = fechaRevocado;
        this.fechaVigencia = fechaVigencia;
        this.noAcceso = noAcceso;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.area = area;
        this.fechaModificacion = fechaModificacion;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getCliente() {
        return cliente;
    }

    public void setCliente(Float cliente) {
        this.cliente = cliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(String fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Float getIntentos() {
        return intentos;
    }

    public void setIntentos(Float intentos) {
        this.intentos = intentos;
    }

    public Date getFechaRevocado() {
        return fechaRevocado;
    }

    public void setFechaRevocado(Date fechaRevocado) {
        this.fechaRevocado = fechaRevocado;
    }

    public Date getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(Date fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    public Integer getNoAcceso() {
        return noAcceso;
    }

    public void setNoAcceso(Integer noAcceso) {
        this.noAcceso = noAcceso;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cliente=" + cliente +
                ", email='" + email + '\'' +
                ", fechaAlta=" + fechaAlta +
                ", fechaBaja=" + fechaBaja +
                ", status='" + status + '\'' +
                ", intentos=" + intentos +
                ", fechaRevocado=" + fechaRevocado +
                ", fechaVigencia=" + fechaVigencia +
                ", noAcceso=" + noAcceso +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", area=" + area +
                ", fechaModificacion=" + fechaModificacion +
                '}';
    }
}