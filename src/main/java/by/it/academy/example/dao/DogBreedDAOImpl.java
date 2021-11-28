package by.it.academy.example.dao;

import by.it.academy.example.pojo.CatBreed;
import by.it.academy.example.pojo.DogBreed;
import by.it.academy.example.util.HibernateUtil;
import org.hibernate.HibernateException;

import javax.persistence.EntityManager;

public class DogBreedDAOImpl implements AnimalDAO<DogBreed>{
    private DogBreed dog;
    private EntityManager em;

    @Override
    public DogBreed sava(DogBreed pojo) {
       
        em = HibernateUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(pojo);
            em.getTransaction().commit();
            return pojo;
        } catch (HibernateException ignore) {
            em.getTransaction().rollback();
            return null;
        }finally {
            em.close();
        }
    }

    @Override
    public DogBreed find(int id) {
        dog = new DogBreed();
        em = HibernateUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            dog = em.find(DogBreed.class, id);
            em.getTransaction().commit();
            return dog;
        } catch (HibernateException ignore){
            em.getTransaction().rollback();
            return null;
        }
        finally {
            em.close();
        }
    }

}
