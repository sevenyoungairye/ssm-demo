package top.bitqian.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import top.bitqian.ssm.entity.StuInfo;

/**
 * stuInfo mapper 
 * @author echo lovely
 *
 */
@Mapper
@Repository
public interface StuInfoMapper {
	
	List<StuInfo> getAllStu();
   
}