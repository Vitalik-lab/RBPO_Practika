package ru.mtuci.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mtuci.demo.model.licenseType;  // Изменено на LicenseType с заглавной буквы

public interface licenseTypeRepository extends JpaRepository<licenseType, Long> {
}