package com.ai.huxin.test.mapper.user;

import com.ai.huxin.test.vo.UserVo;

import java.util.List;

public interface UserVoMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(UserVo record);

    int insertSelective(UserVo record);

    UserVo selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(UserVo record);

    int updateByPrimaryKey(UserVo record);

    /**
     * 查询用户信息
     *
     * @return
     */
    public List<UserVo> queryUser ();
}