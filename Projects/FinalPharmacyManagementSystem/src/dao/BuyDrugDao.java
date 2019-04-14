/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import pojo.BuyDrug;

/**
 *
 * @author shshe
 */
public interface BuyDrugDao {

    //crude operation
    void createTable();

    void insert(BuyDrug buy_drug);

    void update(BuyDrug buy_drug);

    void delete(BuyDrug buy_drug);

    //validation
    BuyDrug getBuyDrugBySerial(int serial);

    BuyDrug getBuyDrugByBarcode(String barcode);

    BuyDrug getBuyDrugByDrugName(String drug_name);

    //get data from the database
    List<BuyDrug> getBuyDrug();
    
    ///get only distinct drug types
     List<BuyDrug> getBuyDrugForDistinctDrugType();
}
