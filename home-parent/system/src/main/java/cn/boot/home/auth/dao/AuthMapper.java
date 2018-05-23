package cn.boot.home.auth.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.boot.home.auth.pojo.AuthEntity;

@Mapper
public interface AuthMapper {

	List<AuthEntity> getAuthList();

}
