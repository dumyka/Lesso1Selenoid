import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

import org.junit.jupiter.api.Test;

public class FirstLessonSelenide {
  @Test
  void exampleCodeJunit5() {
    //открыть страницу репозитория селенида
    open("https://github.com/selenide/selenide");
    //перейти в раздел Wiki проекта
    $("#wiki-tab").click();
    //проверка: в списке страниц (Pages) есть страница SoftAssertions
    $(".markdown-body").shouldHave(text("Soft assertions"));
    //открыть страницу SoftAssertions
    $$("a").findBy(text("Soft assertions")).click();
    //проверка: внутри есть пример кода для JUnit5
    $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
    //sleep(5000);
  }
}
