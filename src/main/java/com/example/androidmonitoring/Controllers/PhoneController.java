package com.example.androidmonitoring.Controllers;

import com.example.androidmonitoring.Model.Phone;
import com.example.androidmonitoring.Services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(path = "/phone")
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    @GetMapping()
    public @ResponseBody
    List<Phone> getPhones()
    {

        List<Phone> phone = phoneService.toateTelefoanele();

        if(phone != null)
        {
            return phone;
        }
        else
        {
            return null;
        }

    }
    @GetMapping(path = "/{id}")
    public @ResponseBody Phone getPhone(@PathVariable Integer id)
    {

        Phone phone = phoneService.gasesteTelefon(id);

        if(phone != null)
        {
            return phone;
        }
        else
        {
            return null;
        }

    }

    @PostMapping()
    public List<Phone> addPhone(@RequestBody Phone phone)
    {
        phoneService.adaugaTelefon(phone);
        return phoneService.toateTelefoanele();
    }

    @DeleteMapping("/phone/{id}")
    public List<Phone> removePhone(@PathVariable Integer id, @RequestHeader("Authorization") String authorizationHeader){

        phoneService.stergeTelefon(id);
        return phoneService.toateTelefoanele();
    }

    @PutMapping("/phone/{id}")
    public ResponseEntity<?> updatePhone(@RequestBody Phone p, @PathVariable Integer id){

        try{
            Phone phoneUpdated=phoneService.updateTelefon(p,id);
            phoneService.adaugaTelefon(phoneUpdated);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
