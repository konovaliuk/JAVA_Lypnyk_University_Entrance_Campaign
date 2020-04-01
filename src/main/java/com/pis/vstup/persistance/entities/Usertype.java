package com.pis.vstup.persistance.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "usertype", schema = "vstup")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usertype implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "typeID")
    private Integer typeId;
    @Column(name = "type")
    private String type;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usertype")
    @JsonIgnore
    private List<Users> users;

}
