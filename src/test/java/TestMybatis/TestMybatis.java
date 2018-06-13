package TestMybatis;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.lwyykj.core.bean.hps.Bank;
import com.lwyykj.core.service.TestService;

public class TestMybatis {  
	    private static Logger logger = Logger.getLogger(TestMybatis.class);  
	  private ApplicationContext ac = null;  
	    @Resource  
	    private TestService testService=null;
//	    private IUserService userService = null;  
	    
	  
	  @Before  
	  public void before() {  
	      ac = new ClassPathXmlApplicationContext("application-context.xml");  
	      testService=  (TestService) ac.getBean("TestService");  
	  }  
	  
	    @Test  
	    public void test1() {  
	    	Bank bank = testService.selectById(1);
//	        User user = userService.getUserById(1);  
	    	System.out.println(bank.getBankid());
	        // System.out.println(user.getUserName());  
	        // logger.info("值："+user.getUserName());  
	    	logger.info("值为："+ bank.getBankid());
	        logger.info(JSON.toJSONString(bank));  
	    }  
	}  

