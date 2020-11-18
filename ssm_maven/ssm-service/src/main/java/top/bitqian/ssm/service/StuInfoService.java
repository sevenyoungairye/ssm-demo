package top.bitqian.ssm.service;

import java.util.List;

// 此模块引用了父模块中的entity
import top.bitqian.ssm.entity.StuInfo;

/**
 * @author echo lovely
 * @date 2020年11月18日 下午6:05:38
 */

public interface StuInfoService {
	
	List<StuInfo> getAllStu();

}
