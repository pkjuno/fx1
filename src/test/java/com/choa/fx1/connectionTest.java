package com.choa.fx1;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.choa.qna.QnaDAO;
import com.choa.qna.QnaDTO;


public class connectionTest extends MyAbstarctTestUnit{

	@Autowired
	private QnaDAO qnaDAO;
	
	@Test
	public void test() throws Exception {
		QnaDTO qnaDTO = new QnaDTO();
	
		qnaDTO.setTitle("q2_489");
		qnaDTO.setContents("q2_489");
		qnaDTO.setNum(489);
		assertEquals(1, qnaDAO.update(qnaDTO));
		
	}

}
