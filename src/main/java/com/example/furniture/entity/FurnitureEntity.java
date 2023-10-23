package com.example.furniture.entity;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
//table name
@Table(name="Furniture")
@Builder
public class FurnitureEntity {

    //PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fuId; //pk, +1
    private String fuName;
    private String fuColor;
    private int fuPrice;

    //jpa에서 db로 넘어갈 때 언더바를 사용하면 중복이 됨 따라서 카멜 스타일로 작성
}
