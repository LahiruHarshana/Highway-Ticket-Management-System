package lk.ijse.ticketway.userservice.controller;

import lk.ijse.ticketway.userservice.dto.LoginDTO;
import lk.ijse.ticketway.userservice.dto.UserDTO;
import lk.ijse.ticketway.userservice.service.UserService;
import lk.ijse.ticketway.userservice.util.ResponseDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @author : L.H.J
 * @File: UserController
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-02, Wednesday
 **/
@RestController
@RequestMapping("/actions")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseDTO login(@RequestBody LoginDTO loginDTO) {
        try {
            boolean b = userService.loginUser(loginDTO);
            return new ResponseDTO(b ? "Login Success" : "Login Failed", 200);
        } catch (Exception e) {
            return new ResponseDTO(e.getMessage(), 500);
        }
    }

    @PostMapping("/register")
    public ResponseDTO register(@RequestBody UserDTO userDTO) {
        try {
            userService.registerUser(userDTO);
            return new ResponseDTO("User Saved Successfully", 200);
        } catch (Exception e) {
            return new ResponseDTO(e.getMessage(), 500);
        }
    }

    @PutMapping("/update")
    public ResponseDTO update(@RequestBody UserDTO userDTO) {
        try{
            userService.updateUser(userDTO);
            return new ResponseDTO("User Updated Successfully", 200);
        } catch (Exception e) {
            return new ResponseDTO(e.getMessage(), 500);
        }
    }
}
