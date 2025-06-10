package com.flashcard.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class FlashCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String frontTitle;
    private String frontDescription;
    private String backTitle;
    private String backDescription;
    private String backImage;

    @ManyToOne
    @JoinColumn(name = "category_id")
    @JsonBackReference
    private FlashCardCategory category;
}
