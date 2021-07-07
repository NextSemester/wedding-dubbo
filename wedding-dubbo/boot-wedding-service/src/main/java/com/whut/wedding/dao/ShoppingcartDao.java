package com.whut.wedding.dao;

import com.whut.wedding.entity.Shoppingcart;

import java.util.List;

public interface ShoppingcartDao {
    void insert(Shoppingcart shoppingcart);
    List<Shoppingcart> selectShoppingcartsByUserTel(String userTel);

    /**
     * 查询所有选中的购物车
     * @param userTel
     * @return
     */
    List<Shoppingcart> selectCheckedShoppingcartsByUserTel(String userTel);

    /**
     * 更新购物车的数量
     * @param id
     * @param count
     */
    void updateCount(String id,int count);

    /**
     * 修改勾选状态
     * @param id
     * @param checked
     */
    void updateChecked(String id,int checked);
}
