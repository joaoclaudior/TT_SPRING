package br.com.jcr.contact.resources;

import br.com.jcr.contact.helpers.ModelMapper;
import br.com.jcr.contact.models.dtos.ContactDTO;
import br.com.jcr.contact.models.entities.ContactEntity;
import br.com.jcr.contact.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/contact")
public class ContactResource {
    @Autowired
    private ContactService service;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public List<ContactDTO> getContacts(){
        List<ContactEntity> contactEntities = service.getContacts();
        return contactEntities.stream().map(ModelMapper::contactEntityToDTO).collect(Collectors.toList());
    }
    @GetMapping("/phone/{phone}")
    public List<ContactDTO> getContactByPhone(@PathVariable String phone){
        List<ContactEntity> contactEntities = service.getContactByPhone(phone);
        return contactEntities.stream().map(ModelMapper::contactEntityToDTO).collect(Collectors.toList());
    }

    @GetMapping("/cep/{cep}")
    public List<ContactDTO> getContactByCep(@PathVariable String cep){
        List<ContactEntity> contactEntities = service.getContactByCep(cep);
        return contactEntities.stream().map(ModelMapper::contactEntityToDTO).collect(Collectors.toList());
    }

    @GetMapping("/")
    public List<ContactDTO> getContactByEmail(@RequestParam String email){
        List<ContactEntity> contactEntities = service.getContactByEmail(email);
        return contactEntities.stream().map(ModelMapper::contactEntityToDTO).collect(Collectors.toList());
    }


}
