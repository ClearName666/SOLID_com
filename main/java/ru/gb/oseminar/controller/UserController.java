package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.User;

import java.time.LocalDate;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
    // Принцип открытости-закрытости т к класс открыт для расширения но закрыт для изменения
    // Принцип единственной ответственности т к тут только 1 метод для создания больше не за что он не отвеает
}
