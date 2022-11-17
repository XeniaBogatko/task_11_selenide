package github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SolutionsSearch {
    @Test
    void searchSolutionsEnterprise(){
        open("https://github.com");
        $$("button").findBy(text("Solutions")).hover();
        $$(".HeaderMenu-dropdown").findBy(visible).$$("ul li a").findBy(text("Enterprise")).click();
        $("h1").shouldHave(text("Build like the best"));
    }
}
