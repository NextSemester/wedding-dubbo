package com.whut.wedding.service.impl;

import com.whut.wedding.dao.ShoppingcartDao;
import com.whut.wedding.entity.Shoppingcart;
import com.whut.wedding.service.ShoppingcartService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@DubboService(version = "1.0.0")
@Service
public class ShoppingcartServiceImpl implements ShoppingcartService {
    @Autowired
    ShoppingcartDao shoppingcartDao;

    @Override
    public void updateCount(String id, int count) {
        shoppingcartDao.updateCount(id,count);
    }

    @Override
    public void updateChecked(String id, int checked) {
        shoppingcartDao.updateChecked(id,checked);
    }

    @Override
    public List<Shoppingcart> selectCheckedShoppingcartsByUserTel(String userTel) {
        return shoppingcartDao.selectCheckedShoppingcartsByUserTel(userTel);
    }

    @Override
    public void insert(Shoppingcart shoppingcart) {
        shoppingcartDao.insert(shoppingcart);
    }

    @Override
    public List<Shoppingcart> selectShoppingcartsByUserTel(String userTel) {
        return shoppingcartDao.selectShoppingcartsByUserTel(userTel);
    }

}
