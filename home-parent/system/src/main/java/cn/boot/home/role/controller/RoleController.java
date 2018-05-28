package cn.boot.home.role.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.boot.home.role.pojo.RoleEntity;
import cn.boot.home.role.service.RoleService;

/**
 * 角色controller
 * 
 * @author limi
 *
 */
@RestController
@RequestMapping("/rest/role")
public class RoleController {
	
	@Autowired
	private RoleService roleService;

	@RequestMapping("/getRoleList")
	public List<RoleEntity> getRoleList() {
		
		return roleService.getRoleList();
	}
}
