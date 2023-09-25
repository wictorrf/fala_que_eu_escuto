package com.wictor.Fala_que_eu_escuto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wictor.Fala_que_eu_escuto.domains.Post;
import com.wictor.Fala_que_eu_escuto.dtos.PostDto;
import com.wictor.Fala_que_eu_escuto.repositories.PostRepository;

@Service
public class PostService {
    
    @Autowired
    private PostRepository postRepository;

    public Post createPost(PostDto data){
        Post newPost = new Post(data);
        this.postRepository.save(newPost);
        return newPost;
    }
}
