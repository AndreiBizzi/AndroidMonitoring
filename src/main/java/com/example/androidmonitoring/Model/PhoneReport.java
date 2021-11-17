package com.example.androidmonitoring.Model;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "PhoneReport")
public class PhoneReport {
    @Id
    public String id;

    public User user;
    public Phone phone;
    public List<Hardware>  report;

    public PhoneReport() {}

    public PhoneReport(User user, Phone phone,List<Hardware>  report) {
        this.user = user;
        this.phone = phone;
        this.report = report;
    }
}
