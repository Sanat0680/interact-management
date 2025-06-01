package com.interact.interactManagement.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "order_items")
public class OrderItem {

    @Id
    private String id;

    // Associated order

    private Integer productId;

    private String productName;

    private Integer quantity;

    @Column(nullable = false)
    private BigDecimal price;

    @Column
    private String parentId;

    @PrePersist
    @PreUpdate
    public void setDefaults() {
        if (this.price == null) {
            this.price = BigDecimal.ZERO;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
