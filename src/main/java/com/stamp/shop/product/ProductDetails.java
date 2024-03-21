package com.stamp.shop.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product_details")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int yearOfIssue;
    private String countryOfIssue;
    private String series;

    @ManyToOne
    @JoinTable(
            name = "categories",
            joinColumns = @JoinColumn(name = "id")
    )
    private Category categoryId;
}