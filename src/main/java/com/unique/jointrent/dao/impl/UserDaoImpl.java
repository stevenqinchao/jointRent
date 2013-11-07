package com.unique.jointrent.dao.impl;

import org.springframework.stereotype.Repository;

import com.unique.jointrent.dao.UserDao;
import com.unique.jointrent.util.BusinessException;


@Repository("userDao")
public class UserDaoImpl implements UserDao {


    public void exception() throws Exception{
        System.out.println("enter into userDaoImpl");
        throw new BusinessException("10", "dao");  
    }

}
