package ru.mtuci.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mtuci.demo.model.licenseHistory;

public interface licenseHistoryRepository extends JpaRepository<licenseHistory, Long> {
}