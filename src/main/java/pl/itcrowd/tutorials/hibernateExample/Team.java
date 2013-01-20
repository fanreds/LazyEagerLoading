package pl.itcrowd.tutorials.hibernateExample;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kleks
 * Date: 1/18/13
 * Time: 2:55 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "TEAM")
public class Team implements Serializable {
    @Id
    @SequenceGenerator(name = "TEAM_ID_SEQUENCE", sequenceName = "TEAM_ID_SEQUENCE", initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TEAM_ID_SEQUENCE")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @OneToMany(mappedBy = "team",cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private List<Player> players = new ArrayList<Player>();

    @ManyToOne(optional = false)
    @JoinColumn(name = "LEAGE_ID")
    private Leage leage;



    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Team() {
    }

    public Team(String name) {
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

    public Leage getLeage() {
        return leage;
    }

    public void setLeage(Leage leage) {
        this.leage = leage;
    }
}
