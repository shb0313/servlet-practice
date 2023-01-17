package com.douzone.guestbook.dao.test;

import java.util.List;

import com.douzone.guestbook.dao.GuestBookDao;
import com.douzone.guestbook.vo.GuestBookVo;

public class GuestBookDaoTest {

	public static void main(String[] args) {
		testInsert();
		testFindAll();	
	}

	private static void testInsert() {
		GuestBookVo vo = null;
		GuestBookDao dao = new GuestBookDao();
		
		vo = new GuestBookVo();
		vo.setName("마마마마");
		vo.setPassword("1456");
		vo.setMessage("호이호이");
		dao.insert(vo);

		vo = new GuestBookVo();
		vo.setName("둘둘");
		vo.setPassword("1235");
		vo.setMessage("보글보글");
		dao.insert(vo);
	
	}

	private static void testFindAll() {
		List<GuestBookVo> list = new GuestBookDao().findAll();
		for(GuestBookVo vo : list) {
			System.out.println(vo);
		}
	}
}
