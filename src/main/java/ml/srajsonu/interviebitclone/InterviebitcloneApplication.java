package ml.srajsonu.interviebitclone;

import ml.srajsonu.interviebitclone.models.User;
import ml.srajsonu.interviebitclone.utils.Constants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterviebitcloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterviebitcloneApplication.class, args);
        User user = new User("ARYAN", Constants.Gender.MALE);
        System.out.println(user.getName());
    }

}
