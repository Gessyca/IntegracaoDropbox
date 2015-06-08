package integracao.dropbox.jpa;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public enum PersistenceManager {

    INSTANCE;

    private EntityManager em;

    public EntityManager getEntityManager() {
        if (em == null || !em.isOpen()) {
            em = Persistence.createEntityManagerFactory("dropbox")
                    .createEntityManager();
        }
        return em;
    }
}
