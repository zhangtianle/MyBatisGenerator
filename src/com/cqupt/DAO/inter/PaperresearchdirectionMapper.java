package com.cqupt.DAO.inter;

import com.cqupt.model.pojo.Paperresearchdirection;
import com.cqupt.model.pojo.PaperresearchdirectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperresearchdirectionMapper {
    int countByExample(PaperresearchdirectionExample example);

    int deleteByExample(PaperresearchdirectionExample example);

    int deleteByPrimaryKey(Integer paperresearchdirectionid);

    int insert(Paperresearchdirection record);

    int insertSelective(Paperresearchdirection record);

    List<Paperresearchdirection> selectByExample(PaperresearchdirectionExample example);

    Paperresearchdirection selectByPrimaryKey(Integer paperresearchdirectionid);

    int updateByExampleSelective(@Param("record") Paperresearchdirection record, @Param("example") PaperresearchdirectionExample example);

    int updateByExample(@Param("record") Paperresearchdirection record, @Param("example") PaperresearchdirectionExample example);

    int updateByPrimaryKeySelective(Paperresearchdirection record);

    int updateByPrimaryKey(Paperresearchdirection record);
}