package com.example.furniture.controller;

import com.example.furniture.entity.FurnitureEntity;
import com.example.furniture.service.FuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/furnitures")
public class FuController {

    @Autowired
    private FuService fuS;


    @GetMapping
    public List<FurnitureEntity> getAll() {
        return fuS.getAll();
    }

    @GetMapping("/{fuId}")
    public FurnitureEntity getFuById(@PathVariable int fuId) {
        return (FurnitureEntity) fuS.getFuById(fuId);
    }

    @PostMapping
    public FurnitureEntity create (@RequestBody FurnitureEntity furnitureEntity) {
        return fuS.create(furnitureEntity);
    }

    @PutMapping("/{fuId}")
    public FurnitureEntity update (@PathVariable int fuId, @RequestBody FurnitureEntity furnitureEntity) {
        furnitureEntity.setFuId(fuId);
        return fuS.update(furnitureEntity);
    }

    @DeleteMapping("/{fuId}")
    public void delete (@PathVariable int fuId) {
        fuS.delete(fuId);

    }

}
