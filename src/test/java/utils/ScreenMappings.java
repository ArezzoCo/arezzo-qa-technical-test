package utils;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.io.*;

public class ScreenMappings<T extends Generic> {

    public Generic getJson(String screen) {

        StringBuilder fileName = new StringBuilder();
        fileName.append("src/test/resources/elements").append("/").append(screen).append(".json");

        Generic json = null;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName.toString()), "UTF8"))) {
            Gson gson = new Gson();
            JsonElement element = gson.fromJson(bufferedReader, JsonElement.class);
            element = element.getAsJsonObject().get(screen);
            json = gson.fromJson(element, Generic.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }
}
