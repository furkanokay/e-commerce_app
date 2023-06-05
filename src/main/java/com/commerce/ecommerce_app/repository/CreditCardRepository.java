package com.commerce.ecommerce_app.repository;

import com.commerce.ecommerce_app.entity.*;
import org.springframework.data.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepository extends CrudRepository<CreditCard, Long> {
}
