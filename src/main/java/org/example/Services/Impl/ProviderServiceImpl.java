package org.example.Services.Impl;

import org.example.Dtos.ProviderDto;
import org.example.Entities.Provider;
import org.example.Repositories.IProviderRepository;
import org.example.Services.IProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ProviderServiceImpl implements IProviderService {

    @Autowired
    private IProviderRepository providerRepository;

    @Override
    public List<ProviderDto> getProviderByClientId(int client_id) {
        List<Provider> response = providerRepository.findByClientId(client_id);
        return response.isEmpty()?
                Collections.emptyList():
                response
                        .stream()
                        .map(provider -> new ProviderDto(provider.getName(),
                                provider.getRegistration_date(),
                                provider.getClientId()))
                        .toList();
    }
}
