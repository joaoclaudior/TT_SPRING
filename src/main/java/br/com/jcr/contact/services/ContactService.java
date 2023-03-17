package br.com.jcr.contact.services;

import br.com.jcr.contact.models.entities.ContactEntity;
import br.com.jcr.contact.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactService {
    @Autowired
    private ContactRepository repository;

    public List<ContactEntity> getContactByPhone(String phone){
        List<ContactEntity> contactEntities = repository.findByPhone(phone);
        return contactEntities;
    }

    public List<ContactEntity> getContacts(){
        return repository.findAll();
    }

    public List<ContactEntity> getContactByCep(String cep){
        return repository.findContactByCep(cep);
    }

    public List<ContactEntity> getContactByEmail(String email){
        return repository.findUserByEmail(email);
    }

}
