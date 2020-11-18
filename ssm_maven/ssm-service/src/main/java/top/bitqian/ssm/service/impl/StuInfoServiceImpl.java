package top.bitqian.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.bitqian.ssm.entity.StuInfo;
import top.bitqian.ssm.mapper.StuInfoMapper;
import top.bitqian.ssm.service.StuInfoService;

/**
 * @author echo lovely
 * @date 2020年11月18日 下午6:08:29
 */

@Service
public class StuInfoServiceImpl implements StuInfoService {
	
	@Autowired
	private StuInfoMapper stuMapper;

	@Override
	public List<StuInfo> getAllStu() {

		return stuMapper.getAllStu();
	}

}
