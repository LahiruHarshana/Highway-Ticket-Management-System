package lk.ijse.ticketway.userservice.service;

import lk.ijse.ticketway.userservice.dto.LoginDTO;
import lk.ijse.ticketway.userservice.dto.UserDTO;

/**
 * @author : L.H.J
 * @File: UserService
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-02, Wednesday
 **/
public interface UserService {
    void registerUser(UserDTO userDTO);

    boolean loginUser(LoginDTO loginDTO);

    void updateUser(UserDTO userDTO);
}
