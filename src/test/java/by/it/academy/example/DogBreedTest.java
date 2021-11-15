package by.it.academy.example;

import by.it.academy.example.dao.AnimalDAO;
import by.it.academy.example.dao.DogDAOImpl;
import by.it.academy.example.pojo.DogBreed;
import by.it.academy.example.util.HibernateUtil;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class DogBreedTest {
    AnimalDAO dao;
    DogBreed dog;

    @BeforeEach
    void initAnimalDAO(){
        dao = mock(DogDAOImpl.class);
        dog = mock(DogBreed.class);
    }

    @Test
    void saveTest() {
        Assertions.assertDoesNotThrow(()->{dao.sava(dog);});
    }

    @Test
    void findTest() {
        Assertions.assertDoesNotThrow(()->{dao.find(1);});
    }

    @AfterAll
    static void cleanUp() {
        HibernateUtil.close();
    }
}
