package com.demoweb.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.demoweb.entity.BoardCommentEntity;

public interface CommentRepository extends CrudRepository<BoardCommentEntity, Integer> {

	@Query(
		value = "SELECT bc.* FROM tbl_comment bc WHERE board_no = :boardNo",
		nativeQuery = true
	)
	List<BoardCommentEntity> findByBoardNo(@Param("boardNo") int boardNo);
	
	@Modifying
	@Query(
		value = "UPDATE tbl_comment SET board_no = :boardNo, group_no = :commentNo WHERE comment_no = :commentNo",
		nativeQuery = true
	)
	@Transactional
	void updateGeneratedData(@Param("boardNo") int boardNo, @Param("commentNo") int commentNo);


}
