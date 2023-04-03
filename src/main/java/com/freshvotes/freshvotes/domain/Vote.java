package com.freshvotes.freshvotes.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Vote {

    @EmbeddedId
    private VoteId pk;

    private Boolean upvote;
}
