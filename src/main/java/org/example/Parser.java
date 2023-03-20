package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Parser {
    public static Tickets getTicketsFromJson(String path){
        File file = new File(path);
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            Tickets tickets = objectMapper.readValue(file, Tickets.class);

            return tickets;
        }catch (IOException e){
            e.printStackTrace();
            return new Tickets();
        }
    }
}
