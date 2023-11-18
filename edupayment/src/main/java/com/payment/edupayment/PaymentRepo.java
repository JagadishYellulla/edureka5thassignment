package com.payment.edupayment;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PaymentRepo extends JpaRepository<Payment, String> {
    //Optional<Payment> findBystudentName(String studentName);
    Optional<Payment> findByStudentName(String studentName);
}