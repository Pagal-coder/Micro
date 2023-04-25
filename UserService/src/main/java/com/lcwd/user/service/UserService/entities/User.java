package com.lcwd.user.service.UserService.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="micro_users")
public class User {

    @Id
    @Column(name="ID")
    private String userId;
    @Column(name="Name",length = 20)
    private String name;
    @Column(name="Mail")
    private String email;
    private String about;

    @Transient
    private List<Rating> ratings=new ArrayList<Rating>();
}
