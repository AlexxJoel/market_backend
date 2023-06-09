package mx.edu.utez.firstapp.models.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductImageRepository extends JpaRepository<ProductImages, Long> {
    boolean existsByName(String name);
}
