package com.engeto.Lekce12Project2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    public void idValidationTest() throws Exception {
        ProductService test = new ProductService();
        int testResult = test.getProduct(1).getId();
        Assertions.assertEquals(1, testResult);
    }

}