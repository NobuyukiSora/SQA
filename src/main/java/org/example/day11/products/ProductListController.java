package org.example.day11.products;

import java.util.ArrayList;
import java.util.LinkedList;

public class ProductListController {
    LinkedList<ProductModel> productModels = new LinkedList<>();

    public ProductListController(LinkedList product) {
        this.productModels.addAll(product);
    }

    public int getSize() {
        return productModels.size();
    }

    public ProductModel getProduct(int index){
        return productModels.get(index);
    }
}
