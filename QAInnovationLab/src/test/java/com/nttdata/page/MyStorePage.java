package com.nttdata.page;

import org.openqa.selenium.By;

public class MyStorePage {

    public static By clothesCategory = By.cssSelector("a[href='https://qalab.bensg.com/store/pe/3-clothes']");
    public static By menSubCategory = By.xpath("//*[@id='left-column']/div[1]/ul/li[2]/ul/li[1]/a");
    public static By firstProduct = By.xpath("//img[@alt='Hummingbird printed t-shirt']");
    //*[@id="js-product-list"]/div[1]/div/article/div/div[1]/a
    public static By addToCartButton = By.xpath("//*[@id='add-to-cart-or-refresh']/div[2]/div/div[1]/div/span[3]/button[1]");
    public static By addToCartButtonx2 = By.xpath("//*[@id='add-to-cart-or-refresh']/div[2]/div/div[2]/button");
    public static By productConfirmationPopup = By.cssSelector("#myModalLabel");
    public static By totalAmountPopup = By.xpath("//*[@id='blockcart-modal']/div/div/div[2]/div/div[2]/div/p[4]/span[2]");
    public static By finishPurchaseButton = By.xpath("//*[@id='blockcart-modal']/div/div/div[2]/div/div[2]/div/div/a");
    //*[@id="js-product-list"]/div[1]/div/article/div/div[1]/a
//*[@id="js-product-list"]/div[1]/div/article
//*[@id="blockcart-modal"]/div/div/div[2]/div/div[2]/div/div/a
//*[@id="blockcart-modal"]/div/div/div[2]/div/div[2]/div/p[4]/span[2]
}
