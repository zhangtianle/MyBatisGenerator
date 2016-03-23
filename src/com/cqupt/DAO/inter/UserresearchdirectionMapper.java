package com.cqupt.DAO.inter;

import com.cqupt.model.pojo.Userresearchdirection;
import com.cqupt.model.pojo.UserresearchdirectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserresearchdirectionMapper {
    int countByExample(UserresearchdirectionExample example);

    int deleteByExample(UserresearchdirectionExample example);

    int deleteByPrimaryKey(Integer userresearchdirectionid);

    int insert(Userresearchdirection record);

    int insertSelective(Userresearchdirection record);

    List<Userresearchdirection> selectByExample(UserresearchdirectionExample example);

    Userresearchdirection selectByPrimaryKey(Integer userresearchdirectionid);

    int updateByExampleSelective(@Param("record") Userresearchdirection record, @Param("example") UserresearchdirectionExample example);

    int updateByExample(@Param("record") Userresearchdirection record, @Param("example") UserresearchdirectionExample example);

    int updateByPrimaryKeySelective(Userresearchdirection record);

    int updateByPrimaryKey(Userresearchdirection record);
}