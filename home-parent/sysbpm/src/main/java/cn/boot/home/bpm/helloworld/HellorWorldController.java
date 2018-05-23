package cn.boot.home.bpm.helloworld;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;
import java.util.zip.ZipInputStream;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class HellorWorldController {

	@Autowired
	ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();

	private static final Logger log = LoggerFactory.getLogger(HellorWorldController.class);

	/**
	 * 部署流程定义
	 * 
	 * @throws Exception
	 */
	@Test
	public void deploymentProcessDefinition() throws Exception {
		String bpmnam = null;
		String fileNa = null;
		if (fileNa == null || fileNa == "" || bpmnam == null || bpmnam == "") {
			throw new Exception("文件路径不能为空");
		}

		File processFile = new File(fileNa);
		Deployment deployment = null;// 完成部署
		if (fileNa.endsWith("zip")) {
			try {
				deployment = processEngine.getRepositoryService()// 与流程定义和部署对象相关的Service
						.createDeployment()// 创建一个部署对象
						.name(bpmnam)// 添加部署的名称
						// .addClasspathResource("diagrams/helloworld.bpmn")
						// 从classpath的资源中加载，一次只能加载一个文件
						// .addClasspathResource("diagrams/helloworld.png")
						// 从classpath的资源中加载，一次只能加载一个文件
						// .addInputStream("processVariables.bpmn",
						// inputStreambpmn)//使用资源文件的名称（要求：与资源文件的名称要一致），和输入流完成部署
						// .addInputStream("processVariables.png",
						// inputStreampng)//使用资源文件的名称（要求：与资源文件的名称要一致），和输入流完成部署
						.addZipInputStream(new ZipInputStream(new FileInputStream(processFile))).deploy();
			} catch (Exception e) {
				log.error("流程部署异常：[%s]", e.getStackTrace().toString());
				throw new Exception("流程图有误，不支持解析除自动、人工、开始、结束以外的节点类型");
			}
		} else {
			throw new Exception("获取到的流程包不是zip文件");
		}

		System.out.println("部署ID：" + deployment.getId());// 1
		System.out.println("部署名称：" + deployment.getName());// helloworld入门程序
	}

	/** 启动流程实例 */
	@Test
	public void startProcessInstance() {
		// 流程定义的key
		String processDefinitionKey = "helloworld";
		ProcessInstance pi = processEngine.getRuntimeService()// 与正在执行的流程实例和执行对象相关的Service
				.startProcessInstanceByKey(processDefinitionKey);// 使用流程定义的key启动流程实例，key对应helloworld.bpmn文件中id的属性值，使用key值启动，默认是按照最新版本的流程定义启动
		System.out.println("流程实例ID:" + pi.getId());// 流程实例ID 101
		System.out.println("流程定义ID:" + pi.getProcessDefinitionId());// 流程定义ID
																	// helloworld:1:4
	}

	/** 设置流程变量 */
	@Test
	public void setVariables() {
		/** 与任务（正在执行） */
		TaskService taskService = processEngine.getTaskService();
		// 任务ID
		String taskId = "2104";
		/** 一：设置流程变量，使用基本数据类型 */
		// taskService.setVariableLocal(taskId, "请假天数", 5);//与任务ID绑定
		// taskService.setVariable(taskId, "请假日期", new Date());
		// taskService.setVariable(taskId, "请假原因", "回家探亲，一起吃个饭");
		/** 二：设置流程变量，使用javabean类型 */
		/**
		 * 当一个javabean（实现序列号）放置到流程变量中，要求javabean的属性不能再发生变化 * 如果发生变化，再获取的时候，抛出异常
		 * 
		 * 解决方案：在Person对象中添加： private static final long serialVersionUID =
		 * 6757393795687480331L; 同时实现Serializable
		 */
		Person p = new Person();
		p.setId(20);
		p.setName("翠花");
		taskService.setVariable(taskId, "人员信息(添加固定版本)", p);

		System.out.println("设置流程变量成功！");
	}

	/** 获取流程变量 */
	@Test
	public void getVariables() {
		/** 与任务（正在执行） */
		TaskService taskService = processEngine.getTaskService();
		// 任务ID
		String taskId = "2104";
		/** 一：获取流程变量，使用基本数据类型 */
		// Integer days = (Integer) taskService.getVariable(taskId, "请假天数");
		// Date date = (Date) taskService.getVariable(taskId, "请假日期");
		// String resean = (String) taskService.getVariable(taskId, "请假原因");
		// System.out.println("请假天数："+days);
		// System.out.println("请假日期："+date);
		// System.out.println("请假原因："+resean);
		/** 二：获取流程变量，使用javabean类型 */
		Person p = (Person) taskService.getVariable(taskId, "人员信息(添加固定版本)");
		System.out.println(p.getId() + "        " + p.getName());
	}

	/** 查询当前人的个人任务 */
	@Test
	public void findMyPersonalTask() {
		String assignee = "王五";
		List<Task> list = processEngine.getTaskService()// 与正在执行的任务管理相关的Service
				.createTaskQuery()// 创建任务查询对象
				.taskAssignee(assignee)// 指定个人任务查询，指定办理人
				.list();
		if (list != null && list.size() > 0) {
			for (Task task : list) {
				System.out.println("任务ID:" + task.getId());
				System.out.println("任务名称:" + task.getName());
				System.out.println("任务的创建时间:" + task.getCreateTime());
				System.out.println("任务的办理人:" + task.getAssignee());
				System.out.println("流程实例ID：" + task.getProcessInstanceId());
				System.out.println("执行对象ID:" + task.getExecutionId());
				System.out.println("流程定义ID:" + task.getProcessDefinitionId());
				System.out.println("########################################################");
			}
		}
	}

	/** 完成我的任务 */
	@Test
	public void completeMyPersonalTask() {
		// 任务ID
		String taskId = "302";
		processEngine.getTaskService()// 与正在执行的任务管理相关的Service
				.complete(taskId);
		System.out.println("完成任务：任务ID：" + taskId);
	}

	/** 查询流程状态（判断流程正在执行，还是结束） */
	@Test
	public void isProcessEnd() {
		String processInstanceId = "1001";
		ProcessInstance pi = processEngine.getRuntimeService()// 表示正在执行的流程实例和执行对象
				.createProcessInstanceQuery()// 创建流程实例查询
				.processInstanceId(processInstanceId)// 使用流程实例ID查询
				.singleResult();
		if (pi == null) {
			System.out.println("流程已经结束");
		} else {
			System.out.println("流程没有结束");
		}
	}

	/** 查询历史任务 */
	@Test
	public void findHistoryTask() {
		String taskAssignee = "张三";
		List<HistoricTaskInstance> list = processEngine.getHistoryService()// 与历史数据（历史表）相关的Service
				.createHistoricTaskInstanceQuery()// 创建历史任务实例查询
				.taskAssignee(taskAssignee)// 指定历史任务的办理人
				.list();
		if (list != null && list.size() > 0) {
			for (HistoricTaskInstance hti : list) {
				System.out.println(hti.getId() + "    " + hti.getName() + "    " + hti.getProcessInstanceId() + "   "
						+ hti.getStartTime() + "   " + hti.getEndTime() + "   " + hti.getDurationInMillis());
				System.out.println("################################");
			}
		}
	}

	/** 查询历史流程实例 */
	@Test
	public void findHistoryProcessInstance() {
		String processInstanceId = "1001";
		HistoricProcessInstance hpi = processEngine.getHistoryService()// 与历史数据（历史表）相关的Service
				.createHistoricProcessInstanceQuery()// 创建历史流程实例查询
				.processInstanceId(processInstanceId)// 使用流程实例ID查询
				.singleResult();
		System.out.println(hpi.getId() + "    " + hpi.getProcessDefinitionId() + "    " + hpi.getStartTime() + "    "
				+ hpi.getEndTime() + "     " + hpi.getDurationInMillis());
	}
}
