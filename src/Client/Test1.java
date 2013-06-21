package Client;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import Mybatis.vo.EmpVO;

public class Test1 {

	public static void main(String[] args) {
		
		try {
			Reader r = Resources.getResourceAsReader("Mybatis/config/configuration.xml");
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
			r.close();
			SqlSession ss = factory.openSession();
			
			List<EmpVO> list = ss.selectList("emp.all");
			
			for(EmpVO vo:list){
				System.out.println(vo.getEmployee_id()+","+vo.getFirst_name()+","+vo.getJob_id());
			}
		} catch (Exception e) {
		}
		
		
	}

}
