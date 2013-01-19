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
@Table(name = "TEAM")
public class Team implements Serializable {
    @Id
    @SequenceGenerator(name = "TEAM_ID_SEQUENCE", sequenceName = "TEAM_ID_SEQUENCE", initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TEAM_ID_SEQUENCE")
    private Long id;
}
