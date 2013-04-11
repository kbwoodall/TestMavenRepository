package com.sm.mavensqlutil.entity;
// Generated Jan 10, 2012 10:05:40 AM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DjangoSite generated by hbm2java
 */
@Entity
@Table(name="django_site"
    ,catalog="django_ois"
)
public class DjangoSite  implements java.io.Serializable {


     private Integer id;
     private String domain;
     private String name;

    public DjangoSite() {
    }

    public DjangoSite(String domain, String name) {
       this.domain = domain;
       this.name = name;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="domain", nullable=false, length=100)
    public String getDomain() {
        return this.domain;
    }
    
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    @Column(name="name", nullable=false, length=50)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}

