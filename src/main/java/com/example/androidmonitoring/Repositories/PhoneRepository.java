package com.example.androidmonitoring.Repositories;

import com.example.androidmonitoring.Model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Integer> {
}
