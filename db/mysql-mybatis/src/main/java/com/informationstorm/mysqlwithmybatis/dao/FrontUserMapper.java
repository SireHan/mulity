package com.informationstorm.mysqlwithmybatis.dao;

import com.informationstorm.mysqlwithmybatis.model.FrontUser;
import com.informationstorm.mysqlwithmybatis.model.FrontUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontUserMapper {
    long countByExample(FrontUserExample example);

    int deleteByExample(FrontUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FrontUser record);

    int insertSelective(FrontUser record);

    List<FrontUser> selectByExample(FrontUserExample example);

    FrontUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FrontUser record, @Param("example") FrontUserExample example);

    int updateByExample(@Param("record") FrontUser record, @Param("example") FrontUserExample example);

    int updateByPrimaryKeySelective(FrontUser record);

    int updateByPrimaryKey(FrontUser record);
}