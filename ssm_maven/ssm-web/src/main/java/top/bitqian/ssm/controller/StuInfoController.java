package top.bitqian.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.bitqian.ssm.entity.StuInfo;
import top.bitqian.ssm.service.StuInfoService;

/**
 * @author echo lovely
 * @date 2020年11月18日 下午8:16:38
 */

@RestController
public class StuInfoController {
	
	@Autowired
	private StuInfoService stuService;
	
	@RequestMapping("/stu/all")
	public List<StuInfo> getAllStu() {
		
		List<StuInfo> list = stuService.getAllStu();
		return list;
	}

}
