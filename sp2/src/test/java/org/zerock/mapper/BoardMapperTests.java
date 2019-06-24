package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Autowired
	BoardMapper mapper;
	@Test
	public void testInsert() {
		BoardVO vo = new BoardVO();
		vo.setContent("���� ����");
		vo.setTitle("���� ����");
		vo.setWriter("user01");
		mapper.insert(vo);
	}
	
	@Test
	public void testDelete() {
		int count = mapper.delete(6);
		mapper.delete(count);
	}
	
	@Test
	public void testUpdate() {
		BoardVO vo = mapper.select(5);
		vo.setTitle("������ ����");
		vo.setContent("������ ����");
		
		int count = mapper.update(vo);
		mapper.update(vo);
	}
	
}
