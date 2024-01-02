package com.example.demotest.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@Builder
@ToString(callSuper = true)

public class Store {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    private Integer id;
    private String brandName;
    private String email;
    private Integer phone;
    private String address;
    private String categoryName;

    public Store(int id, String brandName,String email, int phone, String address, String categoryName){
        this.id=id;
        this.brandName=brandName;
        this.email=email;
        this.phone=phone;
        this.address=address;
        this.categoryName=categoryName;



    }
}
