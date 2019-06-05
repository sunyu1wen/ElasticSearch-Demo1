package com.bocai.springboot.elasticSearchDemo.entity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;


@Data
@Document(indexName = "test1", type = "Item1", shards = 1, replicas = 0)
public class Item implements Serializable {
    @Field(type = FieldType.Long, index = true)
    Long id;
    @Field(type = FieldType.Text, index = true)//analyzer = "ik_max_word",
            String title; //标题1
    @Field(type = FieldType.Keyword, index = true)
    String category;// 分类1
    @Field(type = FieldType.Keyword, index = true)
    String brand; // 品牌1
    @Field(type = FieldType.Double, index = true)
    Double price; // 价格
    @Field(type = FieldType.Keyword, index = true)
    String images; // 图片地址

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Long getId() { return id; }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public Double getPrice() { return price; }

    public String getImages() { return images; }

    public Item(Long id, String title, String category, String brand, Double price, String images) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.images = images;
        System.out.println("=========constructed  function syw===");
    }
}