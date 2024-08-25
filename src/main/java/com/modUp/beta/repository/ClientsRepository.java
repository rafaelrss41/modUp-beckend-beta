package com.modUp.beta.repository;


import com.modUp.beta.model.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClientsRepository  extends JpaRepository<Clients, Long> {


}
