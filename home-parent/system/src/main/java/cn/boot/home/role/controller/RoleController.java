package cn.boot.home.role.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 角色controller
 * 
 * @author limi
 *
 */
@RestController
@RequestMapping("/rest/role")
public class RoleController {

	@RequestMapping("/getRoleList")
	public void role() {

	}
}
