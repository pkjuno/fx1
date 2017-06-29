package com.choa.qna;

import java.util.HashMap;
import java.util.Map;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QnaDAO {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "QnaMapper.";
	
	
	public int write(QnaDTO qnaDTO) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("qnaDTO", qnaDTO);
		sqlSession.insert(NAMESPACE+"write", map);
		//return 되어 오는 result는 map에 들어있기 떄문에 map에서 꺼낸다.
		int result = (Integer) map.get("result");
		System.out.println(result);
		return 0;
	}
	
	public int update(QnaDTO qnaDTO) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("qnaDTO", qnaDTO);
		sqlSession.update(NAMESPACE+"update", map);
		Integer result = (Integer)map.get("result");
		System.out.println(result);
		return result;
	}
	
	
	
}
