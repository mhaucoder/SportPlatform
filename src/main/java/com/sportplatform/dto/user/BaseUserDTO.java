package com.sportplatform.dto.user;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor
public class BaseUserDTO{
    @NotNull(message = "Fullname not null!")
    private String fullName;
    @NotNull(message = "Password not null!")
    private String password;
}
