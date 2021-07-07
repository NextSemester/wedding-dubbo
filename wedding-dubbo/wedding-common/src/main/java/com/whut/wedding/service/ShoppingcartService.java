package com.whut.wedding.service;

import com.whut.wedding.entity.Shoppingcart;

import java.util.List;

public interface ShoppingcartService {
    void insert(Shoppingcart shoppingcart);
    List<Shoppingcart> selectShoppingcartsByUserTel(String userTel);
    void updateCount(String id,int count);
    void updateChecked(String id,int checked);
    List<Shoppingcart> selectCheckedShoppingcartsByUserTel(String userTel);
}
