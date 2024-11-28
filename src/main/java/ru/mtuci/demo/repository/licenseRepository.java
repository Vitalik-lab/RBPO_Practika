package ru.mtuci.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mtuci.demo.model.license;  // Изменено на License с заглавной буквы

public interface licenseRepository extends JpaRepository<license, Long> {
}