package com.social.interaction.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "groups")
public class Group extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "location_id")
    private Long locationId;

    @ManyToOne
    @JoinColumn(name = "location_id", insertable = false, updatable = false)
    private Location location;

    @ManyToMany(mappedBy = "groups")
    private Set<User> users = new HashSet<>();

    @ManyToMany(mappedBy = "groups")
    private Set<UserProfile> userProfiles = new HashSet<>();

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
    private Set<Message> messages = new HashSet<>();
}
