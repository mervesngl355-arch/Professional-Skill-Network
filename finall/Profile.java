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
@Table(name = "profile")
@NamedQueries({
    @NamedQuery(name = "Profile.findAll", query = "SELECT p FROM Profile p"),
    @NamedQuery(name = "Profile.findById", query = "SELECT p FROM Profile p WHERE p.id = :id"),
    @NamedQuery(name = "Profile.findByFirstName", query = "SELECT p FROM Profile p WHERE p.firstName = :firstName"),
    @NamedQuery(name = "Profile.findByLastName", query = "SELECT p FROM Profile p WHERE p.lastName = :lastName"),
    @NamedQuery(name = "Profile.findByBirthDay", query = "SELECT p FROM Profile p WHERE p.birthDay = :birthDay"),
    @NamedQuery(name = "Profile.findByGender", query = "SELECT p FROM Profile p WHERE p.gender = :gender"),
    @NamedQuery(name = "Profile.findByEmail", query = "SELECT p FROM Profile p WHERE p.email = :email"),
    @NamedQuery(name = "Profile.findByPhone", query = "SELECT p FROM Profile p WHERE p.phone = :phone"),
    @NamedQuery(name = "Profile.findByLocation", query = "SELECT p FROM Profile p WHERE p.location = :location"),
    @NamedQuery(name = "Profile.findByAboutMe", query = "SELECT p FROM Profile p WHERE p.aboutMe = :aboutMe"),
    @NamedQuery(name = "Profile.findByPhotoPath", query = "SELECT p FROM Profile p WHERE p.photoPath = :photoPath")})
public class Profile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "birth_day")
    private String birthDay;
    @Column(name = "gender")
    private String gender;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "location")
    private String location;
    @Column(name = "about_me")
    private String aboutMe;
    @Column(name = "photo_path")
    private String photoPath;

    public Profile() {
    }

    public Profile(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
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
        if (!(object instanceof Profile)) {
            return false;
        }
        Profile other = (Profile) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "finall.Profile[ id=" + id + " ]";
    }
    
}
