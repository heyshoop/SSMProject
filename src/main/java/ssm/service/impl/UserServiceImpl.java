package ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ssm.dao.IUserDao;
import ssm.domain.User;
import ssm.service.IUserService;

@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private IUserDao userDao;  
    @Override  
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(userId);  
    }
}