package cn.boot.home.auth.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.boot.home.auth.dao.AuthMapper;
import cn.boot.home.auth.pojo.AuthEntity;
import cn.boot.home.auth.service.AuthService;

@Transactional
@Service
public class AuthServiceImpl implements AuthService {

	@Autowired
	private AuthMapper authMapperImpl;
	
	@Override
	public List<AuthEntity> getAuthList() {
		return authMapperImpl.getAuthList();
	}

}
