package org.example.Repositories;

import org.example.Entities.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProviderRepository extends JpaRepository<Provider,Integer> {
    List<Provider> findByClientId(int client_id);
}
