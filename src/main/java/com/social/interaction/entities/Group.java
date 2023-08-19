package com.social.interaction.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

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
}
