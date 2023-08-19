package com.social.interaction.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "location")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Location extends  BaseEntity{

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "fax")
    private String fax;

    @Column(name = "phone")
    private String phone;

    @Column(name = "coordinates")
    private String coordinates;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

}
