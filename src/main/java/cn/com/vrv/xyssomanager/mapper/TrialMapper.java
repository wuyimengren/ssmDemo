package cn.com.vrv.xyssomanager.mapper;

import java.util.List;

import cn.com.vrv.xyssomanager.entity.Trial;

public interface TrialMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Trial record);

    int insertSelective(Trial record);

    Trial selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Trial record);

    int updateByPrimaryKey(Trial record);

	List<Trial> queryAll();
}