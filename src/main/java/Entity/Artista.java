/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Servidor
 */
@Entity
@Table(name = "artista")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Artista.findAll", query = "SELECT a FROM Artista a"),
    @NamedQuery(name = "Artista.findById", query = "SELECT a FROM Artista a WHERE a.id = :id"),
    @NamedQuery(name = "Artista.findByNombre", query = "SELECT a FROM Artista a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Artista.findByApellido", query = "SELECT a FROM Artista a WHERE a.apellido = :apellido"),
    @NamedQuery(name = "Artista.findByFecha", query = "SELECT a FROM Artista a WHERE a.fecha = :fecha"),
    @NamedQuery(name = "Artista.findByNacionalidad", query = "SELECT a FROM Artista a WHERE a.nacionalidad = :nacionalidad")})
public class Artista implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;
    
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    @Column(name = "nacionalidad")
    private String nacionalidad;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "artista")
    private List<Disco> disco;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "artista")
    private List<Cancion> cancion;

    public Artista() {
    }

    public Artista(String nombre, String apellido, Date fecha, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.nacionalidad = nacionalidad;
    }
    

    public Artista(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public List<Disco> getDisco() {
        return disco;
    }

    public void setDisco(List<Disco> disco) {
        this.disco = disco;
    }

    
    
}
