package org.example.Services.Impl;

import org.example.Dtos.ProviderDto;
import org.example.Services.IConsoleParserService;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

@Service
public class ConsoleParserServiceImpl implements IConsoleParserService {

    @Override
    public boolean saveToFile(List<ProviderDto> response) {
        String FILE_NAME = "response.txt";
        File file = new File(FILE_NAME);
        try {

            FileWriter writer = new FileWriter(file);
            String HEADERS = "Id,Name,Registration Date, Client Id\n";
            writer.write(HEADERS);
            for (ProviderDto provider : response) {
                writer.write(provider.getName() + "," + provider.getRegistration_date() + "," + provider.getClient_id() + "\n");
            }

            writer.close();
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    @Override
    public int resolveClientId(String[] args) {
        if(args.length!=1)return -1;
        return Integer.parseInt(args[0]);
    }
}
