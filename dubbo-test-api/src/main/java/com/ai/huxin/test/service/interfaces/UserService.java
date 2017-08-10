package com.ai.huxin.test.service.interfaces;

import com.ai.huxin.test.vo.UserVo;

import java.util.List;

/**
 * Created by huxin on 2017/8/9.
 */
public interface UserService {
    /**
     * 根据用户ID查询用户信息
     * @param userId 用户ID
     * @return
     */
    public UserVo queryUserByPK (long userId);

    /**
     * 查询用户信息
     *
     * @return
     */
    public List<UserVo> queryUser ();

    /**
     * 增加用户
     *@param userVo 用户信息
     * @return
     */
    public int insertUser (UserVo userVo);
}
