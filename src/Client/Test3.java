package Client;

import java.util.Scanner;

import Mybatis.dao.EmpDAO;
import Mybatis.vo.EmpVO;

public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Search Name: ");
		String name = scan.nextLine();
		
		EmpVO[] value = EmpDAO.getsearchName(name);
		
		for(EmpVO vo:value){
			System.out.println(vo.getEmployee_id()+","+vo.getFirst_name()+','+vo.getJob_id());
		}
	}

}
