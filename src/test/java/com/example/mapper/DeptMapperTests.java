package com.example.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Dept;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeptMapperTests {
	
	@Autowired
	DeptMapper mapper;

	@Test
	public void test00_confirm(){
		System.out.println("mapper = " + mapper);
	}
	
	@Test
	public void test01_selectAll(){
		List<Dept> list = mapper.selectAll();
		
		for(Dept d : list){
			System.out.println(d);
		}
	}
	
	@Test
	public void test01_selectAllWithEmp(){
		List<Dept> list = mapper.selectAllWithEmp();
		
		for(Dept d : list){
			System.out.println(d);
		}
	}
	
	@Test
	public void test03_selectByDeptno(){
		Dept dept = mapper.selectByDeptno(10);
		
		System.out.println(dept);
	}
	
}
