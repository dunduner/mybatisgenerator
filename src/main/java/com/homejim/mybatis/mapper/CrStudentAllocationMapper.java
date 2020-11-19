package com.homejim.mybatis.mapper;

import com.homejim.mybatis.entity.CrStudentAllocation;
import com.homejim.mybatis.entity.CrStudentAllocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrStudentAllocationMapper {
    long countByExample(CrStudentAllocationExample example);

    int deleteByExample(CrStudentAllocationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CrStudentAllocation record);

    int insertSelective(CrStudentAllocation record);

    List<CrStudentAllocation> selectByExample(CrStudentAllocationExample example);

    CrStudentAllocation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CrStudentAllocation record, @Param("example") CrStudentAllocationExample example);

    int updateByExample(@Param("record") CrStudentAllocation record, @Param("example") CrStudentAllocationExample example);

    int updateByPrimaryKeySelective(CrStudentAllocation record);

    int updateByPrimaryKey(CrStudentAllocation record);
}