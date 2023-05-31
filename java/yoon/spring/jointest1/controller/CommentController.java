package yoon.spring.jointest1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import yoon.spring.jointest1.domain.Comment;
import yoon.spring.jointest1.dto.CommentDto;
import yoon.spring.jointest1.service.CommentService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @GetMapping("/board")
    public String board(Model model){
        List<Comment> list = commentService.load();
        model.addAttribute("comment", list);
        return "board";
    }

    @PostMapping("/board")
    public String board(@RequestParam("id") String id,
                        @RequestParam("password") String password,
                        @RequestParam("content") String content,
                        Model model){
        String result =commentService.save(id, password, content);

        if(result.equals("E1")){
            model.addAttribute("message", "Id not found");
        }
        if(result.equals("E2")){
            model.addAttribute("message", "Password does not match");
        }

        List<Comment> list = commentService.load();
        model.addAttribute("comment", list);

        return "board";
    }
}
