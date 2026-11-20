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
@Table(name = "education_skills")
@NamedQueries({
    @NamedQuery(name = "EducationSkills.findAll", query = "SELECT e FROM EducationSkills e"),
    @NamedQuery(name = "EducationSkills.findById", query = "SELECT e FROM EducationSkills e WHERE e.id = :id"),
    @NamedQuery(name = "EducationSkills.findByUniversityName", query = "SELECT e FROM EducationSkills e WHERE e.universityName = :universityName"),
    @NamedQuery(name = "EducationSkills.findByDegreeProgram", query = "SELECT e FROM EducationSkills e WHERE e.degreeProgram = :degreeProgram"),
    @NamedQuery(name = "EducationSkills.findByDepartment", query = "SELECT e FROM EducationSkills e WHERE e.department = :department"),
    @NamedQuery(name = "EducationSkills.findByGraduationYear", query = "SELECT e FROM EducationSkills e WHERE e.graduationYear = :graduationYear"),
    @NamedQuery(name = "EducationSkills.findByGpa", query = "SELECT e FROM EducationSkills e WHERE e.gpa = :gpa"),
    @NamedQuery(name = "EducationSkills.findByCurrentlyEnrolled", query = "SELECT e FROM EducationSkills e WHERE e.currentlyEnrolled = :currentlyEnrolled"),
    @NamedQuery(name = "EducationSkills.findByCertificatePath", query = "SELECT e FROM EducationSkills e WHERE e.certificatePath = :certificatePath"),
    @NamedQuery(name = "EducationSkills.findBySkillName", query = "SELECT e FROM EducationSkills e WHERE e.skillName = :skillName"),
    @NamedQuery(name = "EducationSkills.findBySkillCategory", query = "SELECT e FROM EducationSkills e WHERE e.skillCategory = :skillCategory"),
    @NamedQuery(name = "EducationSkills.findBySkillLevel", query = "SELECT e FROM EducationSkills e WHERE e.skillLevel = :skillLevel"),
    @NamedQuery(name = "EducationSkills.findByLanguage", query = "SELECT e FROM EducationSkills e WHERE e.language = :language"),
    @NamedQuery(name = "EducationSkills.findByLanguageLevel", query = "SELECT e FROM EducationSkills e WHERE e.languageLevel = :languageLevel"),
    @NamedQuery(name = "EducationSkills.findByPersonalTraits", query = "SELECT e FROM EducationSkills e WHERE e.personalTraits = :personalTraits"),
    @NamedQuery(name = "EducationSkills.findByClubMember", query = "SELECT e FROM EducationSkills e WHERE e.clubMember = :clubMember"),
    @NamedQuery(name = "EducationSkills.findByClubRole", query = "SELECT e FROM EducationSkills e WHERE e.clubRole = :clubRole"),
    @NamedQuery(name = "EducationSkills.findByProjectCount", query = "SELECT e FROM EducationSkills e WHERE e.projectCount = :projectCount")})
public class EducationSkills implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "university_name")
    private String universityName;
    @Column(name = "degree_program")
    private String degreeProgram;
    @Column(name = "department")
    private String department;
    @Column(name = "graduation_year")
    private Integer graduationYear;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "gpa")
    private Double gpa;
    @Column(name = "currently_enrolled")
    private Boolean currentlyEnrolled;
    @Column(name = "certificate_path")
    private String certificatePath;
    @Column(name = "skill_name")
    private String skillName;
    @Column(name = "skill_category")
    private String skillCategory;
    @Column(name = "skill_level")
    private String skillLevel;
    @Column(name = "language")
    private String language;
    @Column(name = "language_level")
    private String languageLevel;
    @Column(name = "personal_traits")
    private String personalTraits;
    @Column(name = "club_member")
    private Boolean clubMember;
    @Column(name = "club_role")
    private String clubRole;
    @Column(name = "project_count")
    private Integer projectCount;

    public EducationSkills() {
    }

    public EducationSkills(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public void setDegreeProgram(String degreeProgram) {
        this.degreeProgram = degreeProgram;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(Integer graduationYear) {
        this.graduationYear = graduationYear;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public Boolean getCurrentlyEnrolled() {
        return currentlyEnrolled;
    }

    public void setCurrentlyEnrolled(Boolean currentlyEnrolled) {
        this.currentlyEnrolled = currentlyEnrolled;
    }

    public String getCertificatePath() {
        return certificatePath;
    }

    public void setCertificatePath(String certificatePath) {
        this.certificatePath = certificatePath;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillCategory() {
        return skillCategory;
    }

    public void setSkillCategory(String skillCategory) {
        this.skillCategory = skillCategory;
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguageLevel() {
        return languageLevel;
    }

    public void setLanguageLevel(String languageLevel) {
        this.languageLevel = languageLevel;
    }

    public String getPersonalTraits() {
        return personalTraits;
    }

    public void setPersonalTraits(String personalTraits) {
        this.personalTraits = personalTraits;
    }

    public Boolean getClubMember() {
        return clubMember;
    }

    public void setClubMember(Boolean clubMember) {
        this.clubMember = clubMember;
    }

    public String getClubRole() {
        return clubRole;
    }

    public void setClubRole(String clubRole) {
        this.clubRole = clubRole;
    }

    public Integer getProjectCount() {
        return projectCount;
    }

    public void setProjectCount(Integer projectCount) {
        this.projectCount = projectCount;
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
        if (!(object instanceof EducationSkills)) {
            return false;
        }
        EducationSkills other = (EducationSkills) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "finall.EducationSkills[ id=" + id + " ]";
    }
    
}
