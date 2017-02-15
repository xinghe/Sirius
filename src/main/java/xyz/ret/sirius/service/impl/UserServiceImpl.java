package xyz.ret.sirius.service.impl;

import org.springframework.stereotype.Service;
import xyz.ret.sirius.dao.IUserDao;
import xyz.ret.sirius.model.User;
import xyz.ret.sirius.service.IUserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by fury on 17-2-11.
 */

@Service("userService")
public class UserServiceImpl implements IUserService{
    @Resource
    private IUserDao userDao;

    public List<User> getUsers(){
        return userDao.findAll();
    }
}
