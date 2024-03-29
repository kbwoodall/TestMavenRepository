package com.sm.mavensqlutil.entity;
// Generated Jan 10, 2012 10:05:40 AM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ShootingsVideo generated by hbm2java
 */
@Entity
@Table(name="shootings_video"
    ,catalog="django_ois"
)
public class ShootingsVideo  implements java.io.Serializable {


     private Integer id;
     private int incidentId;
     private String videoId;

    public ShootingsVideo() {
    }

    public ShootingsVideo(int incidentId, String videoId) {
       this.incidentId = incidentId;
       this.videoId = videoId;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="incident_id", nullable=false)
    public int getIncidentId() {
        return this.incidentId;
    }
    
    public void setIncidentId(int incidentId) {
        this.incidentId = incidentId;
    }
    
    @Column(name="video_id", nullable=false, length=50)
    public String getVideoId() {
        return this.videoId;
    }
    
    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }




}


