package ru.gb.oseminar.view;

import ru.gb.oseminar.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
        // Принцип открытости-закрытости т к класс открыт для расширения но закрыт для изменения 
    //Принцип единственной ответственности
}
