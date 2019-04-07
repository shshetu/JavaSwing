/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagement.Dao;

import java.util.List;
import pharmacymanagement.Pojo.Summary;

/**
 *
 * @author shshe
 */
public interface SummaryDao {

    //crude operation
    void createTable();
    void insert(Summary summary);
    Summary getSummaryByProductCode(String productCode);
    List<Summary> getSummary();
    
    ///summary dao validation
}
