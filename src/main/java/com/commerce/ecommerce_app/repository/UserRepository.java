package com.commerce.ecommerce_app.repository;

import com.commerce.ecommerce_app.entity.*;
import org.springframework.data.repository.*;
import org.springframework.stereotype.*;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

}
