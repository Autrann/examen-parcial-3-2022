package edu.uaslp.objetos.shoppingcart;

import java.math.BigDecimal;
import java.util.List;
import java.util.OptionalDouble;

public class ShoppingCart {
    int totalCost;
    
    public void isEmpty

    public boolean isEmpty() {
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void addItem(Item item) {
    }

    public boolean getItemsCount() {
    }

    public List<Item> getItems() {
    }

    public void removeItem(String itemCode2) {
    }
}

class Item {
    String code;
    BigDecimal unitCost;
    int quantity;
    String providerCode;

    public Item(String itemCode1, String providerCode1, BigDecimal bigDecimal, int i) {
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }

    public BigDecimal getUnitCost() {
        return unitCost;
    }
}

