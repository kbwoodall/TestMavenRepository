package com.sm.mavensqlutil.entity;
// Generated Jan 10, 2012 10:05:40 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ShootingsOfficerlist generated by hbm2java
 */
@Entity
@Table(name="shootings_officerlist"
    ,catalog="django_ois"
)
public class ShootingsOfficerlist  implements java.io.Serializable {


     private Integer id;
     private String firstName;
     private String middleName;
     private String lastName;
     private Date dob;
     private Integer raceId;
     private boolean stillOnForce;
     private String gender;

    public ShootingsOfficerlist() {
    }

	
    public ShootingsOfficerlist(String firstName, String middleName, String lastName, boolean stillOnForce, String gender) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.stillOnForce = stillOnForce;
        this.gender = gender;
    }
    public ShootingsOfficerlist(String firstName, String middleName, String lastName, Date dob, Integer raceId, boolean stillOnForce, String gender) {
       this.firstName = firstName;
       this.middleName = middleName;
       this.lastName = lastName;
       this.dob = dob;
       this.raceId = raceId;
       this.stillOnForce = stillOnForce;
       this.gender = gender;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="first_name", nullable=false, length=100)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    @Column(name="middle_name", nullable=false, length=100)
    public String getMiddleName() {
        return this.middleName;
    }
    
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    
    @Column(name="last_name", nullable=false, length=100)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="dob", length=10)
    public Date getDob() {
        return this.dob;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }
    
    @Column(name="race_id")
    public Integer getRaceId() {
        return this.raceId;
    }
    
    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }
    
    @Column(name="still_on_force", nullable=false)
    public boolean isStillOnForce() {
        return this.stillOnForce;
    }
    
    public void setStillOnForce(boolean stillOnForce) {
        this.stillOnForce = stillOnForce;
    }
    
    @Column(name="gender", nullable=false, length=1)
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }




}

