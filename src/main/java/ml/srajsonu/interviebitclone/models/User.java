package ml.srajsonu.interviebitclone.models;

import lombok.Getter;
import lombok.Setter;
import ml.srajsonu.interviebitclone.utils.Constants;
import java.util.UUID;

@Getter
@Setter
public class User {

    private UUID id;
    private String name;
    private Constants.Gender gender;



    public User(String name, Constants.Gender gender) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.gender = gender;
    }
}
