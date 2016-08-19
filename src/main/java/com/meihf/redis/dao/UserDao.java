package com.meihf.redis.dao;

import com.meihf.redis.entity.User;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;

import java.io.Serializable;
import java.util.List;

/**
 * 浙江卓锐科技股份有限公司
 *
 * @author meihf
 * @date 2016/8/18
 * @description
 */
public interface UserDao {

    public User getUser(String id);

    public boolean saveUser(final User user);

    public boolean saveUser(final List<User> list);

    public void delete(Serializable key);

    public void delete(List<Serializable> keys);

    public boolean update(final User user);

}
