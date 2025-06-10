package com.flashcard.controller;

import com.flashcard.model.FlashCardCategory;
import com.flashcard.service.FlashCardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/flashcards")
public class FlashCardController {
    private final FlashCardService flashCardService;

    public FlashCardController(FlashCardService flashCardService) {
        this.flashCardService = flashCardService;
    }

    @GetMapping("/categories")
    public List<FlashCardCategory> getAllCategories() {
        return flashCardService.getAllCategories();
    }
}
