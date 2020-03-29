package com.zx.mapper;

import com.zx.domain.TTopic;

public interface TTopicMapper {
    int deleteByPrimaryKey(Integer topicid);

    int insert(TTopic record);

    int insertSelective(TTopic record);

    TTopic selectByPrimaryKey(Integer topicid);

    int updateByPrimaryKeySelective(TTopic record);

    int updateByPrimaryKey(TTopic record);
}