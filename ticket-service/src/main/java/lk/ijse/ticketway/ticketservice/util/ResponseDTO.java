package lk.ijse.ticketway.ticketservice.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

/**
 * @author : L.H.J
 * @File: ResponseDTO
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-02, Wednesday
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {
    private int status;
    private String message;
    private HashMap<String, Object> data = new HashMap<>();

    public ResponseDTO(String message, int status) {
        this.message = message;
        this.status = status;
    }
}
