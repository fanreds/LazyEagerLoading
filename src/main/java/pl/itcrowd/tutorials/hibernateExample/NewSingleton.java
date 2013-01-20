package pl.itcrowd.tutorials.hibernateExample;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created with IntelliJ IDEA.
 * User: kleks
 * Date: 1/18/13
 * Time: 2:55 PM
 * To change this template use File | Settings | File Templates.
 */
@Startup
@Singleton
public class NewSingleton {

    @PersistenceContext
    EntityManager entityManager;


    public NewSingleton() {
    }

    @PostConstruct
    public void PostConcruct(){

        final Leage leage = new Leage("Premiership");

        final Team team1 = new Team("FC Liverpool");
        final Team team2 = new Team("Arsenal");

        final Player player1 = new Player("Gerrard");
        final Player player2 = new Player("Arteta");
        final Player player3 = new Player("Suerez");
        final Player player4 = new Player("Podolski");

        leage.getTeams().add(team1);
        leage.getTeams().add(team2);

        team1.getPlayers().add(player1);
        team1.getPlayers().add(player3);
        team2.getPlayers().add(player2);
        team2.getPlayers().add(player4);


        player1.setTeam(team1);
        player2.setTeam(team2);
        player3.setTeam(team1);
        player4.setTeam(team2);

        team1.setLeage(leage);
        team2.setLeage(leage);

        entityManager.persist(leage);

        entityManager.flush();
        entityManager.clear();

        final Leage el1 = entityManager.find(Leage.class,1L);
        System.out.println(el1.getTeams().get(1).getPlayers().get(1));

    }
}
