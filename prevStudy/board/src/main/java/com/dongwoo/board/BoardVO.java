package com.dongwoo.board;

import java.util.Objects;

public class BoardVO {
	private long boardNo;	//오라클
	private String writer;			//입력대상
	private String boardTitle;		//입력대상
	private String boardContent;	//입력대상
	private String regiDate;	//오라클 서버의 날짜
	private int readCount;		//조회시 1씩 증가
	
	public BoardVO() {
		super();
	}

	public BoardVO(String writer, String boardTitle, String boardContent) {
		super();
		this.writer = writer;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		
	}

	public long getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(long boardNo) {
		this.boardNo = boardNo;				//권한이 없을 경우 set을 못하게끔 만들 수 있음
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getRegiDate() {
		return regiDate;
	}

	public void setRegiDate(String regiDate) {
		this.regiDate = regiDate;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(boardContent, boardNo, boardTitle, readCount, regiDate, writer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoardVO other = (BoardVO) obj;
		return Objects.equals(boardContent, other.boardContent) && boardNo == other.boardNo
				&& Objects.equals(boardTitle, other.boardTitle) && readCount == other.readCount
				&& Objects.equals(regiDate, other.regiDate) && Objects.equals(writer, other.writer);
	}

	@Override
	public String toString() {
		return "BoardVO [boardNo=" + boardNo + ", writer=" + writer + ", boardTitle=" + boardTitle + ", boardContent="
				+ boardContent + ", regiDate=" + regiDate + ", readCount=" + readCount + "]";
	}
	
	
	
}
