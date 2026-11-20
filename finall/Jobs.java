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
@Table(name = "jobs")
@NamedQueries({
    @NamedQuery(name = "Jobs.findAll", query = "SELECT j FROM Jobs j"),
    @NamedQuery(name = "Jobs.findById", query = "SELECT j FROM Jobs j WHERE j.id = :id"),
    @NamedQuery(name = "Jobs.findByDepartment", query = "SELECT j FROM Jobs j WHERE j.department = :department"),
    @NamedQuery(name = "Jobs.findByCompany", query = "SELECT j FROM Jobs j WHERE j.company = :company"),
    @NamedQuery(name = "Jobs.findByPositionName", query = "SELECT j FROM Jobs j WHERE j.positionName = :positionName"),
    @NamedQuery(name = "Jobs.findByWorkMode", query = "SELECT j FROM Jobs j WHERE j.workMode = :workMode"),
    @NamedQuery(name = "Jobs.findByEmploymentType", query = "SELECT j FROM Jobs j WHERE j.employmentType = :employmentType"),
    @NamedQuery(name = "Jobs.findByMatchScore", query = "SELECT j FROM Jobs j WHERE j.matchScore = :matchScore"),
    @NamedQuery(name = "Jobs.findByStatus", query = "SELECT j FROM Jobs j WHERE j.status = :status"),
    @NamedQuery(name = "Jobs.findBySalary", query = "SELECT j FROM Jobs j WHERE j.salary = :salary"),
    @NamedQuery(name = "Jobs.findByExperienceLevel", query = "SELECT j FROM Jobs j WHERE j.experienceLevel = :experienceLevel"),
    @NamedQuery(name = "Jobs.findByRequiredSkills", query = "SELECT j FROM Jobs j WHERE j.requiredSkills = :requiredSkills"),
    @NamedQuery(name = "Jobs.findByCity", query = "SELECT j FROM Jobs j WHERE j.city = :city"),
    @NamedQuery(name = "Jobs.findByJobDetails", query = "SELECT j FROM Jobs j WHERE j.jobDetails = :jobDetails")})
public class Jobs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "department")
    private String department;
    @Column(name = "company")
    private String company;
    @Column(name = "position_name")
    private String positionName;
    @Column(name = "work_mode")
    private String workMode;
    @Column(name = "employment_type")
    private String employmentType;
    @Column(name = "match_score")
    private Integer matchScore;
    @Column(name = "status")
    private String status;
    @Column(name = "salary")
    private String salary;
    @Column(name = "experience_level")
    private String experienceLevel;
    @Column(name = "required_skills")
    private String requiredSkills;
    @Column(name = "city")
    private String city;
    @Column(name = "job_details")
    private String jobDetails;

    public Jobs() {
    }

    public Jobs(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getWorkMode() {
        return workMode;
    }

    public void setWorkMode(String workMode) {
        this.workMode = workMode;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public Integer getMatchScore() {
        return matchScore;
    }

    public void setMatchScore(Integer matchScore) {
        this.matchScore = matchScore;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public String getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(String requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJobDetails() {
        return jobDetails;
    }

    public void setJobDetails(String jobDetails) {
        this.jobDetails = jobDetails;
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
        if (!(object instanceof Jobs)) {
            return false;
        }
        Jobs other = (Jobs) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "finall.Jobs[ id=" + id + " ]";
    }
    
}
