package com.ram.app.dao;
import com.ram.app.entities.UserInfo;
public interface UserInfoDAO {
	public abstract UserInfo getActiveUser(String userName);
}