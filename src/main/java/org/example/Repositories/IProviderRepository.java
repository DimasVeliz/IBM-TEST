package org.example.Repositories;

import org.example.Entities.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProviderRepository extends JpaRepository<Provider,Integer> {
    List<Provider> findByClientId(int client_id);
}
