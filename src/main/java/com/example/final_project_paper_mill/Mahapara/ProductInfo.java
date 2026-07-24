package com.example.final_project_paper_mill.Mahapara;

public class ProductInfo {
    private String productName;
    private String price;
    private String stock;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "productName='" + productName + '\'' +
                ", price='" + price + '\'' +
                ", stock='" + stock + '\'' +
                '}';
    }
}
