package com.dmf.weixin.admin.mapper;

import com.dmf.weixin.admin.pojo.SysButtons;
import com.dmf.weixin.admin.pojo.SysButtonsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysButtonsMapper {
    int countByExample(SysButtonsExample example);

    int deleteByExample(SysButtonsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysButtons record);

    int insertSelective(SysButtons record);

    List<SysButtons> selectByExample(SysButtonsExample example);

    SysButtons selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysButtons record, @Param("example") SysButtonsExample example);

    int updateByExample(@Param("record") SysButtons record, @Param("example") SysButtonsExample example);

    int updateByPrimaryKeySelective(SysButtons record);

    int updateByPrimaryKey(SysButtons record);
}