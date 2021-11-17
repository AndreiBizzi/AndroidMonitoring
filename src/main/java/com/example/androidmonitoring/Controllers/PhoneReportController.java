package com.example.androidmonitoring.Controllers;

import com.example.androidmonitoring.Model.PhoneReport;
import com.example.androidmonitoring.Services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/report")
public class PhoneReportController {
    @Autowired
    private ReportService reportService;

    @GetMapping()
    public @ResponseBody
    List<PhoneReport> allReports()
    {
        List<PhoneReport> listReports = reportService.allReports();
        if(listReports != null)
        {
            return listReports;
        }
        else
        {
            return null;
        }
    }

}
