package cn.boot.home.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;

import cn.boot.home.user.pojo.UserEntity;

@Mapper
public interface UserMapper {

	@Bean
	List<UserEntity> getUserList();

}
