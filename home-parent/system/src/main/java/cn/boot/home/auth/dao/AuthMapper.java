package cn.boot.home.auth.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.boot.home.auth.pojo.AuthEntity;

@Mapper
// public interface AuthMapper extends JpaRepository<AuthEntity, Integer> {
public interface AuthMapper {

	// @Query(value = "select * from sys_home_auth")
	List<AuthEntity> getAuthList();

	// @Update(value = { "" })
	// void Edit();

}
