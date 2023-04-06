package org.example.app.services;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.app.entities.StuffInfo;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ReadService {

    public void readData(String path){

        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(path));

            List<StuffInfo> stuffInfo = gson.fromJson(reader,
                    new TypeToken<List<StuffInfo>>() {}.getType());

            AtomicInteger counter = new AtomicInteger(0);

            stuffInfo.forEach(info -> System.out.println(counter.incrementAndGet() + ") " +
                    info.getName() + " " +
                    info.getPosition() + " " +
                    info.getPhone()+ " " +
                    info.getSalary()
                    )
            );

            reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
