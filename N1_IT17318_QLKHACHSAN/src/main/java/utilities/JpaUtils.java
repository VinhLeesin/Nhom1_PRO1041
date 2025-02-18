package utilities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtils {
    private static EntityManagerFactory factory;
    private static EntityManager em;
    
    private static EntityManagerFactory getFactory() {
        if (JpaUtils.factory == null || JpaUtils.factory.isOpen() == false) {
            JpaUtils.factory = Persistence.createEntityManagerFactory("vinhntph");
        }
        
        return JpaUtils.factory;
    }
    
    public static EntityManager getEntityManager() {
        if (JpaUtils.em == null || JpaUtils.em.isOpen() == false) {
            JpaUtils.em = JpaUtils.getFactory().createEntityManager();
        }
        
        return JpaUtils.em;
    }
}
