package com.cqupt.DAO.inter;

import com.cqupt.model.pojo.Researchdirection;
import com.cqupt.model.pojo.ResearchdirectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResearchdirectionMapper {
    int countByExample(ResearchdirectionExample example);

    int deleteByExample(ResearchdirectionExample example);

    int deleteByPrimaryKey(Integer researchdirectionid);

    int insert(Researchdirection record);

    int insertSelective(Researchdirection record);

    List<Researchdirection> selectByExample(ResearchdirectionExample example);

    Researchdirection selectByPrimaryKey(Integer researchdirectionid);

    int updateByExampleSelective(@Param("record") Researchdirection record, @Param("example") ResearchdirectionExample example);

    int updateByExample(@Param("record") Researchdirection record, @Param("example") ResearchdirectionExample example);

    int updateByPrimaryKeySelective(Researchdirection record);

    int updateByPrimaryKey(Researchdirection record);
}