/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.andre.produk.repository;

import com.andre.produk.entity.Produk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; 
/**
 *
 * @author andreferdinan
 */
public interface ProdukRepository extends JpaRepository<Produk, Long> {

}
