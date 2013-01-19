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

    }
}
