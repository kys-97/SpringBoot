package com.example.furniture.service;

import com.example.furniture.dao.FuRepository;
import com.example.furniture.entity.FurnitureEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuService {

    @Autowired
    private FuRepository fur;

    //read all
    public List<FurnitureEntity> getAll() {
        return fur.findAll();
    }

    public FuRepository getFuById(int fuId){
        return (FuRepository) fur.findById(fuId).orElse(null);
    }

    public FurnitureEntity create(FurnitureEntity furnitureEntity) {
        return fur.save(furnitureEntity);
    }

    public FurnitureEntity update(FurnitureEntity furnitureEntity) {
        return fur.save(furnitureEntity);
    }

    public void delete (int fuId) {
        fur.deleteById(fuId);
    }


}
