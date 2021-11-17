package com.example.androidmonitoring.Services;

import com.example.androidmonitoring.Model.Phone;
import com.example.androidmonitoring.Repositories.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PhoneService {
    @Autowired
    private PhoneRepository phoneRepository;

    public List<Phone> toateTelefoanele() {
        return phoneRepository.findAll();
    }
    public Phone gasesteTelefon(Integer id ) {
        return phoneRepository.findById(id).get();
    }
    public Phone adaugaTelefon(Phone phone ) {
        return phoneRepository.save(phone);
    }
    public void stergeTelefon(Integer id){
        phoneRepository.deleteById(id);
    }
    public Phone updateTelefon(Phone p,Integer id){
        Optional<Phone> telefonExistent=phoneRepository.findById(id);
        if(telefonExistent.isPresent()){
            Phone updatePhone= new Phone();
            updatePhone.setId(telefonExistent.get().getId());
            updatePhone.setModel(p.getModel());
            updatePhone.setProducator(p.getProducator());
            updatePhone.setVersiuneAndroid(p.getVersiuneAndroid());
            return updatePhone;
        }
        return telefonExistent.get();
    }

}
