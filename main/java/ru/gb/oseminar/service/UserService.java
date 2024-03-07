package ru.gb.oseminar.service;

import java.time.LocalDate;
import java.util.List;

public interface UserService<T> {
    List<T> getAll();
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
        // Принцип открытости-закрытости т к класс открыт для расширения но закрыт для изменения 
    //Принцип единственной ответственности
}
