package pl.itcrowd.tutorials.hibernateExample;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: kleks
 * Date: 1/18/13
 * Time: 2:55 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "PLAYER")
public class Player implements Serializable {
    @Id
    @SequenceGenerator(name = "PLAYER_ID_SEQUENCE", sequenceName = "PLAYER_ID_SEQUENCE", initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PLAYER_ID_SEQUENCE")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @ManyToOne(optional = false,cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinColumn(name = "TEAM_ID")
    private Team team;

    public Player() {
    }

    public Player(String name) {
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

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
