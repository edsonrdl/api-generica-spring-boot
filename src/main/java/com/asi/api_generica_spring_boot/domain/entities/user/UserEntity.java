package com.asi.api_generica_spring_boot.domain.entities.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "\"TAB_USER\"")
public class UserEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="\"ID_USER\"")
    private Long idUser;

    @Column(name="\"FULL_NAME\"")
    private String fullName;

    @Column(name="\"USER_NAME\"")
    private String userName;

    @Column(name="\"PASSWORD\"")
    private String password;

}



