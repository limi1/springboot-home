package cn.boot.home.bpm.controller;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class BpmController {

	@Autowired
	ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
	private static final Logger log = LoggerFactory.getLogger(BpmController.class);

	/**
	 * 部署流程定义
	 */
//	public void deploymentProcessDefinition(){
//		processEngine.getRepositoryService()// 与流程定义和部署对象相关的Service
//			.createDeployment()// 创建一个部署对象
//			.name("aaa")// 添加部署的名称
//	}
}
