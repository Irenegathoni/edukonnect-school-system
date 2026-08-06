package com.edukonnect.edukonnect_portal.entity;
import com.edukonnect.edukonnect_portal.enums.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Entity
@Table(name="users")
@Getter
@Setter


public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column
    private UUID id;

    @Column
    @NotBlank
    private String name;

    @Column(unique = true)
    @NotBlank
    @Email
    private String email;

    @Column(name="password_hash")
    @NotBlank
    private String passwordHash;

    @Column
    @Enumerated(EnumType.STRING)
    private Role role;

}
