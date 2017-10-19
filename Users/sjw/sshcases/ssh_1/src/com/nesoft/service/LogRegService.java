package com.nesoft.service;

import org.springframework.transaction.annotation.Transactional;

import com.nesoft.dao.LogRegDao;
import com.neusoft.model.User;
import com.neusoft.model.UserInfo;
@Transactional
public class LogRegService {
   private LogRegDao logRegDao;
   public void setLogRegDao(LogRegDao logRegDao) {
	this.logRegDao = logRegDao;
   }
   public User login(String username,long password){
	      User user =  logRegDao.login(username, password);
	       return user;
   }
   public void register(UserInfo userinfo,User user){
	        logRegDao.register(userinfo,user);
   }
}
