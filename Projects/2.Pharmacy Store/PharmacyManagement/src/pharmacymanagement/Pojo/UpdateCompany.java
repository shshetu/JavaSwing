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
public class UpdateCompany {

    private String productName;
    private String updateContact;
    private String updateEmailId;

    public UpdateCompany(String productName, String updateContact, String updateEmailId) {
        this.productName = productName;
        this.updateContact = updateContact;
        this.updateEmailId = updateEmailId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUpdateContact() {
        return updateContact;
    }

    public void setUpdateContact(String updateContact) {
        this.updateContact = updateContact;
    }

    public String getUpdateEmailId() {
        return updateEmailId;
    }

    public void setUpdateEmailId(String updateEmailId) {
        this.updateEmailId = updateEmailId;
    }
}
