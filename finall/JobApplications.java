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
@Table(name = "job_applications")
@NamedQueries({
    @NamedQuery(name = "JobApplications.findAll", query = "SELECT j FROM JobApplications j"),
    @NamedQuery(name = "JobApplications.findById", query = "SELECT j FROM JobApplications j WHERE j.id = :id"),
    @NamedQuery(name = "JobApplications.findByCompany", query = "SELECT j FROM JobApplications j WHERE j.company = :company"),
    @NamedQuery(name = "JobApplications.findByPositionName", query = "SELECT j FROM JobApplications j WHERE j.positionName = :positionName"),
    @NamedQuery(name = "JobApplications.findByApplicationStatus", query = "SELECT j FROM JobApplications j WHERE j.applicationStatus = :applicationStatus")})
public class JobApplications implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "company")
    private String company;
    @Column(name = "position_name")
    private String positionName;
    @Column(name = "application_status")
    private String applicationStatus;

    public JobApplications() {
    }

    public JobApplications(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
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
        if (!(object instanceof JobApplications)) {
            return false;
        }
        JobApplications other = (JobApplications) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "finall.JobApplications[ id=" + id + " ]";
    }
    
}
