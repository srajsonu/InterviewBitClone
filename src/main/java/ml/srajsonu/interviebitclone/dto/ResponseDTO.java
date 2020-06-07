package ml.srajsonu.interviebitclone.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ResponseDTO<T> {

    private HttpStatus statusCode;
    private T data;

    public ResponseDTO(HttpStatus statusCode, T data) {
        this.statusCode = statusCode;
        this.data = data;
    }
}
