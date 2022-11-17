package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SolutionsSearch {
    @Test
    void searchSolutionsEnterprise() {
        open("https://github.com");
        $$("button").findBy(text("Solutions")).hover();
        $$(".HeaderMenu-dropdown").findBy(visible).$$("ul li a").findBy(text("Enterprise")).click();
        $("h1").shouldHave(text("Build like the best"));
    }
}
