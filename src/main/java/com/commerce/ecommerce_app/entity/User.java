package com.commerce.ecommerce_app.entity;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.*;

@Entity
@Table(name ="users")
@Getter
@Setter
@NoArgsConstructor
@EnableAutoConfiguration
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="email", nullable = false)
    private String email;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name="role", nullable = false)
    private String role;
}
