package com.app.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="product_rates")
public class ProductRate {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private int id;
    private Date rate_date;
    @ManyToOne
    @JoinColumn(name="customer_id")
    private User user;
    private String rate_comment;
    private int rating;
    @ManyToOne
    @JoinColumn(name="product_variant_id")
    private ProductVariant productVariant;   
}
