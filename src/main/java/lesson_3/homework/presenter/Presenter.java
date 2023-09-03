package lesson_3.homework.presenter;

import lesson_3.homework.Exceptions.EmptyStoreException;
import lesson_3.homework.Exceptions.ProductNotFoundException;
import lesson_3.homework.Exceptions.WrongNameException;
import lesson_3.homework.Exceptions.ZeroPriceException;
import lesson_3.homework.model.Model;

public class Presenter {

    private Model model;

    public Presenter() {
        model = new Model();
    }

    public void addProduct(String name, double price) {
        try {
            model.addProduct(name, price);
        } catch (WrongNameException | ZeroPriceException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteProduct(String name) {
        try {
            model.deleteProduct(name);
        } catch (WrongNameException | ProductNotFoundException | EmptyStoreException e) {
            System.out.println(e.getMessage());
        }
    }


    public String getProduct(String name) {
        try {
            return model.getProduct(name);
        } catch (ProductNotFoundException | WrongNameException | EmptyStoreException e) {
            return e.getMessage();
        }

    }

    public void getAllProducts() {
        try {
            model.getAllProducts();
        } catch (EmptyStoreException e) {
            System.out.println(e.getMessage());
        }
    }
}
