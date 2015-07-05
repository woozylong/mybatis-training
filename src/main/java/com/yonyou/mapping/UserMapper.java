package com.yonyou.mapping;

import com.yonyou.model.User;

public interface UserMapper {

	public User getUser(int id);
	
	public User getUserAsso(int id);
}
