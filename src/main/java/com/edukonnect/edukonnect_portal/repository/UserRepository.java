package com.edukonnect.edukonnect_portal.repository;
import com.edukonnect.edukonnect_portal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,UUID> {
    //FIND THE USER BY EMAIL
    Optional<User> findByEmail(String email);

    //check if the email exists during log in
    Boolean existsByEmail(String email);
}
