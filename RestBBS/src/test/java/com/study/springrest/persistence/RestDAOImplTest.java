package com.study.springrest.persistence;


import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.springrest.domain.RestVO;
import com.study.springrest.persistence.RestDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class RestDAOImplTest {
	@Inject
	private RestDAO dao;
	@Test
	public void test(){
		System.out.println("Test DAO = "+dao);
	}

	
	@Test
	public void insertTest()throws Exception{
		RestVO vo = new RestVO();
		vo.setTitle("제목입니다아");
		vo.setUser_name("csw");
		vo.setContent("1120");
		vo.setView_cnt(0);
		dao.insert(vo);
	}
	@Test
	public void getTest() throws Exception{
		RestVO vo = dao.get(1);
		System.out.println("제목 ="+ vo.getTitle());
	}
	@Test
	public void getListTest() throws Exception{
		List<RestVO> list = dao.getList();
		Iterator<RestVO> it = list.iterator();
		while(it.hasNext()){
			RestVO vo = it.next();
			System.out.println("제목 ="+ vo.getTitle());
		}
	}
	@Test
	public void updateTest()throws Exception{
		RestVO vo = new RestVO();
		vo.setBoard_no(4);
		vo.setTitle("수정");
		vo.setUser_name("수정");
		vo.setContent("수정입니다");
		dao.update(vo);
	}
	@Test
	public void deleteTest() throws Exception{
		dao.delete(3);
	}
}
