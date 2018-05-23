package cn.boot.home.user.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.boot.home.user.pojo.UserEntity;
import cn.boot.home.user.service.UserService;

/**
 * 
 * 
 * @author limi
 *
 */
@RestController
// @Controller
@RequestMapping("/rest/user")
public class UserController {

	@Autowired
	private UserService userSerivceImpl;

	protected static Logger log = LoggerFactory.getLogger(UserController.class);

	@RequestMapping("holle")
	public String holle() {
		return "holle";
	}

	@ResponseBody
	@RequestMapping("getUserList")
	public List<UserEntity> getUserList() {
		log.info("进入查询方法");
		List<UserEntity> list = userSerivceImpl.getUserList();
		log.info("需要返回的数据" + list);
		return list;
	}

}
