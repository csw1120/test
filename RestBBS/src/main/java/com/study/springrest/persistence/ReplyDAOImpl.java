package com.study.springrest.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.study.springrest.domain.ReplyVO;

@Repository
public class ReplyDAOImpl implements ReplyDAO {
	
	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.study.springrest.mapper.replyMapper";
	@Override
	public void insert(ReplyVO vo) {
		sqlSession.insert(namespace+".insert",vo);
	}

	@Override
	public ReplyVO get(int reply_no) {
		return sqlSession.selectOne(namespace+".get", reply_no);
	}

	@Override
	public List<ReplyVO> getList() {
		return sqlSession.selectList(namespace+".getList");
	}

	@Override
	public void update(ReplyVO vo) {
		sqlSession.update(namespace+".update",vo);
	}

	@Override
	public void delete(int reply_no) {
		sqlSession.delete(namespace+".delete", reply_no);
	}
}
