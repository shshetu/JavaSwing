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
public class InsertCompany {

    private String companyName;
    private String companyCountry;
    private String companyEmail;
    private String companyContactNo;
    private String companyAddress;

    public InsertCompany() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyCountry() {
        return companyCountry;
    }

    public InsertCompany(String companyName, String companyCountry, String companyEmail, String companyContactNo, String companyAddress) {
        this.companyName = companyName;
        this.companyCountry = companyCountry;
        this.companyEmail = companyEmail;
        this.companyContactNo = companyContactNo;
        this.companyAddress = companyAddress;
    }

    public void setCompanyCountry(String companyCountry) {
        this.companyCountry = companyCountry;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getCompanyContactNo() {
        return companyContactNo;
    }

    public void setCompanyContactNo(String companyContactNo) {
        this.companyContactNo = companyContactNo;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

}
