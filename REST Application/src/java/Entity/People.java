/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pablo
 */
@Entity
@Table(name = "people")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "People.findAll", query = "SELECT p FROM People p")
    , @NamedQuery(name = "People.findById", query = "SELECT p FROM People p WHERE p.id = :id")
    , @NamedQuery(name = "People.findByName", query = "SELECT p FROM People p WHERE p.name = :name")
    , @NamedQuery(name = "People.findByLastname", query = "SELECT p FROM People p WHERE p.lastname = :lastname")
    , @NamedQuery(name = "People.findBySsn", query = "SELECT p FROM People p WHERE p.ssn = :ssn")
    , @NamedQuery(name = "People.findByBirthdate", query = "SELECT p FROM People p WHERE p.birthdate = :birthdate")})
public class People implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "lastname")
    private String lastname;
    @Basic(optional = false)
    @Column(name = "ssn")
    private String ssn;
    @Basic(optional = false)
    @Column(name = "birthdate")
    private String birthdate;

    public People() {
    }

    public People(Integer id) {
        this.id = id;
    }

    public People(Integer id, String name, String lastname, String ssn, String birthdate) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.ssn = ssn;
        this.birthdate = birthdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
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
        if (!(object instanceof People)) {
            return false;
        }
        People other = (People) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.People[ id=" + id + " ]";
    }
    
}
