package com.atguigu.gmall.service.impl;

import java.util.Arrays;
import java.util.List;


import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;


public class UserServiceImpl implements UserService {

	public List<UserAddress> getUserAddressList(String userId) {
		UserAddress address1 = new UserAddress(1, "江苏省南京市浦口区浦珠南路30号", "1", "李老师", "010-56253825", "Y");
		UserAddress address2 = new UserAddress(2, "上海市杨浦区翔殷路491弄小区）", "1", "王老师", "010-56253825", "N");

		return Arrays.asList(address1,address2);
	}
}
