package com.commerce.ecommerce_app.entity;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.*;
import org.springframework.boot.autoconfigure.*;

import java.util.*;

@Entity
@Table(name="credit_card")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@EnableAutoConfiguration
public class CreditCard {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    @Column(name="card_number", nullable = false)
    private String cardNumber;

    @NonNull
    @Column(name="card_date", nullable = false)
    private String cardDate;

    @NonNull
    @Column(name="security_number", nullable = false)
    private int securityNumber;

    @ManyToOne(optional = false)
    @JoinColumn(name ="user_id", referencedColumnName = "id")
    private User ownerOfCard;

}
