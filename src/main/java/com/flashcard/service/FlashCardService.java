package com.flashcard.service;

import com.flashcard.model.FlashCardCategory;
import com.flashcard.repository.FlashCardCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlashCardService {
    private final FlashCardCategoryRepository categoryRepository;

    public FlashCardService(FlashCardCategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<FlashCardCategory> getAllCategories() {
        return categoryRepository.findAll();
    }
}
