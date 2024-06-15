package com.sportplatform.entity;

import com.sportplatform.common.BaseEntity;
import com.sportplatform.dto.user.CreateUserDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor
@Table(name = "users")
public class User extends BaseEntity {
    String fullName;
    String username;
    String password;
}
