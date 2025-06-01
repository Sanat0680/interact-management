package com.interact.interactManagement.order;


import com.interact.interactManagement.entities.FinalOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinalOrderRepository extends JpaRepository<FinalOrder, String> {
}
