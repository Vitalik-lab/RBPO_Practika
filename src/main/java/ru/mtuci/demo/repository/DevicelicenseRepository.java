package ru.mtuci.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mtuci.demo.model.Devicelicense;

public interface DevicelicenseRepository extends JpaRepository<Devicelicense, Long> {
}