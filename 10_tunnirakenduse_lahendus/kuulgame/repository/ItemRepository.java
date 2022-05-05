package com.example.kuulgame.repository;

import com.example.kuulgame.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
