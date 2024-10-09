package ndgroups.tasks.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    @NotEmpty(message="price should not be empty")
    private String name;
    @Column(columnDefinition = "longtext")
    private String description;
    @NotEmpty(message="price should not be empty")
    private double price;
    private Integer stockQuantity;
    private String brand;
    private  String SKU;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private String category;
    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private String productCoverUrl;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
