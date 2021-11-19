package by.it.academy.example.dao;

import by.it.academy.example.pojo.CatBreed;
import by.it.academy.example.util.HibernateUtil;
import org.hibernate.HibernateException;

import javax.persistence.EntityManager;

public class CatBreedDAOImpl implements AnimalDAO<CatBreed>{
    private CatBreed cat;
    private EntityManager em;

    @Override
    public CatBreed sava(CatBreed pojo) {
        cat = new CatBreed();
        em = HibernateUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(cat);
            em.getTransaction().commit();
            return cat;
        } catch (HibernateException ignore) {
            em.getTransaction().rollback();
            return null;
        }finally {
            em.close();
        }
    }

    @Override
    public CatBreed find(int id) {
        cat = new CatBreed();
        em = HibernateUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            cat = em.find(CatBreed.class, id);
            em.getTransaction().commit();
            return cat;
        } catch (HibernateException ignore){
            em.getTransaction().rollback();
            return null;
        }
        finally {
            em.close();
        }
    }

}
