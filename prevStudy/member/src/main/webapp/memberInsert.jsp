<%@page import="kr.co.dongwoo.member.dao.MembersldwDAO"%>	 
<%@page import="kr.co.dongwoo.member.vo.MembersldwVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
//java 코드가 들어감. 
	//브라우저의 입력폼에서 넘어온 자료를 하나씩 넘겨받기 ojdbc8.jar 필요
	String memId= request.getParameter("memId");	//html에서 입력받은 자료를 가져와서 저장하겠다
	String memPwd = request.getParameter("memPwd");
	String address = request.getParameter("address");
	
	//콘솔 창에서 확인해보기
	System.out.println("넘겨받은 아이디: " + memId + "입니다.");
	System.out.println("넘겨받은 비밀번호: " + memPwd + "입니다.");
	System.out.println("넘겨받은 주소: " + address + "입니다.");
	
	//넘겨받은 낱개의 자료들을 하나의 자료로 묶어서 정의한다. memberVO 객체
	MembersldwVO vo = new MembersldwVO();
	vo.setAddress(address);
	vo.setMemId(memId);
	vo.setMemPwd(memPwd);
	
	//묶음 자료를 줄테니 데이터베이스에 저장해라
	vo.setAddress(address);
	vo.setMemId(memId);
	vo.setMemPwd(memPwd);
	System.out.println("jsp vo=>"+ vo);
	MembersldwDAO dao = new MembersldwDAO();
	dao.insert(vo);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입이 완료되었습니다.</h1>
	<h2><%=memId %>님 반갑습니다.</h2>
</body>
</html>