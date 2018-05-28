package cn.boot.home.manage.serivce.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.boot.home.manage.dao.ManageMapper;
import cn.boot.home.manage.pojo.ManageEntity;
import cn.boot.home.manage.serivce.ManageService;

@Transactional
@Service
public class ManageServiceImpl implements ManageService {

	@Autowired
	private ManageMapper manageMapper;
	
	@Override
	public List<ManageEntity> getManageList() {
		// TODO Auto-generated method stub
		return manageMapper.getManageList();
	}

}
