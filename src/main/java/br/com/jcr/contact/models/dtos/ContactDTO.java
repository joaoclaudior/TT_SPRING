package br.com.jcr.contact.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContactDTO {

    private String name;

    private String phoneNumber;

    private String email;
    private String address;

    private String cep;

    private String city;

    private String state;
}
