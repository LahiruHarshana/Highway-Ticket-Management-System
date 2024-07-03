package lk.ijse.ticketway.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : L.H.J
 * @File: UserDTO
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-02, Wednesday
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String contact;
    private String address;
    private String nic;
}
