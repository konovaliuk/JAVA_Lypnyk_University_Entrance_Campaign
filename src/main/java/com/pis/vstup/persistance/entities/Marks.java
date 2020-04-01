package com.pis.vstup.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "marks", schema = "vstup")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Marks implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "marksID")
    private Integer marksId;
    @Column(name = "math")
    private Integer math;
    @Column(name = "english")
    private Integer english;
    @Column(name = "physics")
    private Integer physics;

    @OneToOne
    @JoinColumn(referencedColumnName = "userID", name = "studentID")
    private Users user;

}
