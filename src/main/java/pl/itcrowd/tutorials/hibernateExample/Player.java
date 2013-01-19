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

}
