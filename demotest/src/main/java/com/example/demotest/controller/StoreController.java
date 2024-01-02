package com.example.demotest.controller;

import com.example.demotest.model.Store;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/stores")

public class StoreController {



    ArrayList<Store> list = new ArrayList<>(){};

    Store data = new Store(1,"Masoutis", "masoutis@gmail.com",20,"Grevenwn_1","SuperMarket");
    Store data1 = new Store(2,"Karbeli", "karbeli@gmail.com",20,"Grevenwn_2","Fournos");
    Store data2 = new Store(3,"SouvLike", "sounlike@gmail.com",20,"Grevenwn_3","Fournos");
    Store data3 = new Store(4,"Tortigia", "tortigia@gmail.com",20,"Grevenwn_4","MExican");
    Store data4 = new Store(5,"HAM_burger", "hamburger@gmail.com",20,"Grevenwn_10","Burger");
    Store data5 = new Store(6,"La_italiana", "mitaliana@gmail.com",20,"Grevenwn_20","pasta");


    public ArrayList<Store> getList() {
        list.add(data);
        list.add(data1);
        list.add(data2);
        list.add(data3);
        list.add(data4);
        list.add(data5);

        return list;
    }

    @GetMapping("/getAllStores")
    public ArrayList<Store> getAllStores(){
        return  getList();
    }

    @GetMapping("/getStore/{name}")
    public Optional<Store> getAllStores(@PathVariable("name") String name){
        return getList().stream().filter(stores ->stores.getBrandName().equals(name)).findFirst();
    }

    @GetMapping("/getByCategory/{category}")
    public List<Store> getByCategory(@PathVariable("category") String category){

        return getList().stream().filter(stores-> stores.getCategoryName().equals(category)).collect(Collectors.toList());

    }


    @PostMapping("/createStore")
    public ResponseEntity create(@RequestBody Store data){
        getList().add(data);
        return ResponseEntity.ok().body(data.getPhone());
    }
    @DeleteMapping("/deleteStore/{name}")
    public ResponseEntity delete(@PathVariable("name") String name){
        Optional<Store> store = getList().stream().filter(stores ->stores.getBrandName().equals(name)).findFirst();
        getList().remove(store);
        return ResponseEntity.ok().body(name);
    }

   
}
