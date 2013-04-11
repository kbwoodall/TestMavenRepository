package com.sm.mavensqlutil.entity;
// Generated Jan 10, 2012 10:05:40 AM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AuthMessage generated by hbm2java
 */
@Entity
@Table(name="auth_message"
    ,catalog="django_ois"
)
public class AuthMessage  implements java.io.Serializable {


     private Integer id;
     private int userId;
     private String message;

    public AuthMessage() {
    }

    public AuthMessage(int userId, String message) {
       this.userId = userId;
       this.message = message;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="user_id", nullable=false)
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    @Column(name="message", nullable=false)
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }




}


