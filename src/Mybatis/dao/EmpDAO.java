package Mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import Mybatis.service.FactoryService;
import Mybatis.vo.EmpVO;

public class EmpDAO {
	public static EmpVO[] getAll(){
		SqlSession ss = FactoryService.getFactory().openSession();
		List<EmpVO> list = ss.selectList("emp.all");
		ss.close();
		
		EmpVO[] value = null;
		if(list!=null&list.size()>0){
			value = new EmpVO[list.size()];
			list.toArray(value);
		}
		return value;
	}
	
	public static EmpVO[] getsearchName(String name){
		SqlSession ss = FactoryService.getFactory().openSession();
		List<EmpVO> list = ss.selectList("emp.searchName", name);
		ss.close();
		
		EmpVO[] value = null;
		
		if(list!=null&&list.size()>0){
			value = new EmpVO[list.size()];
			list.toArray(value);
		}
		return value;
	}
}
