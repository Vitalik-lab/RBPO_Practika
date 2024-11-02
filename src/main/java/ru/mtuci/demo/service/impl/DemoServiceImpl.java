package ru.mtuci.demo.service.impl;

import org.springframework.stereotype.Service;
import ru.mtuci.demo.model.Demo;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public void save(Demo demo) {

    }

    @Override
    public List<Demo> findAll() {
        return List.of();
    }

    @Override
    public Demo findById(long id) {
        return null;
    }
}
