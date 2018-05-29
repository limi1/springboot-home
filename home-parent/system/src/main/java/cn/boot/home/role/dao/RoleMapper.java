package cn.boot.home.role.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.boot.home.role.pojo.RoleEntity;

@Mapper
public interface RoleMapper {

	List<RoleEntity> getRoleList();

}
