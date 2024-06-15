package com.sportplatform.dto.user;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor
public class UpdateUserDTO extends BaseUserDTO{
    @NotNull(message = "Id is not null!")
    private Long id;
}
