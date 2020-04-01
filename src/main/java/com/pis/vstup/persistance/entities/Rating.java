package com.pis.vstup.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "rating", schema = "vstup")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rating implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ratingID")
    private Integer ratingId;
    @Column(name = "rating")
    private double rating;

    @OneToOne
    @JoinColumn(referencedColumnName = "userID", name = "userID")
    private Users user;

}
