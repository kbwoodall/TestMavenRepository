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
import javax.persistence.UniqueConstraint;

/**
 * AuthUser generated by hbm2java
 */
@Entity
@Table(name="auth_user"
    ,catalog="django_ois"
    , uniqueConstraints = @UniqueConstraint(columnNames="username") 
)
public class AuthUser  implements java.io.Serializable {


     private Integer id;
     private String username;
     private String firstName;
     private String lastName;
     private String email;
     private String password;
     private boolean isStaff;
     private boolean isActive;
     private boolean isSuperuser;
     private Date lastLogin;
     private Date dateJoined;

    public AuthUser() {
    }

    public AuthUser(String username, String firstName, String lastName, String email, String password, boolean isStaff, boolean isActive, boolean isSuperuser, Date lastLogin, Date dateJoined) {
       this.username = username;
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.password = password;
       this.isStaff = isStaff;
       this.isActive = isActive;
       this.isSuperuser = isSuperuser;
       this.lastLogin = lastLogin;
       this.dateJoined = dateJoined;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="username", unique=true, nullable=false, length=30)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    @Column(name="first_name", nullable=false, length=30)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    @Column(name="last_name", nullable=false, length=30)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    @Column(name="email", nullable=false, length=75)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="password", nullable=false, length=128)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name="is_staff", nullable=false)
    public boolean isIsStaff() {
        return this.isStaff;
    }
    
    public void setIsStaff(boolean isStaff) {
        this.isStaff = isStaff;
    }
    
    @Column(name="is_active", nullable=false)
    public boolean isIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    @Column(name="is_superuser", nullable=false)
    public boolean isIsSuperuser() {
        return this.isSuperuser;
    }
    
    public void setIsSuperuser(boolean isSuperuser) {
        this.isSuperuser = isSuperuser;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_login", nullable=false, length=19)
    public Date getLastLogin() {
        return this.lastLogin;
    }
    
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_joined", nullable=false, length=19)
    public Date getDateJoined() {
        return this.dateJoined;
    }
    
    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }




}


