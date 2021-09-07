package com.godcoder.myhomepage.repository;

import com.godcoder.myhomepage.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
