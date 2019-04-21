package com.tucker.springbootmybatis.mapper;

import com.tucker.springbootmybatis.bean.Department;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

//操作数据库mapper
/*@Mapper*/
@Repository(value = "departmentMapper")
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int upDateDept(Department department);
}
