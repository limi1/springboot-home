package cn.boot.home.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.boot.home.user.dao.UserMapper;
import cn.boot.home.user.pojo.UserEntity;
import cn.boot.home.user.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapperImpl;
	
	@Override
	public List<UserEntity> getUserList() {
		return userMapperImpl.getUserList();
	}

	
}
