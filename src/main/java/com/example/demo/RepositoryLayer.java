package com.example.demo;

import java.util.List;

public interface RepositoryLayer<T ,P > {
    T Create(T t);
    Boolean Upadate(T t);
    Boolean Delete(T t);
    List<T> Find(P p);
}
