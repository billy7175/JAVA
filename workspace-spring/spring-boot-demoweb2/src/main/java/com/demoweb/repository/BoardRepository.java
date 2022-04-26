package com.demoweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.demoweb.entity.BoardAttachEntity;
import com.demoweb.entity.BoardEntity;

public interface BoardRepository extends CrudRepository<BoardEntity, Integer> {
	
	@Query(
		value = "SELECT * FROM tbl_board b ORDER BY b.board_no DESC LIMIT :from, :count",
		nativeQuery = true
	)
	List<BoardEntity> findAllWithPaging(@Param("from") int from, @Param("count") int count);

	@Query(
		"SELECT ba FROM BoardAttachEntity ba WHERE ba.attachNo = :attachNo"
	)
	BoardAttachEntity findBoardAttachByAttachNo(@Param("attachNo") int attachNo);

	@Query(
		value = "UPDATE tbl_board SET read_count = read_count + 1 WHERE board_no = :boardNo",
		nativeQuery = true
	)
	void updateBoardReadCount(@Param("boardNo") int boardNo);
	
}
