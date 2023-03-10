package com.example.namo2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Palette {
    @Id
    @GeneratedValue
    @Column(name = "palette_id")
    private Long id;

    @Column(nullable = false, length =  10)
    private String belong;

    @Column(nullable = false, length = 15)
    private String color;

    @Builder
    public Palette(Long id, String belong, String color) {
        this.id = id;
        this.belong = belong;
        this.color = color;
    }
}
