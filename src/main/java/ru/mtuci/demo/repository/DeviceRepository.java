package ru.mtuci.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mtuci.demo.model.Device;

public interface DeviceRepository extends JpaRepository<Device, Long> {
}