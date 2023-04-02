package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.xpath;


public class SearchTests extends TestBase{

    @DisplayName("Successful search on Android")
    @Tag("android")
    @Test
    void successfulSearchAndroidTest() {
        step("Type search", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("java");
        });
        step("Verify content found", () ->
                $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));
    }

    @DisplayName("Checking 'About' in settings")
    @Test
    @Tag("android")
    void searchAboutTest() {
        step("Open menu", () ->
                $(id("org.wikipedia.alpha:id/menu_overflow_button")).click()
        );

        step("Open settings", () ->
                $(id("org.wikipedia.alpha:id/explore_overflow_settings")).click()
        );

        step("Verify 'About'", () -> {
            $(xpath(("//*[@text='About']"))).shouldBe(visible);
        });
    }

}
