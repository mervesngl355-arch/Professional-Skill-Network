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
@Table(name = "network_requests")
@NamedQueries({
    @NamedQuery(name = "NetworkRequests.findAll", query = "SELECT n FROM NetworkRequests n"),
    @NamedQuery(name = "NetworkRequests.findById", query = "SELECT n FROM NetworkRequests n WHERE n.id = :id"),
    @NamedQuery(name = "NetworkRequests.findByProfessionalName", query = "SELECT n FROM NetworkRequests n WHERE n.professionalName = :professionalName"),
    @NamedQuery(name = "NetworkRequests.findByCompany", query = "SELECT n FROM NetworkRequests n WHERE n.company = :company"),
    @NamedQuery(name = "NetworkRequests.findByPositionName", query = "SELECT n FROM NetworkRequests n WHERE n.positionName = :positionName"),
    @NamedQuery(name = "NetworkRequests.findByRequestStatus", query = "SELECT n FROM NetworkRequests n WHERE n.requestStatus = :requestStatus")})
public class NetworkRequests implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "professional_name")
    private String professionalName;
    @Column(name = "company")
    private String company;
    @Column(name = "position_name")
    private String positionName;
    @Column(name = "request_status")
    private String requestStatus;

    public NetworkRequests() {
    }

    public NetworkRequests(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProfessionalName() {
        return professionalName;
    }

    public void setProfessionalName(String professionalName) {
        this.professionalName = professionalName;
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

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
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
        if (!(object instanceof NetworkRequests)) {
            return false;
        }
        NetworkRequests other = (NetworkRequests) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "finall.NetworkRequests[ id=" + id + " ]";
    }
    
}
