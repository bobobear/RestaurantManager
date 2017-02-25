package com.restaurant.dao;

import com.restaurant.dto.Product;
import com.restaurant.dto.User;

import java.util.List;

/**
 * Created by Martha on 2/25/2017.
 */
public interface ProductDAO {

    /** Checks by product generated id, if product exists updates it, if not creates new product.
     * @param product instance of {@link Product}
     * @return {@link Product} object from db or null if doesn't exist.*/
    Product writeOrUpdateProduct(Product product);

    /** Finds specified product.
     * @param productId generated id of product.
     * @return {@link Product} object from db or null if doesn't exist.*/
    Product readProduct(Integer productId);

    /** Gets all products with specified user.
     * @param user producted user
     * @return list of {@link Product} objects from db or if non exist return a list with size of 0.*/
    List<Product> getAllProducts(User user);

    /** Deletes specified product.
     * @param productId generated id of product.
     * @return true if product was successfully deleted or did not exist.*/
    boolean deleteProduct(Integer productId);

    /** Deletes all products with specified user.
     * @param user producted user
     * @return true if product were successfully deleted or did not exist.*/
    boolean deletAllProducts(User user);

    /** Gets all products.
     * @return list of {@link Product} objects from db or if non exist return a list with size of 0.*/
    List<Product> getAllProducts();
}