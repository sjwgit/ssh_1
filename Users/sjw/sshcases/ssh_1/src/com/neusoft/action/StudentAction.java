package com.neusoft.action;
import java.util.Map;
import org.apache.struts2.interceptor.RequestAware;
import com.nesoft.service.LogRegService;
import com.neusoft.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
public class StudentAction extends ActionSupport implements ModelDriven<User>,Preparable,RequestAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String pw;
	private Map<String, Object> request;
	private LogRegService logRegService;
	public void setLogRegService(LogRegService logRegService) {
		this.logRegService = logRegService;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return pw;
	}
	private User user;
	public void prepareFind(){
		user = new User();
	}
   public String find(){
	   String username = user.getUsername();
	   long password = user.getPassword();
        User user=  logRegService.login(username,password);
         return SUCCESS; 
   }
@Override
public User getModel() {
	// TODO Auto-generated method stub
	return user;
}
@Override
public void setRequest(Map<String, Object> arg0) {
	// TODO Auto-generated method stub
	request = arg0;
}
@Override
public void prepare() throws Exception {
	// TODO Auto-generated method stub
}
}
