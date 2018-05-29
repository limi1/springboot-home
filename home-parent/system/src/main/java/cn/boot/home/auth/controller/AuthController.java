package cn.boot.home.auth.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.boot.home.auth.pojo.AuthEntity;
import cn.boot.home.auth.service.AuthService;

/**
 * 菜单控制
 * @author limi
 *
 */
@RestController
@RequestMapping("/rest/auth")
public class AuthController {

	protected static Logger log = LoggerFactory.getLogger(AuthController.class);

	
	@Autowired
	private AuthService authServiceImpl;
	
	@RequestMapping("/getAuthList")
	public List<AuthEntity> getAuthList(){
		log.info("进入");
		
		List<AuthEntity> authList = authServiceImpl.getAuthList();
		log.info("authList"+authList);
		return authList;
	}
}
