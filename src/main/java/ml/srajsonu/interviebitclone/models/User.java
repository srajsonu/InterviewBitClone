package ml.srajsonu.interviebitclone.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

@Getter
@Setter
public class User {

    private UUID id;
    private String name;
    private Gender gender;

    User(String name, Gender gender) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.gender = gender;
    }
}
