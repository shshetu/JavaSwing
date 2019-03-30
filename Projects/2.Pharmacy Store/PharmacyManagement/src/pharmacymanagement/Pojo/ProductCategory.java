/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagement.Pojo;

/**
 *
 * @author shshe
 */
public class ProductCategory {

    private int productId;
    private String productCategoryName;

    public ProductCategory(int productId) {
        this.productId = productId;
    }

    

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public ProductCategory(int productId, String productCategoryName) {
        this.productId = productId;
        this.productCategoryName = productCategoryName;
    }

    public ProductCategory(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    

}
