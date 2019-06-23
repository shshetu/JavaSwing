/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author shshe
 */
public class Input {
    private String memberId;
    private double amount;
    private String brunchId;
    private String voucherNo;
    private String ledgerName;

    public Input(String memberId, double amount, String brunchId, String voucherNo, String ledgerName) {
        this.memberId = memberId;
        this.amount = amount;
        this.brunchId = brunchId;
        this.voucherNo = voucherNo;
        this.ledgerName = ledgerName;
    }

    public Input(double amount, String brunchId, String voucherNo, String ledgerName) {
        this.amount = amount;
        this.brunchId = brunchId;
        this.voucherNo = voucherNo;
        this.ledgerName = ledgerName;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getBrunchId() {
        return brunchId;
    }

    public void setBrunchId(String brunchId) {
        this.brunchId = brunchId;
    }

    public String getVoucherNo() {
        return voucherNo;
    }

    public void setVoucherNo(String voucherNo) {
        this.voucherNo = voucherNo;
    }

    public String getLedgerName() {
        return ledgerName;
    }

    public void setLedgerName(String ledgerName) {
        this.ledgerName = ledgerName;
    }

   
    
}
