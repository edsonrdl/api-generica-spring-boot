package com.asi.api_generica_spring_boot.repositories;
import com.asi.api_generica_spring_boot.domain.entities.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {

}