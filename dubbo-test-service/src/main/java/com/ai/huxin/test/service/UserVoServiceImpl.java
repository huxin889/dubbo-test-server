package com.ai.huxin.test.service;

import com.ai.huxin.test.mapper.user.UserVoMapper;
import com.ai.huxin.test.service.interfaces.UserService;
import com.ai.huxin.test.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by huxin on 2017/8/9.
 */
@Service
public class UserVoServiceImpl implements UserService {
    @Autowired
    private UserVoMapper userVoMapper;
    /**
     * 根据用户ID查询用户信息
     *
     * @param userId 用户ID
     * @return
     */
    public UserVo queryUserByPK(long userId) {
        return userVoMapper.selectByPrimaryKey(userId);
    }

    /**
     * 查询用户信息
     *
     * @return
     */
    public List<UserVo> queryUser() {
        return null;
    }

    /**
     * 增加用户
     *
     * @param userVo 用户信息
     * @return
     */
    public int insertUser(UserVo userVo) {
        return userVoMapper.insert(userVo);
    }
}
