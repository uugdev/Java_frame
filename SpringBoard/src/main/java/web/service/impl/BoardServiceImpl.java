package web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.dao.face.BoardDao;
import web.dto.Board;
import web.service.face.BoardService;
import web.util.Paging;

@Service
public class BoardServiceImpl implements BoardService {

	//DAO 객체
	@Autowired BoardDao boardDao;

	@Override
	public List<Board> getList(Paging paging) {

		return boardDao.selectBoardList(paging);
	}

	@Override
	public Paging getPaging(Paging paramData) {
		//총 게시글 수 조회
		int totalCount = boardDao.selectCntAll();

		//페이징 계산
		Paging paging = new Paging(totalCount, paramData.getCurPage());
		
		return paging;
	}


}

