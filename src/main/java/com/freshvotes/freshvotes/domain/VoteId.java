package com.freshvotes.freshvotes.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class VoteId implements Serializable {

    @ManyToOne
    private User user;

    @ManyToOne
    private Feature feature;
}
