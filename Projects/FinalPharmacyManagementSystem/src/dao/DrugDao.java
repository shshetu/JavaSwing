/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import pojo.Drug;

/**
 *
 * @author User
 */
public interface DrugDao {
    //create table
    void createTable();
    void insert(Drug drug);
    void update(Drug drug);
    void delete(Drug drug);
    //verify
    Drug getDrugByDrugSerial(int drug_serial);
    Drug getDrugByDrugName(String drug_name);
    Drug getDrugByDrugType(String drug_type);
    Drug getDrugByDrugBarcode(String drug_barcode);
    
    //get from the database
    List<Drug> getDrug();
 }
