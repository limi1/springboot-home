package cn.boot.home.auth.service;

import java.util.List;

import cn.boot.home.auth.pojo.AuthEntity;

public interface AuthService {

	List<AuthEntity> getAuthList();

}
