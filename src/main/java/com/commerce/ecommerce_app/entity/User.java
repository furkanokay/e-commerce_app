package com.commerce.ecommerce_app.entity;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.*;
import java.util.List;

@Entity
@Table(name ="users")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@EnableAutoConfiguration
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @NonNull
    @Column(name="email", nullable = false)
    private String email;

    @NonNull
    @Column(name="password", nullable = false)
    private String password;

    @NonNull
    @Column(name="role", nullable = false)
    private String role;

    @OneToMany(mappedBy = "ownerOfCard")
    private List<CreditCard> creditCardList;
}
