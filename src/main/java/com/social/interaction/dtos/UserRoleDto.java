package com.social.interaction.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRoleDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String identityNumber;
    private String role;
}
