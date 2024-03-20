/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.andre.pembayaran.repository;

import com.andre.pembayaran.entity.Pembayaran;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author andreferdinan
 */
@Repository
public interface PembayaranRepositori extends JpaRepository<Pembayaran, Long> {
    public List<Pembayaran> findAll();

    public Pembayaran getReferenceById(Long id);
}
