package com.example.androidmonitoring.Repositories;

import com.example.androidmonitoring.Model.PhoneReport;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhoneReportRepository extends MongoRepository<PhoneReport, String> {
}
