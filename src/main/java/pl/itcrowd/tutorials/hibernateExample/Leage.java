package pl.itcrowd.tutorials.hibernateExample;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: klex
 * Date: 1/19/13
 * Time: 8:34 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "LEAGE")
public class Leage implements Serializable {
    @Id
    @SequenceGenerator(name = "LEAGE_ID_SEQUENCE", sequenceName = "LEAGE_ID_SEQUENCE", initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LEAGE_ID_SEQUENCE")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @OneToMany(mappedBy = "leage",cascade = {CascadeType.PERSIST,CascadeType.MERGE},fetch = FetchType.EAGER)
    private List<Team> teams = new ArrayList<Team>();

    public Leage() {
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public Leage(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
