package com.sportplatform.entity;

import com.sportplatform.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor
@Table(name = "football_fields")
public class FootballField extends BaseEntity {
    String name;
}
