package br.com.jcr.contact.helpers;

import br.com.jcr.contact.models.dtos.ContactDTO;
import br.com.jcr.contact.models.entities.ContactEntity;

public class ModelMapper {
    public static ContactDTO contactEntityToDTO(ContactEntity contactEntity){
        return ContactDTO.builder()
                .name(contactEntity.getName())
                .phoneNumber(contactEntity.getPhone())
                .email(contactEntity.getEmail())
                .cep(contactEntity.getCep())
                .address(contactEntity.getAddress())
                .city(contactEntity.getCity())
                .state(contactEntity.getState())
                .build();
    }
}
