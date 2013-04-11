package com.sm.mavensqlutil.entity;
// Generated Jan 10, 2012 10:05:40 AM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * AuthPermission generated by hbm2java
 */
@Entity
@Table(name="auth_permission"
    ,catalog="django_ois"
    , uniqueConstraints = @UniqueConstraint(columnNames={"content_type_id", "codename"}) 
)
public class AuthPermission  implements java.io.Serializable {


     private Integer id;
     private String name;
     private int contentTypeId;
     private String codename;

    public AuthPermission() {
    }

    public AuthPermission(String name, int contentTypeId, String codename) {
       this.name = name;
       this.contentTypeId = contentTypeId;
       this.codename = codename;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="name", nullable=false, length=50)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="content_type_id", nullable=false)
    public int getContentTypeId() {
        return this.contentTypeId;
    }
    
    public void setContentTypeId(int contentTypeId) {
        this.contentTypeId = contentTypeId;
    }
    
    @Column(name="codename", nullable=false, length=100)
    public String getCodename() {
        return this.codename;
    }
    
    public void setCodename(String codename) {
        this.codename = codename;
    }




}


