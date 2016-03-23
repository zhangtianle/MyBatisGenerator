package com.cqupt.DAO.inter;

import com.cqupt.model.pojo.Researchteam;
import com.cqupt.model.pojo.ResearchteamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResearchteamMapper {
    int countByExample(ResearchteamExample example);

    int deleteByExample(ResearchteamExample example);

    int deleteByPrimaryKey(Integer researchteamid);

    int insert(Researchteam record);

    int insertSelective(Researchteam record);

    List<Researchteam> selectByExample(ResearchteamExample example);

    Researchteam selectByPrimaryKey(Integer researchteamid);

    int updateByExampleSelective(@Param("record") Researchteam record, @Param("example") ResearchteamExample example);

    int updateByExample(@Param("record") Researchteam record, @Param("example") ResearchteamExample example);

    int updateByPrimaryKeySelective(Researchteam record);

    int updateByPrimaryKey(Researchteam record);
}