/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Blackat
 */
@Entity
@Table(name = "comics")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Comics.findAll", query = "SELECT c FROM Comics c"),
    @NamedQuery(name = "Comics.findById", query = "SELECT c FROM Comics c WHERE c.id = :id"),
    @NamedQuery(name = "Comics.findByNombre", query = "SELECT c FROM Comics c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Comics.findByEditorial", query = "SELECT c FROM Comics c WHERE c.editorial = :editorial"),
    @NamedQuery(name = "Comics.findByEditorialPublicacion", query = "SELECT c FROM Comics c WHERE c.editorialPublicacion = :editorialPublicacion"),
    @NamedQuery(name = "Comics.findByNumeroDeLibro", query = "SELECT c FROM Comics c WHERE c.numeroDeLibro = :numeroDeLibro"),
    @NamedQuery(name = "Comics.findByEscritorIlustrador", query = "SELECT c FROM Comics c WHERE c.escritorIlustrador = :escritorIlustrador")
})
public class Comics implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 2147483647)
    @Column(name = "editorial")
    private String editorial;
    @Size(max = 2147483647)
    @Column(name = "editorial_publicacion")
    private String editorialPublicacion;
    @Column(name = "numero_de_libro")
    private BigInteger numeroDeLibro;
    @Size(max = 2147483647)
    @Column(name = "escritor_ilustrador")
    private String escritorIlustrador;

    public Comics() {
    }

    public Comics(Integer id) {
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

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEditorialPublicacion() {
        return editorialPublicacion;
    }

    public void setEditorialPublicacion(String editorialPublicacion) {
        this.editorialPublicacion = editorialPublicacion;
    }

    public BigInteger getNumeroDeLibro() {
        return numeroDeLibro;
    }

    public void setNumeroDeLibro(BigInteger numeroDeLibro) {
        this.numeroDeLibro = numeroDeLibro;
    }

    public String getEscritorIlustrador() {
        return escritorIlustrador;
    }

    public void setEscritorIlustrador(String escritorIlustrador) {
        this.escritorIlustrador = escritorIlustrador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comics))
        {
            return false;
        }
        Comics other = (Comics) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Comics[ id=" + id + " ]";
    }
    
}
