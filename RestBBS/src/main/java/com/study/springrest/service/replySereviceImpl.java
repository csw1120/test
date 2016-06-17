package com.study.springrest.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.study.springrest.domain.ReplyVO;
import com.study.springrest.persistence.ReplyDAO;
import com.study.springrest.persistence.RestDAO;
@Service
public class replySereviceImpl implements ReplyService {
	@Inject
	private ReplyDAO dao;
	
	@Inject
	private RestDAO restDao;
	
	@Transactional
	@Override
	public void insert(ReplyVO vo) {
		
		restDao.increaseReply(vo.getBoard_no());
		dao.insert(vo);

	}

	@Override
	public ReplyVO get(int reply_no) {
		return dao.get(reply_no);
	}

	@Override
	public List<ReplyVO> getList() {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
		return dao.getList();
	}

	@Override
	public void update(ReplyVO vo) {
		dao.update(vo);

	}

	@Override
	public void delete(int reply_no) {
		dao.delete(reply_no);

	}

}
