package org.example.Executer;

import lombok.RequiredArgsConstructor;
import org.example.Dtos.ProviderDto;
import org.example.Services.IConsoleParserService;
import org.example.Services.IProviderService;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@RequiredArgsConstructor
public class ExecuteExercise {

    private final IConsoleParserService consoleParserService;

    private final IProviderService providerService;


    public boolean run(String []args){

        int client_id = consoleParserService.resolveClientId(args);
        List<ProviderDto> response= providerService.getProviderByClientId(client_id);
        return consoleParserService.saveToFile(response);
    }
}
