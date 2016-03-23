package com.cqupt.DAO.inter;

import com.cqupt.model.pojo.Professionaltitle;
import com.cqupt.model.pojo.ProfessionaltitleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfessionaltitleMapper {
    int countByExample(ProfessionaltitleExample example);

    int deleteByExample(ProfessionaltitleExample example);

    int deleteByPrimaryKey(Integer professionaltitleid);

    int insert(Professionaltitle record);

    int insertSelective(Professionaltitle record);

    List<Professionaltitle> selectByExample(ProfessionaltitleExample example);

    Professionaltitle selectByPrimaryKey(Integer professionaltitleid);

    int updateByExampleSelective(@Param("record") Professionaltitle record, @Param("example") ProfessionaltitleExample example);

    int updateByExample(@Param("record") Professionaltitle record, @Param("example") ProfessionaltitleExample example);

    int updateByPrimaryKeySelective(Professionaltitle record);

    int updateByPrimaryKey(Professionaltitle record);
}