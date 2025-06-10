package com.flashcard.repository;

import com.flashcard.model.FlashCardCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlashCardCategoryRepository extends JpaRepository<FlashCardCategory, Long> {
}
