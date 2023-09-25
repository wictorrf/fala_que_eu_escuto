package com.wictor.Fala_que_eu_escuto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wictor.Fala_que_eu_escuto.domains.Post;
import com.wictor.Fala_que_eu_escuto.dtos.PostDto;
import com.wictor.Fala_que_eu_escuto.services.PostService;

@RestController
@RequestMapping("/post")
public class PostController {
    
    @Autowired
    private PostService postService;

    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody PostDto data){
        Post newPost = this.postService.createPost(data);
        return ResponseEntity.status(HttpStatus.OK).body(newPost);
    }
}
