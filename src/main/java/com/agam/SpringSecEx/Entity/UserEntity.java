package com.agam.SpringSecEx.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@Table(name = "tbl_users")
@NoArgsConstructor
public class UserEntity {
    @Id
    private int id;
    private String username;
    private String password;
}
