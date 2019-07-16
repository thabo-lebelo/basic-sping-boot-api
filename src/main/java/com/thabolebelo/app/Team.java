package com.thabolebelo.app;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Getter @Setter
@NoArgsConstructor
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue(generator = "SEQ_TEAM", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SEQ_TEAM", sequenceName = "SEQ_TEAM")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "role")
    private String role;

    public Team(String firstName) {
        this.firstName = firstName;
    }

    public Team(Long id, String firstName, String lastName, String role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public String getFirstName() {
        return this.firstName;
    }

}
