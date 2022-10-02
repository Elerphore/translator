package ru.lu.translator;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.lu.data.Word;

import java.io.InputStream;

public class WordManager {
    public static Word[] readJsonFile() {
        try(InputStream in=Thread.currentThread().getContextClassLoader().getResourceAsStream("es-words.json")){
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(in, Word[].class);
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}
