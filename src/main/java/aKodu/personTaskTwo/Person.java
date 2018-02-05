package aKodu.personTaskTwo;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
public class Person implements Saveable{
    private String firstName;
    private String secondName;


    @Override
    public boolean save() {

        return false;
    }
}
