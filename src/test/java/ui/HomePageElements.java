package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageElements {
    public static Target PAYMENT_BTN = Target.the("payment button").located(By.id("com.experitest.ExperiBank:id/makePaymentButton"));

    public static Target LOGOUT_BTN = Target.the("logout button").located(By.id("logoutButton"));
}
