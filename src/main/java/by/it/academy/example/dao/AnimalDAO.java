package by.it.academy.example.dao;

public interface AnimalDAO<T> {
    T sava (T pojo);
    T find(int id);
}
