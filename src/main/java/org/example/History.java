package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class History {

    private List<Integer> history = new ArrayList<>();

    public void save (int i){
        history.add(i);
    }

    public List<Integer> getAll(){
        return history;
    }
}
