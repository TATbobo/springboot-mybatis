package com.tucker.springbootmybatis.mapper;

import com.tucker.springbootmybatis.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/*@Mapper*/
@Repository(value = "employeeMapper")
public interface EmployeeMapper {
    public Employee getEmpById(Integer id);
    public int insertEmp(Employee employee);
}
