package com.dmf.weixin.admin.mapper;

import com.dmf.weixin.admin.pojo.SysModules;
import com.dmf.weixin.admin.pojo.SysModulesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysModulesMapper {
    int countByExample(SysModulesExample example);

    int deleteByExample(SysModulesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysModules record);

    int insertSelective(SysModules record);

    List<SysModules> selectByExample(SysModulesExample example);

    SysModules selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysModules record, @Param("example") SysModulesExample example);

    int updateByExample(@Param("record") SysModules record, @Param("example") SysModulesExample example);

    int updateByPrimaryKeySelective(SysModules record);

    int updateByPrimaryKey(SysModules record);
}