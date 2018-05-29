package cn.boot.home.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.boot.home.manage.pojo.ManageEntity;
import cn.boot.home.manage.serivce.ManageService;

@RestController
@RequestMapping("/rest/manage")
public class ManageController {
	
	@Autowired
	private ManageService manageSerivce;
	
	@RequestMapping("/getManageList")
	public List<ManageEntity> getManageList(){
		return manageSerivce.getManageList();
	}
	
}
