package com.meihf.redis.test;

import com.meihf.redis.dao.UserDao;
import com.meihf.redis.entity.User;
import com.meihf.redis.main.RedisClientTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 浙江卓锐科技股份有限公司
 *
 * @author meihf
 * @date 2016/8/18
 * @description
 */
public class test {
//    public static void main(String[] args) {
//        ApplicationContext ac =  new ClassPathXmlApplicationContext("classpath:/data-source.xml");
//        RedisClientTemplate redisClient = (RedisClientTemplate)ac.getBean("redisClientTemplate");
//        redisClient.set("ab", "abc");
//        System.out.println(redisClient.get("a"));
//    }

    public static void main(String[] args) {
        ApplicationContext ac =  new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
        UserDao userDAO = (UserDao)ac.getBean("userDAO");
        User user1 = new User();
        user1.setId("1");
        user1.setName("obama");
        userDAO.saveUser(user1);
        User user2 = userDAO.getUser("1");
        System.out.println(user2.getName());
    }
}
