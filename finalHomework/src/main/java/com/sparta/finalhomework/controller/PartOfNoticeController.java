package com.sparta.finalhomework.controller;



import com.sparta.finalhomework.domain.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class PartOfNoticeController {

    private final NoticeRepository noticeRepository;


    @GetMapping("/notices/{id}")
    public String getNotice(@PathVariable Long id, Model model){
        model.addAttribute("id",id);
        return "post.html";

    }

}
