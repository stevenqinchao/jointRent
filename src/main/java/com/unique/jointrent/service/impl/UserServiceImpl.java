package com.unique.jointrent.service.impl;

import org.springframework.stereotype.Service;

import com.unique.jointrent.dao.UserDao;
import com.unique.jointrent.service.UserService;
import com.unique.jointrent.util.BusinessException;

@Service("userService")
public class UserServiceImpl implements UserService {

    private  UserDao userDao;

    public void exception() throws Exception {  
        System.out.println("enter into UserServiceImpl");
        //throw new BusinessException("20", "service");  
    }
    
    public void exceptionDao() throws Exception {  
        userDao.exception();
          
    }
}
