package it.develhope.Repository02.entities;

import lombok.Data;

import javax.persistence.*;

@Table
@Entity
@Data
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(name = "Year_of_appearance")
    private Integer firstAppearance;
    @Column(nullable = false)
    private String inventor;
}
