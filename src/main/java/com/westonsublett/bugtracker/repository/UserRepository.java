package com.westonsublett.bugtracker.repository;

import com.westonsublett.bugtracker.data.Users;
import org.springframework.data.r2dbc.repository.Modifying;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface UserRepository extends ReactiveCrudRepository<Users, Long> {

    @Query("SELECT id, email, username, password FROM user WHERE email = :email")
    Flux<Users> findByEmail(String email);

    @Query("SELECT id, email, username, password FROM user WHERE id = :id")
    Flux<Users> findById(long id);

    @Query("SELECT id, email, username, password FROM user WHERE id = :username")
    Flux<Users> findByUsername(String username);

    @Modifying
    @Query("DELETE FROM user WHERE email = :email")
    void deleteByEmail(String email);

}
