package org.example.Repositories;

import org.example.Entities.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProviderRepository extends JpaRepository<Provider,Integer> {
}
