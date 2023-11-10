package CS2;

import java.util.List;

public interface ManagerInterface <E>{
    void add(E e);
    void edit(int id,E e);
    void delete(int id);
    E findMaxPrice();
    List<E> findAll();
}
