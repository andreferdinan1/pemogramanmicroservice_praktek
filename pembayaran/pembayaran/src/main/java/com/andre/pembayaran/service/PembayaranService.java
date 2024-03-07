/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andre.pembayaran.service;

import com.andre.pembayaran.entity.Pembayaran;
import com.andre.pembayaran.repository.PembayaranRepositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author andreferdinan
 */
@Service
public class PembayaranService {
    private final PembayaranRepositori pembayaranRepository;

    @Autowired
    public PembayaranService(PembayaranRepositori pembayaranRepository) {
        this.pembayaranRepository = pembayaranRepository;
    }

    public List<Pembayaran> findAll() {
        return pembayaranRepository.findAll();
    }

    public Optional<Pembayaran> findById(Long id) {
        return pembayaranRepository.findById(id);
    }

    public Pembayaran save(Pembayaran pembayaran) {
        return pembayaranRepository.save(pembayaran);
    }

    public void delete(Long id) {
        pembayaranRepository.deleteById(id);
    }
}
