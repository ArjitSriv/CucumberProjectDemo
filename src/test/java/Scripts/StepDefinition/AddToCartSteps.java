package Scripts.StepDefinition;

import com.swag.pageObjects.CartPage;
import com.swag.pageObjects.InventoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddToCartSteps extends Generic{

    @Given("^user click on Add To Cart$")
    public void clickOnAddToCartButtonTest() {
        InventoryPage ip = new InventoryPage(this.driver);
        ip.clickOnAddToCart();
    }

    @And("^user click on Cart Icon$")
    public void user_click_on_Cart_Icon() {
        CartPage cp = new CartPage(this.driver);
        cp.clickOnCartIcon();


    }

}
