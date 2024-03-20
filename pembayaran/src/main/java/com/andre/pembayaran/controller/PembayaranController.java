/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andre.pembayaran.controller;

import com.andre.pembayaran.entity.Pembayaran;
import com.andre.pembayaran.service.PembayaranService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author andreferdinan
 */
@RestController
@RequestMapping("api/v1/pembayaran")
public class PembayaranController {

    @Autowired
    private PembayaranService pembayaranService;
    
    @GetMapping
    public List<Pembayaran>getAll(){
        return pembayaranService.getAll();
    }
    @PostMapping
    public void insert (@RequestBody Pembayaran pembayaran, Pembayaran Pembayaran){
        pembayaranService.insert(Pembayaran);
    }
}
