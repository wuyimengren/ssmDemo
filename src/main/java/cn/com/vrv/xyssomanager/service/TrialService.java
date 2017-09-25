package cn.com.vrv.xyssomanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.vrv.xyssomanager.entity.Trial;
import cn.com.vrv.xyssomanager.mapper.TrialMapper;

@Service
public class TrialService {
	
	@Autowired
	public TrialMapper mapper;

	public List<Trial> queryAll(){
		return mapper.queryAll();
	}
}
