package com.social.interaction.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user_profile")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserProfile extends BaseEntity {

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "middleName")
    private String middleName;

    @Column(name = "username")
    private String username;

    @Column(name = "email_adress")
    private String emailAdress;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "mobile_phone")
    private String mobilePhone;

    @Column(name = "identity_number")
    private String identityNumber;

    @Column(name = "password")
    private String password;

    @Column(name = "group_id")
    private Long groupId;

    @Column(name = "location_id")
    private Long locationId;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_profile_group",
            joinColumns = @JoinColumn(name = "user_profile_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id"))
    private Set<Group> groups = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;

}
