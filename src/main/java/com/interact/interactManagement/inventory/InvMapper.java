package com.interact.interactManagement.inventory;

import com.interact.interactManagement.entities.InventoryDetails;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InvMapper {
    InvPojo entityToPojo(InventoryDetails inv);
    InventoryDetails pojoToEntity(InvPojo dto);
}

