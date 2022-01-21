package guru.qa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTests {

    @BeforeAll
    static void BrowserSize() {
        Configuration.browserSize = "1920x3072";
    }

    @Test
    void successTest() {
        open("https://demoqa.com/automation-practice-form");

        $("#firstName").setValue("Daria");
        $("#lastName").setValue("E");
        $("#userEmail").setValue("td@mail.com");
        $("[for='gender-radio-2']").click();
        $("#userNumber").setValue("9113214457");

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption("July");
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption("2019");
        $(".react-datepicker__day--003").click();

        $("#subjectsInput").setValue("p").pressEnter();
        $("#subjectsInput").setValue("co").pressEnter();
        $("#subjectsInput").setValue("a").pressEnter();

        $("[for='hobbies-checkbox-1']").click();
        $("[for='hobbies-checkbox-2']").click();
        $("[for='hobbies-checkbox-3']").click();

        File file = new File ("src/test/resources/rm.jpeg");
        $("#uploadPicture").uploadFile(file);

        $("#currentAddress").setValue("Saint-Petersburg");

        $("#react-select-3-input").setValue("Raj").pressEnter();
        $("#react-select-4-input").setValue("Jai").pressEnter();

        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldBe(Condition.visible);
        $(".table-responsive").shouldHave(text("Daria"), 
                (text("E")),
                (text("td@mail.com")),
                (text("Female")),
                (text("9113214457")),
                (text("03 July,2019")),
                (text("Physics, Computer Science, Maths")),
                (text("Sports, Reading, Music")),
                (text("rm.jpeg")),
                (text("Rajasthan Jaipur")));
    }
}
