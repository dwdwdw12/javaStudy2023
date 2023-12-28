package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.dongwoo.insa.DBUtil;
import com.dongwoo.insa.EmployeeVO;
import com.dongwoo.insa.service.EmployeeService;
import com.dongwoo.insa.service.EmployeeServiceImpl;

public class EmployeesTest {
	
	 EmployeeVO emp1;
	 EmployeeVO emp2;
	 EmployeeVO emp3;		//샘플 데이터 선언. 3~4개 
	 EmployeeService service = null;	//null은 생략해도 자동 입력
	 
	
	@Before			//test 어노테이션 전에 수행할 내용, 샘플 데이터 초기화 
	public void init() {
		emp1 = new EmployeeVO("dongwoo", "male", "1999-10-11", "010-123-1234", "lee@naver.com", "경기도 수원시");
		emp2 = new EmployeeVO("gildong", "male", "1998-10-10", "010-333-1234", "gil@naver.com", "경기도 이천시");
		emp3 = new EmployeeVO("hong", "male", "1997-10-09", "010-223-1234", "hong@naver.com", "경기도 평택시");
		service = new EmployeeServiceImpl();	//자주 사용되는 문장
		service.delAll();
		assertEquals(service.getCount(), 0);
	}
	
	@Test		//DB 연결 테스트
	@Ignore		//test에 통과했으므로, test 대상에서 무시하고 싶을 때,테스트하면 0.000초로 결과표시
	public void getConnection() {
		assertNotNull(DBUtil.getConnection());
	}
	
	@Test
	@Ignore
	public void delAllTest() {
		service.delAll();	//delete from employees;
		assertEquals(service.getCount(), 0); //select count(*) cnt from employees;
	}
	
//	@Test
//	public void insertTest() {
//		EmployeeService service = new EmployeeServiceImpl();
//		int result = service.insert(emp1);	//정수형으로 결과를 반환해달라
//		assertEquals(result, 1);
//		result = service.insert(emp2);
//		assertEquals(result, 1);
//		result = service.insert(emp3);
//		assertEquals(result, 1);
//	}
	
	@Test
	public void insertTest() {
		int result = service.insert(emp1);	//delAll() before 절로 이동
		assertEquals(result, 1);
		assertEquals(service.getCount(), 1);
		
		result = service.insert(emp2);
		assertEquals(result, 1);
		assertEquals(service.getCount(), 2);
		
		result = service.insert(emp3);
		assertEquals(result, 1);
		assertEquals(service.getCount(), 3);
		
//		EmployeeVO getOneData = service.getOne(1);
//		EmployeeVO getTwoData = service.getOne(2);
//		EmployeeVO getThreeData = service.getOne(3);
//		objEqual(emp1, getOneData);	
//		objEqual(emp2, getTwoData);	
//		objEqual(emp3, getThreeData);
		
		objEqual(emp1, service.getOne(1));	//값이 일치하는지 비교
		objEqual(emp2, service.getOne(2));
		objEqual(emp3, service.getOne(3));
	}
	
	public void objEqual(EmployeeVO inVO, EmployeeVO resVO) {
		assertEquals(inVO.getBirth(), resVO.getBirth().substring(0,10));	//date가 문자열로 바뀌면서 뒤에 자리수가 추가됨 
		assertEquals(inVO.getAddress(), resVO.getAddress());
		assertEquals(inVO.getEmail(), resVO.getEmail());
		assertEquals(inVO.getEmpName(), resVO.getEmpName());
		assertEquals(inVO.getGender(), resVO.getGender());
		assertEquals(inVO.getPhoneNo(), resVO.getPhoneNo()); //empNo는 제외
//		assertEquals(emp1.getHiredate(), getVO.getHiredate().substring(0,10));
//		assertEquals(emp1.getEmppos(), getVO.getEmppos());	//null값이 들어감
//		assertEquals(emp1.getEmpdep(), getVO.getEmpdep());
//		assertEquals(emp1.getEmpsal(), getVO.getEmpsal());	//emp1에 입력한 값만 비교하기
	
	}
	
	//각각의 자료를 꺼내와서 원하는 컬럼에 원하는 값이 정확하게 입력되었는지 체크
	@Test		//무조건 public void
	public void getOne() {
		int result = service.insert(emp1);
		assertEquals(result, 1);
		assertEquals(service.getCount(), 1);
		EmployeeVO getVO = service.getOne(1);	//하나를 입력했으므로 사원번호가 1
				
		objEqual(emp1,getVO);	//메서드로 이관
	
	}
	
	
}	//클래스의 끝
