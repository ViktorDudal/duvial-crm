package com.gmail.viktordudal.crm.backend.repository;

import com.gmail.viktordudal.crm.backend.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
