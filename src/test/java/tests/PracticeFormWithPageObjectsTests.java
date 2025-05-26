package tests;

import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;
import pages.components.ResultTableComponent;

public class PracticeFormWithPageObjectsTests extends TestBase {
    PracticeFormPage formPage = new PracticeFormPage();
    ResultTableComponent resultTable = formPage.getResultTable();

    @Test
    void fillFormTest() {
        formPage.openPage()
                .removeBanners()
                .setFirstName("Anna")
                .setLastName("Ivanova")
                .setEmail("Anna@Ivanova.com")
                .setGender()
                .setUserNumber("1234567890")
                .setDate0fBirth("1993","July","08")
                .setSubjectsInput("English")
                .setHobbiesCheckbox()
                .selectUploadPicture()
                .setCurrentAddress("Some street 1")
                .setState("NCR")
                .setCity("Noida")
                .clickSubmit();
        resultTable.checkResult("Student Name", "Anna Ivanova")
                .checkResult("Student Email", "Anna@Ivanova.com")
                .checkResult("Gender", "Female")
                .checkResult("Mobile", "1234567890")
                .checkResult("Date of Birth", "08 July,1993")
                .checkResult("Subjects", "English")
                .checkResult("Hobbies", "Sports")
                .checkResult("Picture", "cat.jpg")
                .checkResult("Address", "Some street 1")
                .checkResult("State and City", "NCR" + " " + "Noida");
    }
    @Test
    void fillFormNegativeTest() {
        formPage.openPage()
                .removeBanners()
                .setFirstName("Anna")
                .setLastName("Ivanova")
                .clickSubmit();
    }
    @Test
    void fillFormMinimalTest() {
        formPage.openPage()
                .removeBanners()
                .setFirstName("Anna")
                .setLastName("Ivanova")
                .setGender()
                .setUserNumber("1234567890")
                .clickSubmit();
        resultTable.checkResult("Student Name", "Anna Ivanova")
                .checkResult("Gender", "Female")
                .checkResult("Mobile", "1234567890");
    }

}
