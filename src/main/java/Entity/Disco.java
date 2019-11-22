/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Servidor
 */
@Entity
@Table
@NamedQueries({
    @NamedQuery(name = "Disco.findAll", query = "SELECT d FROM Disco d"),
    @NamedQuery(name = "Disco.findByIdDisco", query = "SELECT d FROM Disco d WHERE d.idDisco = :idDisco"),
    @NamedQuery(name = "Disco.findByNombre", query = "SELECT d FROM Disco d WHERE d.nombre = :nombre"),
    @NamedQuery(name = "Disco.findByCaratula", query = "SELECT d FROM Disco d WHERE d.caratula = :caratula"),
    @NamedQuery(name = "Disco.findByIdArtista", query = "SELECT d FROM Disco d WHERE d.artista.id = :idArtista")})
public class Disco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Disco",columnDefinition = "serial")
    private Integer idDisco;
    
    @Column
    private String nombre;
     
   
    @Column(name = "caratula")
    private String caratula;
    
    @ManyToOne
    @JoinColumn(name = "id_artista", nullable = false)
    private Artista artista;

    public Disco() {
    }

    public Disco(Integer idDisco) {
        this.idDisco = idDisco;
    }

    public Integer getIdDisco() {
        return idDisco;
    }

    public void setIdDisco(Integer idDisco) {
        this.idDisco = idDisco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCaratula() {
        return caratula;
    }

    public void setCaratula(String caratula) {
        this.caratula = caratula;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }


    
    
}
