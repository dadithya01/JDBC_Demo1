/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author Duvindu Adithya
 */
public class ItemDto {
    
    private String code;
    private String description;
    private String packSize;
    private double unitPrice;
    private int qoh;

    public ItemDto() {
    }

    public ItemDto(String code, String description, String packSize, double unitPrice, int qoh) {
        this.code = code;
        this.description = description;
        this.packSize = packSize;
        this.unitPrice = unitPrice;
        this.qoh = qoh;
    }

    public String getItemCode() {
        return code;
    }

    public void setItemCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPackSize() {
        return packSize;
    }

    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQoh() {
        return qoh;
    }

    public void setQoh(int qoh) {
        this.qoh = qoh;
    }

    @Override
    public String toString() {
        return "ItemDto{" + "itemCode=" + code + ", description=" + description + ", packSize=" + packSize + ", unitPrice=" + unitPrice + ", qoh=" + qoh + '}';
    }
    
    
    
}
