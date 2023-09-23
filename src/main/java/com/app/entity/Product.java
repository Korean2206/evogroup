package com.app.entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Products")
public class Product {
    @Id
    private String id;
    private String productName;
    private double price;
    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;
    private String description;
    private Date create_date;

    @JsonIgnore
    @OneToMany(mappedBy="product")
    private List<ProductImage> productImage;

    @JsonIgnore
    @OneToMany(mappedBy="product")
    private List<ProductVariant> productVariants;

    @JsonIgnore
    @OneToMany(mappedBy="product")
    private List<OrderDetail> orderDetails;

    
}
