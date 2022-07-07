package com.example.week03.service;


import com.example.week03.domain.Board;
import com.example.week03.domain.BoardRepository;
import com.example.week03.domain.BoardRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    @Transactional
    public Long update(Long id, BoardRequestDto requestDto) {
        Board board = boardRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        board.update(requestDto);
        return board.getId();
    }

    public boolean delete(long id, String password) {
        Board entity = boardRepository.findById(id).get();
        if (entity.getPassword().equals(password)) {
            boardRepository.deleteById(id);
            return true;
        }
        return false;
    }


}
