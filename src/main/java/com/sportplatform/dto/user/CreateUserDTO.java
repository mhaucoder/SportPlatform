package com.sportplatform.dto.user;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor
public class CreateUserDTO extends BaseUserDTO{
    @NotNull(message = "Username not null!")
    private String username;
}
