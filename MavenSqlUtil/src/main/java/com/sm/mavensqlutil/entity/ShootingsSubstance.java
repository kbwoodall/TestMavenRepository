package com.sm.mavensqlutil.entity;
// Generated Jan 10, 2012 10:05:40 AM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ShootingsSubstance generated by hbm2java
 */
@Entity
@Table(name="shootings_substance"
    ,catalog="django_ois"
)
public class ShootingsSubstance  implements java.io.Serializable {


     private Integer id;
     private String substance;

    public ShootingsSubstance() {
    }

    public ShootingsSubstance(String substance) {
       this.substance = substance;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="substance", nullable=false)
    public String getSubstance() {
        return this.substance;
    }
    
    public void setSubstance(String substance) {
        this.substance = substance;
    }




}


