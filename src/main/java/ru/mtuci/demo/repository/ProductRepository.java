package ru.mtuci.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mtuci.demo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}