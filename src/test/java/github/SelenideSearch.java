package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideSearch {

    @Test
    void shouldFindJunit5Example() {
        open("https://github.com");
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        $(".repo-list li").$("a").click();
        $("#wiki-tab").click();

        $(".wiki-more-pages-link").$("button").click();
        $("[data-filterable-for='wiki-pages-filter']").shouldHave(text("SoftAssertions"));

        $("a[href$='SoftAssertions']").click();
        $("#user-content-3-using-junit5-extend-test-class").closest("h4")
                .sibling(0).$("pre").shouldBe(visible);
    }
}