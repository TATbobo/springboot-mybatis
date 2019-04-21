package com.tucker.springbootmybatis.controller;

import com.tucker.springbootmybatis.bean.Department;
import com.tucker.springbootmybatis.bean.Employee;
import com.tucker.springbootmybatis.mapper.DepartmentMapper;
import com.tucker.springbootmybatis.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class deptController {

    final
    DepartmentMapper departmentMapper;

    final
    EmployeeMapper employeeMapper;

    public deptController(DepartmentMapper departmentMapper, EmployeeMapper employeeMapper) {
        this.departmentMapper = departmentMapper;
        this.employeeMapper = employeeMapper;
    }

    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department department){
        departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        return employeeMapper.getEmpById(id);
    }

}
