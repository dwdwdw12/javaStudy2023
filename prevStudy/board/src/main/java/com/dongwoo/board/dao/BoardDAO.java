package com.dongwoo.board.dao;

import java.util.List;

import com.dongwoo.board.BoardVO;

public interface BoardDAO {
	public int insert(BoardVO vo); //Create, 테이블에 데이터 만들어 넣기...insert
	public int delete(long boardNo);//Delete, 테이블에 데이터 삭제 
									//boardNo만 활용하여 삭제 
									//delete(BoardVO vo)로 작성해도 동작(BoardVO에도 boardNo가 존재. 효율 저하, 비권장)
	public int update(BoardVO vo);	//Update, 테이블에 데이터 수정
	
	//Read, 테이블에 저장된 자료 읽기...select 
	//=> 자료의 개수, 한꺼번에 전부 읽어올 수도 있고, 하나의 게시글을 읽어올 때도 있고, 한번에 20개씩(한 페이지에 나타낼) 읽어올 때도 있다.
	public long getCount(); //갯수 읽기
	public List<BoardVO> getAll();	//BoardVO로 이루어진 배열, 전부 읽기	//ctrl+shift+o
	public BoardVO getOne(long boardNo);	//하나씩 읽기
	public List<BoardVO> getPage(int startNum, int endNum);	//page 단위
	
}
