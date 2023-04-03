package com.freshvotes.freshvotes.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Comment {
    
    @EmbeddedId
    private CommentId pk;
    @Column(length = 5000)
    private String text;
}
