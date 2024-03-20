/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andre.pembayaran.service;
import com.andre.pembayaran.entity.Pembayaran;
import com.andre.pembayaran.repository.PembayaranRepositori;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author andreferdinan
 */
@Service
public class PembayaranService {
   @Autowired 
    private PembayaranRepositori pembayaranRepositori;
    
    public List<Pembayaran> getAll(){
        return pembayaranRepositori.findAll();
    }
    public Pembayaran getPembayaranById(Long id){
        return pembayaranRepositori.getReferenceById(id);
    }
        public void insert(Pembayaran pembayaran){
        pembayaranRepositori.save(pembayaran);
    }
    public void delete(Long id){
        pembayaranRepositori.deleteById(id);
    }
        @Transactional
    public void update(Long pembayaranId, int ref_number, String mode_pembayaran, String tgl_bayar, String status, double total) {
    Pembayaran pembayaran = pembayaranRepositori.findById(pembayaranId)
            .orElseThrow(() -> new IllegalStateException("Pembayaran tidak ditemukan"));

    if (ref_number > 0 && pembayaran.getRef_number() != ref_number) {
        pembayaran.setRef_number(ref_number);
    }
    if (mode_pembayaran != null && mode_pembayaran.length() > 0 && !pembayaran.getMode_pembayaran().equals(mode_pembayaran)) {
        pembayaran.setMode_pembayaran(mode_pembayaran);
    }
    if (tgl_bayar != null && tgl_bayar.length() > 0 && !pembayaran.getTgl_bayar().equals(tgl_bayar)) {
        pembayaran.setTgl_bayar(tgl_bayar);
    }
    if (status != null && status.length() > 0 && !pembayaran.getStatus().equals(status)) {
        pembayaran.setStatus(status);
    }
    if (total > 0 && !pembayaran.getTotal().equals(total)) {
        pembayaran.setTotal(total);
    } 

}
}
