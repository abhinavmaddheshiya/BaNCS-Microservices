package com.agt.accounts.repository;

import com.agt.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByMobileNumber(String mobileNumber);
//    Optional<Customer> findByEmailAndMobileNumber(String email, String mobileNumber);
    // this method query "Select * from xyz where Email=email and MobileNumber = mobileNumber" using Spring Data JPA framework
}
