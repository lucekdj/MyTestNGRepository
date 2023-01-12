package com.automation.test;

import org.testng.annotations.Test;

public class OrderCancellationTest extends BaseTest {

    @Test
    public void verifyUserCanCancelOrder() {
        System.out.println("Test - Verify User Can Cancel the Order");
    }

    @Test
    public void verifyUserCannotCancelOrderOnceOrderStateIsShipped() {
        System.out.println("Test - Verify User Cannot Cancel Order Once Order State Is Shipped");
    }


}
