package br.com.jcr.contact.repositories;

import br.com.jcr.contact.models.entities.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContactRepository extends JpaRepository<ContactEntity, Long> {
    List<ContactEntity> findByPhone (String phone);

    @Query("SELECT u FROM ContactEntity u WHERE u.cep = :cep")
    List<ContactEntity> findContactByCep(String cep);

    @Query(
            value = "SELECT * FROM TB_CONTACT u WHERE u.email = :email",
            nativeQuery = true)
    List<ContactEntity> findUserByEmail(String email);
}
