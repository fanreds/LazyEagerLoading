package pl.itcrowd.tutorials.hibernateExample;

import javax.persistence.*;
import java.io.Serializable;

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
}
