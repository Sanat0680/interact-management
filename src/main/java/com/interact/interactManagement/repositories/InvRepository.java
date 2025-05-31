package com.interact.interactManagement.repositories;

import com.interact.interactManagement.entities.InventoryDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InvRepository extends JpaRepository<InventoryDetails, Long> {
    public List<InventoryDetails> findAll();
}
