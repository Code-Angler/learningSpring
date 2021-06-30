package com.sparta.finalhomework.service;

import com.sparta.finalhomework.domain.Notice;
import com.sparta.finalhomework.domain.NoticeRepository;
import com.sparta.finalhomework.domain.PartOfNoticeRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class NoticeService {

    private final NoticeRepository noticeRepository;

    @Transactional
    public Long update(Long id, PartOfNoticeRequestDto requestDto) {
        Notice notice = noticeRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        notice.update(requestDto);
        return notice.getId();
    }
}