package com.sparta.finalhomework.controller;

import com.sparta.finalhomework.domain.Notice;
import com.sparta.finalhomework.domain.NoticeRepository;
import com.sparta.finalhomework.domain.NoticeRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class NoticeController {

    private final NoticeRepository noticeRepository;


    @PostMapping("/api/notices")
    public Notice createNotice(@RequestBody NoticeRequestDto requestDto){
        Notice notice = new Notice(requestDto);
        noticeRepository.save(notice);
        return notice;
    }

    @GetMapping("/api/notices")
    public List<Notice> getNotice() {
        LocalDateTime start = LocalDateTime.now().minusDays(1);
        LocalDateTime end = LocalDateTime.now();
        return noticeRepository.findAllByModifiedAtBetweenOrderByModifiedAtDesc(start, end);
    }

    @GetMapping("/api/notices/{id}")
    public Notice getNotice(@PathVariable Long id) {
        return noticeRepository.findById(id).orElseThrow(
                ()-> new NullPointerException("해당아이디 없음")
        );
    }
    @DeleteMapping("/api/notices/{id}")
    public Long deleteNotice(@PathVariable Long id) {
        noticeRepository.deleteById(id);
        return id;
    }


}
