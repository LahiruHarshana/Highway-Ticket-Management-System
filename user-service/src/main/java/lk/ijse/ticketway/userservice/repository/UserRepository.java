package lk.ijse.ticketway.userservice.repository;

import lk.ijse.ticketway.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : L.H.J
 * @File: UserRepository
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-02, Wednesday
 **/
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
}
