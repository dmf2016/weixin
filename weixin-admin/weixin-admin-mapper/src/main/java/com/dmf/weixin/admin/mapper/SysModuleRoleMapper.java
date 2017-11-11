package com.dmf.weixin.admin.mapper;

import com.dmf.weixin.admin.pojo.SysModuleRole;
import com.dmf.weixin.admin.pojo.SysModuleRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysModuleRoleMapper {
    int countByExample(SysModuleRoleExample example);

    int deleteByExample(SysModuleRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysModuleRole record);

    int insertSelective(SysModuleRole record);

    List<SysModuleRole> selectByExample(SysModuleRoleExample example);

    SysModuleRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysModuleRole record, @Param("example") SysModuleRoleExample example);

    int updateByExample(@Param("record") SysModuleRole record, @Param("example") SysModuleRoleExample example);

    int updateByPrimaryKeySelective(SysModuleRole record);

    int updateByPrimaryKey(SysModuleRole record);
}