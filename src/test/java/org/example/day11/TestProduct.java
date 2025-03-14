package org.example.day11;

import org.example.day11.products.ProductListController;
import org.example.day11.products.ProductModel;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedList;

public class TestProduct {
    @Test(groups = {"medium", "product", "mobile", "web"})
    public void testProduct() {
        LinkedList<ProductModel> daftarProduk = new LinkedList<>();
        daftarProduk.add(new ProductModel("p1", 20));
        ProductListController productListController = new ProductListController(daftarProduk);

        int expected = 1;
        int actual = productListController.getSize();

        Assert.assertEquals(expected, actual);
    }

    @Test(groups = {"medium", "product", "regtest"})
    public void testProduct2() {
        LinkedList<ProductModel> daftarProduk = new LinkedList<>();

        ProductModel p1 = new ProductModel("p1", 20);
        ProductModel p2 = new ProductModel("p2", 60);

        daftarProduk.add(p1);
        daftarProduk.add(p2);

        ProductListController productListController = new ProductListController(daftarProduk);

        boolean actual = false;

        String[] nameExpected = {"p1", "p2"};
        int[] priceExpected = {20, 60};

        for (int i = 0; i < productListController.getSize(); i++) {
            actual = productListController.getProduct(i).getName().equals(nameExpected[i])
                    && productListController.getProduct(i).getPrice() == priceExpected[i];
        }

        Assert.assertTrue(actual);

    }
}
