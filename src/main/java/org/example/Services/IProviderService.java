package org.example.Services;

import org.example.Dtos.ProviderDto;

import java.util.List;

public interface IProviderService {

    List<ProviderDto> getProviderByClientId(int client_id);
}
