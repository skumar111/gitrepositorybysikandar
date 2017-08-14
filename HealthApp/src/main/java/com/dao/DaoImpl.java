package com.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entity.UserInfo;

@Repository("dao")
@Transactional
public class DaoImpl implements UserDao
{
	@Autowired
	SessionFactory session;

	@Override
	public int saveUser(UserInfo userInfo) 
	{
		session.openSession().save(userInfo);
		return 0;
	}

}
