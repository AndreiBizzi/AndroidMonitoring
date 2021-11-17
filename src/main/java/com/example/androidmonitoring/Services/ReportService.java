package com.example.androidmonitoring.Services;

import com.example.androidmonitoring.Model.PhoneReport;
import com.example.androidmonitoring.Repositories.PhoneReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ReportService {
    @Autowired
    private PhoneReportRepository phoneReportRepository;

    public List<PhoneReport> allReports()
    {
        return phoneReportRepository.findAll();
    }
}
