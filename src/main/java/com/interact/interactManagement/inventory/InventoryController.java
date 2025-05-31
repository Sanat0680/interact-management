package com.interact.interactManagement.inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dev")
public class InventoryController {
    @Autowired
    InvService service;

    @GetMapping("/api/get/inventories")
    public List<InvPojo> getInvs() {
        return service.getAllInvs();
    }
}
