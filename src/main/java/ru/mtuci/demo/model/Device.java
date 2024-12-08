package ru.mtuci.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import org.apache.catalina.User;

import java.util.Date;
import java.util.List;

@Entity
@Getter
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String macAddress;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private ApplicationUser user;

    @OneToMany(mappedBy = "device")
    private List<Devicelicense> deviceLicenses;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMacAddress() {
        return macAddress;
    }
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }
    public List<Devicelicense> getDeviceLicenses() {
        return deviceLicenses;
    }
    public void setDeviceLicenses(List<Devicelicense> deviceLicenses) {
        this.deviceLicenses = deviceLicenses;
    }
}