package com.zx.mapper;

import com.zx.domain.TReply;

public interface TReplyMapper {
    int deleteByPrimaryKey(Integer replyid);

    int insert(TReply record);

    int insertSelective(TReply record);

    TReply selectByPrimaryKey(Integer replyid);

    int updateByPrimaryKeySelective(TReply record);

    int updateByPrimaryKey(TReply record);
}