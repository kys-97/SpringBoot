package com.example.furniture.dao;

import com.example.furniture.entity.FurnitureEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FuRepository extends JpaRepository<FurnitureEntity,Integer> {
//FurnitureEntity(vo) / Integer (vo의 pk type)

    //crud repository vs jpa repository
    //비슷한 기능을 하지만 jpa repository가 더 많은 확장성을 가짐
}
