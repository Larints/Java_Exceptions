package lesson_3.homework.model;

import lesson_3.homework.Exceptions.EmptyStoreException;
import lesson_3.homework.Exceptions.ProductNotFoundException;
import lesson_3.homework.Exceptions.WrongNameException;
import lesson_3.homework.Exceptions.ZeroPriceException;

public class Model {

    private final OnlineShop shop;

    public Model() {
        this.shop = new OnlineShop("Товары 24\7");
    }

    public void addProduct(String name, double price) throws WrongNameException, ZeroPriceException {
        shop.addProduct(name, price);
    }

    public void deleteProduct(String name) throws ProductNotFoundException, WrongNameException, EmptyStoreException {
        shop.deleteProduct(name);

    }

    public String getProduct(String name) throws WrongNameException, ProductNotFoundException, EmptyStoreException {
        return shop.getProduct(name);
    }

    public void getAllProducts() throws EmptyStoreException {
        shop.getAllProducts();
    }
}
