/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andre.produk.controller;

import com.andre.produk.entity.Produk;
import com.andre.produk.service.ProdukService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author andreferdinan
 */
@RestController
@RequestMapping("api/v1/produk")
public class ProdukController {
    @Autowired
    private ProdukService produkService;
    
    @GetMapping
    public List<Produk>getAll(){
        return produkService.getAll();
        
    }
    
    @PostMapping
    public void insert(@RequestBody Produk produk){
        produkService.insert(produk);
    }
    
    @GetMapping("/{id}")
    public Produk getById(@PathVariable Long id) {
        return produkService.getById(id);
    }
    
    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Produk produk) {
        produkService.update(id, produk);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        produkService.delete(id);
    }


    
    
}
