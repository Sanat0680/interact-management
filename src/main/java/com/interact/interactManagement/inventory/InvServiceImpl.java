package com.interact.interactManagement.inventory;

import com.interact.interactManagement.repositories.InvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InvServiceImpl implements InvService {
    @Autowired
    InvMapper mapper;
    @Autowired
    InvRepository repo;

    @Override
    public List<InvPojo> getAllInvs() {
        return repo.findAll().stream().map(e -> mapper.entityToPojo(e)).toList();
    }
}
