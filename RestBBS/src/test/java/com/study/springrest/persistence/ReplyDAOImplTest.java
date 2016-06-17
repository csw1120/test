package com.study.springrest.persistence;


import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.springrest.domain.ReplyVO;
import com.study.springrest.persistence.ReplyDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class ReplyDAOImplTest {
	@Inject
	private ReplyDAO dao;
	@Test
	public void test(){
		System.out.println("Test DAO = "+dao);
	}

	
	@Test
	public void insertTest()throws Exception{
		ReplyVO vo = new ReplyVO();
		vo.setContent("내용");
		vo.setUser_name("csw");
		vo.setBoard_no(0);
		dao.insert(vo);
	}
	@Test
	public void getTest() throws Exception{
		ReplyVO vo = dao.get(1);
		System.out.println("내용 ="+ vo.getContent());
	}
	@Test
	public void getListTest() throws Exception{
		List<ReplyVO> list = dao.getList();
		Iterator<ReplyVO> it = list.iterator();
		while(it.hasNext()){
			ReplyVO vo = it.next();
			System.out.println("내용 ="+ vo.getContent());
		}
	}
	@Test
	public void updateTest()throws Exception{
		ReplyVO vo = new ReplyVO();
		vo.setUser_name("csw");
		vo.setContent("내용입니다");
		vo.setBoard_no(1);
		dao.update(vo);
	}
	@Test
	public void deleteTest() throws Exception{
		dao.delete(1);
	}
}
