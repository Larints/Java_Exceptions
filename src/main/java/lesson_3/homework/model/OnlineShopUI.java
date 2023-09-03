package lesson_3.homework.model;

import lesson_3.homework.Exceptions.EmptyStoreException;
import lesson_3.homework.Exceptions.ProductNotFoundException;
import lesson_3.homework.Exceptions.WrongNameException;
import lesson_3.homework.Exceptions.ZeroPriceException;

public interface OnlineShopUI {

    void addProduct(String product, double price) throws WrongNameException, ZeroPriceException;

    void deleteProduct(String name) throws ProductNotFoundException, WrongNameException, EmptyStoreException;

    String getProduct(String name) throws ProductNotFoundException, WrongNameException, EmptyStoreException;

    void getAllProducts() throws EmptyStoreException;

}
