package com.pae.server.board.service;

import com.pae.server.board.domain.MatchingBoard;
import com.pae.server.board.dto.request.CreateMatchingBoardDto;
import com.pae.server.board.dto.request.UpdateMatchingBoardDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BoardService {
    MatchingBoard createMatchingBoard(CreateMatchingBoardDto dto); //육아도우미 게시판 생성
    MatchingBoard updateMatchingBoard(Long boardId, UpdateMatchingBoardDto dto); //육아도우미 게시판 수정
    MatchingBoard deleteMatchingBoard(Long boardId); //육아도우미 게시판 삭제
    List<MatchingBoard> getMatchingBoardList(); //육아도우미 게시판 목록 조회
    List<MatchingBoard> getJobSearchList(); //구직용 육아도우미 게시판 조회
    List<MatchingBoard> getJobOpenningList(); //구인용 육아도우미 게시판 조회
    MatchingBoard getMatchingBoard(Long boardId);
    List<MatchingBoard> getSearchResult(String keyWord);
    List<MatchingBoard> getViewCountResult();
    List<MatchingBoard> getRecentResult();
}
