package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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
        $("#userEmail").setValue("tdariae@gmail.com");

        $("#userNumber").setValue("+79111111111");

        $("#subjectsInput").setValue("AutoQA");




        $("#currentAddress").setValue("Saint-Petersburg");

//        $("#submit").click();


        //firstName
        //lastName
        //userEmail
        //gender-radio-2
        //userNumber
        //dateOfBirthInput
        //subjectsContainer
        //hobbies-checkbox-1
        //hobbies-checkbox-2
        //hobbies-checkbox-3
        //uploadPicture
        //currentAddress
        //state
        //city


    }
}
