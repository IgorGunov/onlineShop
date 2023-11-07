package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "category")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @Column(name="nested_categories_id")
    private int nestedCategoriesId;

    @Column(name = "count_product")
    private int countProduct;

    @Column(name = "count_nested_categories")
    private int countNestedCategories;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "category_product",
            joinColumns = {@JoinColumn(name = "category_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "product_id", referencedColumnName = "id")}
    )
    private Set<Product> products = new HashSet<>();
}