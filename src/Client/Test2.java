package Client;

import Mybatis.dao.EmpDAO;
import Mybatis.vo.EmpVO;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			EmpVO[] value = EmpDAO.getAll();
			for(EmpVO vo:value){
				System.out.println(vo.getEmployee_id()+','+vo.getFirst_name()+','+vo.getJob_id());
			}
		} catch (Exception e) {
		}
	}

}
