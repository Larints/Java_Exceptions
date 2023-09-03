package lesson_3.homework;

import lesson_3.homework.Exceptions.EmptyStoreException;
import lesson_3.homework.Exceptions.ProductNotFoundException;
import lesson_3.homework.viewer.UserGUI;

public class Main {

    public static void main(String[] args) throws ProductNotFoundException, EmptyStoreException {
        UserGUI gui = new UserGUI();
        gui.show();
    }


}
