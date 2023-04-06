package org.example.app;

import org.example.app.services.ReadService;
import org.example.app.util.Constants;

public class App {

    public static void main(String[] args) {
        String path = Constants.BASE_PATH + "staff.json";
        ReadService reader = new ReadService();
        reader.readData(path);
    }
}
