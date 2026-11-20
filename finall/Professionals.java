/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finall;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Merve ŞENGÜL
 */
@Entity
@Table(name = "professionals")
@NamedQueries({
    @NamedQuery(name = "Professionals.findAll", query = "SELECT p FROM Professionals p"),
    @NamedQuery(name = "Professionals.findById", query = "SELECT p FROM Professionals p WHERE p.id = :id"),
    @NamedQuery(name = "Professionals.findByName", query = "SELECT p FROM Professionals p WHERE p.name = :name"),
    @NamedQuery(name = "Professionals.findByUniversity", query = "SELECT p FROM Professionals p WHERE p.university = :university"),
    @NamedQuery(name = "Professionals.findByCompany", query = "SELECT p FROM Professionals p WHERE p.company = :company"),
    @NamedQuery(name = "Professionals.findByPosition", query = "SELECT p FROM Professionals p WHERE p.position = :position"),
    @NamedQuery(name = "Professionals.findByStatus", query = "SELECT p FROM Professionals p WHERE p.status = :status"),
    @NamedQuery(name = "Professionals.findByDepartment", query = "SELECT p FROM Professionals p WHERE p.department = :department"),
    @NamedQuery(name = "Professionals.findByDegreeProgram", query = "SELECT p FROM Professionals p WHERE p.degreeProgram = :degreeProgram"),
    @NamedQuery(name = "Professionals.findBySkill1", query = "SELECT p FROM Professionals p WHERE p.skill1 = :skill1"),
    @NamedQuery(name = "Professionals.findBySkill2", query = "SELECT p FROM Professionals p WHERE p.skill2 = :skill2"),
    @NamedQuery(name = "Professionals.findBySkill3", query = "SELECT p FROM Professionals p WHERE p.skill3 = :skill3"),
    @NamedQuery(name = "Professionals.findByLanguage1", query = "SELECT p FROM Professionals p WHERE p.language1 = :language1"),
    @NamedQuery(name = "Professionals.findByLanguageLevel1", query = "SELECT p FROM Professionals p WHERE p.languageLevel1 = :languageLevel1"),
    @NamedQuery(name = "Professionals.findByTrait1", query = "SELECT p FROM Professionals p WHERE p.trait1 = :trait1"),
    @NamedQuery(name = "Professionals.findByAbout", query = "SELECT p FROM Professionals p WHERE p.about = :about")})
public class Professionals implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "university")
    private String university;
    @Column(name = "company")
    private String company;
    @Column(name = "position")
    private String position;
    @Column(name = "status")
    private String status;
    @Column(name = "department")
    private String department;
    @Column(name = "degree_program")
    private String degreeProgram;
    @Column(name = "skill1")
    private String skill1;
    @Column(name = "skill2")
    private String skill2;
    @Column(name = "skill3")
    private String skill3;
    @Column(name = "language1")
    private String language1;
    @Column(name = "language_level1")
    private String languageLevel1;
    @Column(name = "trait1")
    private String trait1;
    @Column(name = "about")
    private String about;

    public Professionals() {
    }

    public Professionals(Integer id) {
        this.id = id;
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

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public void setDegreeProgram(String degreeProgram) {
        this.degreeProgram = degreeProgram;
    }

    public String getSkill1() {
        return skill1;
    }

    public void setSkill1(String skill1) {
        this.skill1 = skill1;
    }

    public String getSkill2() {
        return skill2;
    }

    public void setSkill2(String skill2) {
        this.skill2 = skill2;
    }

    public String getSkill3() {
        return skill3;
    }

    public void setSkill3(String skill3) {
        this.skill3 = skill3;
    }

    public String getLanguage1() {
        return language1;
    }

    public void setLanguage1(String language1) {
        this.language1 = language1;
    }

    public String getLanguageLevel1() {
        return languageLevel1;
    }

    public void setLanguageLevel1(String languageLevel1) {
        this.languageLevel1 = languageLevel1;
    }

    public String getTrait1() {
        return trait1;
    }

    public void setTrait1(String trait1) {
        this.trait1 = trait1;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
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
        if (!(object instanceof Professionals)) {
            return false;
        }
        Professionals other = (Professionals) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "finall.Professionals[ id=" + id + " ]";
    }
    
}
