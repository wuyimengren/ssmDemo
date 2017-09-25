package cn.com.vrv.xyssomanager.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.com.vrv.xyssomanager.entity.Response;
import cn.com.vrv.xyssomanager.service.TrialService;

@RestController
@RequestMapping("/trial")
public class TrialController {
	
	@Autowired
	private TrialService trialService;

	@PostMapping(value="/testweb",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public Response webtest(@ RequestBody String text){
		System.out.println(text);
		Response response = new Response();
		response.setCode("200");
		response.setSuccess(true);
		response.setData(trialService.queryAll());
		return response;
	}
}
