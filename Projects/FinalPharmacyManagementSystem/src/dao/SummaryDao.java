/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import pojo.Summary;

/**
 *
 * @author shshe
 */
public interface SummaryDao {
    ///crude operation
    void createTable();
    void insert (Summary sum);
    void update (Summary sum);
    void delete (Summary sum);
    //for summary table
    void updateSum(Summary sum);
    void updatePlace(Summary sum);
    void updatePrice(Summary sum);
    void updateSales(Summary sum);
    void updateExpireDate(Summary sum);
    //validation
    Summary getSummaryByDrugId(int id);
    Summary getSummaryByDrugName(String name);
    Summary getSummaryByDrugCode(String drug_code);
    
    ///get data from the database
    List<Summary> getSummary();
    
    //get data by searching
    List<Summary> getSummarySelectingName();
    List<Summary> getSummarySelectingType();
    List<Summary> getSummarySelectingExpiration();
    List<Summary> getSummarySelectingDrugGroup();
    List<Summary> getSummarySelectingDrugPlace();
    
    //search by 
    List<Summary> getSummarySearchingName(String name);
    List<Summary> getSummarySearchingBarcode(String name);
    List<Summary> getSummarySearchingDrugGroup(String name);
    //search by drugPlace
    List<Summary> getSummarySearchingDrugPlace(String drug_place);
    
    //expired drugs
    List<Summary> getSummaryExpireDate();
    
    //Almost finished drug
    List<Summary> getSummaryAlmostFinished();

    
}
