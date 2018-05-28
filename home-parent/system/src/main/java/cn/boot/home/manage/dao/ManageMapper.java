package cn.boot.home.manage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.boot.home.manage.pojo.ManageEntity;

@Mapper
public interface ManageMapper {

	List<ManageEntity> getManageList();

}
