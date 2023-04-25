package com.lcwd.user.service.UserService.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rating {


    private String ratingId;
    private String userId;
    private String hotel;
    private int rating;
    private String feedback;


}
