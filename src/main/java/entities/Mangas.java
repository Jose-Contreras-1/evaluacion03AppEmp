/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
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
@Table(name = "mangas")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Mangas.findAll", query = "SELECT m FROM Mangas m"),
    @NamedQuery(name = "Mangas.findById", query = "SELECT m FROM Mangas m WHERE m.id = :id"),
    @NamedQuery(name = "Mangas.findByNombre", query = "SELECT m FROM Mangas m WHERE m.nombre = :nombre"),
    @NamedQuery(name = "Mangas.findByEditorial", query = "SELECT m FROM Mangas m WHERE m.editorial = :editorial"),
    @NamedQuery(name = "Mangas.findByNumeroDeLibro", query = "SELECT m FROM Mangas m WHERE m.numeroDeLibro = :numeroDeLibro"),
    @NamedQuery(name = "Mangas.findByEscritor", query = "SELECT m FROM Mangas m WHERE m.escritor = :escritor")
})
public class Mangas implements Serializable {

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
    @Column(name = "numero_de_libro")
    private Integer numeroDeLibro;
    @Size(max = 2147483647)
    @Column(name = "escritor")
    private String escritor;

    public Mangas() {
    }

    public Mangas(Integer id) {
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

    public Integer getNumeroDeLibro() {
        return numeroDeLibro;
    }

    public void setNumeroDeLibro(Integer numeroDeLibro) {
        this.numeroDeLibro = numeroDeLibro;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
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
        if (!(object instanceof Mangas))
        {
            return false;
        }
        Mangas other = (Mangas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mangas[ id=" + id + " ]";
    }
    
}
