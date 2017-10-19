package com.neusoft.inter;

import com.neusoft.model.User;
import com.neusoft.model.UserInfo;

public interface LogandReg {
  public  User login(String username,long password);
  public void register(UserInfo userInfo, User user);
}
