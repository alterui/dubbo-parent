package com.atguigu.gmall.bootorderserviceconsumer.impl;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liurui
 * @time 2019-07-10 11:42
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;
    /**
     * 初始化订单
     * @param userId
     */
    public void initOrder(String userId) {
        //1.查询用户的收获地址
        System.out.println("userId:" + userId);
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        for (UserAddress  userAddress:  userAddressList) {
            //打印出地址信息
            System.out.println(userAddress.getUserAddress());
            
        }
    }

}
