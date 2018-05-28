package cn.boot.home.role.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.boot.home.role.dao.RoleMapper;
import cn.boot.home.role.pojo.RoleEntity;
import cn.boot.home.role.service.RoleService;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleMapper roleMapper;
	
	@Override
	public List<RoleEntity> getRoleList() {
		// TODO Auto-generated method stub
		return roleMapper.getRoleList();
	}

}
