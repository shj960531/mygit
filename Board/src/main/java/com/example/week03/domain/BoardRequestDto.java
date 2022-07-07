package com.example.week03.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor

public class BoardRequestDto {
    private final String title;
    private final String name;
    private final String password;
    private final String contents;
}
