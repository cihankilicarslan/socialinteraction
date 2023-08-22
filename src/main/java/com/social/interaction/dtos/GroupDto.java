package com.social.interaction.dtos;

import com.social.interaction.entities.Location;
import com.social.interaction.entities.Message;
import com.social.interaction.entities.User;
import com.social.interaction.entities.UserProfile;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class GroupDto {

    private Long id;
    private String name;
    private Long locationId;
    private Location location; // Bu alanı dışa aktarmanın gerekip gerekmediğini değerlendirmelisiniz
    private Set<User> users;
    private Set<UserProfile> userProfiles;
    private Set<Message> messages;
}
