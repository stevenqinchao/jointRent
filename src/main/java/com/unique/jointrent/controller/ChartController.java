package com.unique.jointrent.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.unique.jointrent.model.User;
import com.unique.jointrent.service.UserService;
import com.unique.jointrent.service.impl.UserServiceImpl;
import com.unique.jointrent.util.BusinessException;
import com.unique.jointrent.util.JSONResult;


@Controller
public class ChartController {

    private static final Logger logger = LoggerFactory.getLogger(ChartController.class);

    @Resource
    private UserService userService;
    /**
     * method description goes here
     * 
     * @param args
     */
    @RequestMapping(value = "/jquerypie", method = RequestMethod.GET)
    public String pie(Model model) {
        // TODO Auto-generated method stub
        return "jquerypie";

    }

    @RequestMapping(value = "/extjspie")
    public String pie1(Model model) {
        // TODO Auto-generated method stub
        System.out.println("___________ enter extjspie");
        return "extjspie";

    }
    
    @RequestMapping(value = "/base")
    public String base(Model model) {
        // TODO Auto-generated method stub
        User OrganizationalGoal = new User();
        OrganizationalGoal.setName("test");
        model.addAttribute( "OrganizationalGoal" ,  OrganizationalGoal);
        System.out.println("___________ enter extjspie");
        return "base";

    }
    
    @RequestMapping(value = "/test")
    public String test(Model model) {
        // TODO Auto-generated method stub
        System.out.println("___________ enter extjspie");
        return "test";

    }
    
    @RequestMapping(value = "/customerUI")
    public String customerUI(Model model) throws Exception{
        // TODO Auto-generated method stub
        return "customerUI";

    }
    
    @RequestMapping(value = "/bookmarks")
    public ModelAndView bookmarks(Model model) {
        // TODO Auto-generated method stub
        return new ModelAndView("bookmarks");

    }
    
    @RequestMapping(value = "/checkUsername" , method = RequestMethod.GET)
    @ResponseBody
    public Object[] checkUsername(String fieldId, String username) {
        // TODO Auto-generated method stub
        System.out.println(username);
        
        boolean inUse = false;
        if(username.equals("admin")){
            inUse= true;
        }
        Object[] val = new Object[3];
        val[0] = fieldId;
        val[1] = !inUse;
        
        try {Thread.sleep(10000);}
        catch (InterruptedException e) {}
        return val;

    }

    @RequestMapping(value = "/pieData")
    @ResponseBody
    public Object pieData(Model model , HttpServletRequest request) throws Exception{
        // TODO Auto-generated method stub
        
/*        try {Thread.sleep(10000);}
        catch (InterruptedException e) {}*/
        
        List<User> empList = new ArrayList<User>();

        User emp1 = new User();
        emp1.setId(1);
        emp1.setName("steven");
        emp1.setData1(10);
        empList.add(emp1);

        User emp2 = new User();
        emp2.setId(2);
        emp2.setName("daniel");
        emp2.setData1(25);
        empList.add(emp2);

        User emp3 = new User();
        emp3.setId(3);
        emp3.setName("emily");
        emp3.setData1(7);
        empList.add(emp3);

        User emp4 = new User();
        emp4.setId(4);
        emp4.setName("heather");
        emp4.setData1(4);
        empList.add(emp4);
        
        //try{
           //userService.exception();   
        /*}catch(Exception e){
            return "{success:false}";
        }*/
        
        /*JSONResult jsonResult = new JSONResult();
        jsonResult.setSuccess(true);*/
        

        return empList;
    }
    
    
    @RequestMapping(value = "/testController")
    public void testController(Model model) throws Exception{
        // TODO Auto-generated method stub
        throw new BusinessException("30", "controller");
        
    }
    
    @RequestMapping(value = "/testService")
    public void testService(Model model) throws Exception{
        // TODO Auto-generated method stub
        userService.exception();
        
    }
    
    @RequestMapping(value = "/testDao")
    public void testDao(Model model) throws Exception{
        // TODO Auto-generated method stub
        userService.exceptionDao();
    }

}
