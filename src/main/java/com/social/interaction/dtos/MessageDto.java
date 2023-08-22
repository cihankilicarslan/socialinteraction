package com.social.interaction.dtos;

import com.social.interaction.entities.Group;
import com.social.interaction.entities.User;

import javax.persistence.*;
import java.time.LocalDateTime;

public class MessageDto {

    private Long id;
    private User user;
    private Group group;
    private String content;
    private LocalDateTime sentAt;

}
