package com.social.interaction.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "post_data_groups")

public class PostDataUsers extends BaseEntity {

    @Column(name = "post_data_title", nullable = false)
    private String user_data_title;

    @Column(name = "post_details", nullable = false)
    private String user_data_detail;

    @Column(name = "post_time", nullable = false)
    private LocalTime postTime;

}
