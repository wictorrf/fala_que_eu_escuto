package com.wictor.Fala_que_eu_escuto.dtos;

import com.wictor.Fala_que_eu_escuto.domains.PostType;

public record PostDto(PostType postType, String description) {
    
}
