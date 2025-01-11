package com.springboot.valid_exception.config.actuator;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Endpoint(id = "note")
public class NoteEndpoint {

    private Map<String, Object> noteContent = new HashMap<>;

    @ReadOperation
    public Map<String, Object> getNote(){
        return noteContent;
    }

    @WriteOperation
    public Map<String, Object> writeNote(String key, Object value){
        noteContent.put(key, value);
        return noteContent;
    }

    @DeleteOperation
    public Map<String, Object> deleteNote(String key){
        noteContent.remove(key);
        return noteContent;
    }

}
