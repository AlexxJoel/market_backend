package mx.edu.utez.firstapp.models.product;


import jdk.jshell.Snippet;
import jdk.net.SocketFlow;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.firstapp.models.subcategory.SubCategory;

import javax.persistence.*;

@Entity
@Table(name = "products")
@NoArgsConstructor
@Setter
@Getter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(columnDefinition = "text")
    private String description;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "fileBlob" , columnDefinition = "longblob")
    private byte[] fileBase64;

    private int cuantity;

    private double price;

    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "subcategory_id")
    private SubCategory subCategory;
}
