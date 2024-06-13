package com.sportplatform.entity;

import com.sportplatform.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor
@Table(name = "organizations")
public class Organization extends BaseEntity {
    String name;
    String address;
    String phoneNumber;
    String mapPosition;
}
