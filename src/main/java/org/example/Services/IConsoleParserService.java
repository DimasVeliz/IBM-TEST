package org.example.Services;

import org.example.Dtos.ProviderDto;

import java.util.List;

public interface IConsoleParserService {
    boolean saveToFile(List<ProviderDto> response);

    int resolveClientId(String[] args);
}
