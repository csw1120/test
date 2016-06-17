package com.study.springrest.service;

import java.util.List;

import com.study.springrest.domain.ReplyVO;

public interface ReplyService {
		public void insert(ReplyVO vo);
		public ReplyVO get(int reply_no);
		public List<ReplyVO> getList();
		public void update(ReplyVO vo);
		public void delete(int reply_no);
}
