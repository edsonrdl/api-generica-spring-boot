package com.asi.api_generica_spring_boot.domain.entities.task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class UserEntity {

    private String fullName;

    private String userName;

    private String password;

}



