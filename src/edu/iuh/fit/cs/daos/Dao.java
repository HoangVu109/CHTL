package edu.iuh.fit.cs.daos;

import java.util.List;

public interface Dao<T> {
    public List<T> getAll(String id);
    public T get(String id);
    public boolean add(T t);
    public boolean update(T t);
    public boolean delete(T t);
    public void display();
}
