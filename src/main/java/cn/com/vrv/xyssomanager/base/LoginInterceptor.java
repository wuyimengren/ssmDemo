package cn.com.vrv.xyssomanager.base;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        Object user = request.getSession().getAttribute(Constant.CURRENT_USER);
//        if (user == null) {
//            Writer writer = response.getWriter();
//            BaseResponse json = BaseResponse.getSuccessInstance();
//            json.setCode(String.valueOf(HttpServletResponse.SC_FORBIDDEN));
//            json.setMessage("用户未登录或者登陆超时");
//            json.setSuccess(false);
//            writer.write(JSONObject.toJSONString(json));
//            return false;
//        }
        
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3) throws Exception
    {
        
    }

    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3) throws Exception
    {
        
    }

}