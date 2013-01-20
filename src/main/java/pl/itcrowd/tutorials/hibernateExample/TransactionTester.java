package pl.itcrowd.tutorials.hibernateExample;

/**
 * Created with IntelliJ IDEA.
 * User: klex
 * Date: 1/20/13
 * Time: 11:52 AM
 * To change this template use File | Settings | File Templates.
 */
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.TransactionSynchronizationRegistry;
import java.util.logging.Logger;

@Stateless
public class TransactionTester{

    private static final Logger LOGGER = Logger.getLogger(TransactionTester.class.getCanonicalName());


    @PersistenceContext
    EntityManager entityManager;

    @Resource
    private TransactionSynchronizationRegistry txReg;

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void test() {

        LOGGER.info("Transaction status: " + txReg.getTransactionStatus() + " key: " + txReg.getTransactionKey());
        final Leage el1 = entityManager.find(Leage.class,1L);
    }
}
