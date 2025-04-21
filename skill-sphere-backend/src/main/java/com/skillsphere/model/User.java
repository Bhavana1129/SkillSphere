package com.skillsphere.model;
import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String role;
    private String profilePic;
    private boolean isVerified;
    private Date createdAt;

    @PrePersist
    public void prePersist() {
        createdAt = new Date();
    }
}