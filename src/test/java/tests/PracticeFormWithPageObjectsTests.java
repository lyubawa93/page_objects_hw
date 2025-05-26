package tests;

import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;

public class PracticeFormWithPageObjectsTests extends TestBase {
    PracticeFormPage formPage = new PracticeFormPage();

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
    }
}
