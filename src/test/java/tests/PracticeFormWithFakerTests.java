package tests;

import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;
import pages.components.ResultTableComponent;
import utils.TestData;


public class PracticeFormWithFakerTests extends TestBase {
    PracticeFormPage formPage = new PracticeFormPage();
    ResultTableComponent resultTable = formPage.getResultTable();
    TestData testData = new TestData();

    @Test
    void fillFormTest() {
        formPage.openPage()
                .removeBanners()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setEmail(testData.email)
                .setGender(testData.gender)
                .setUserNumber(testData.userNumber)
                .setDate0fBirth(testData.birthDay,testData.birthMonth, testData.birthYear)
                .setSubjectsInput(testData.subjects)
                .setHobbiesCheckbox()
                .selectUploadPicture(testData.uploadImage)
                .setCurrentAddress(testData.currentAddress)
                .setState(testData.state)
                .setCity(testData.city)
                .clickSubmit();
        resultTable.checkResult("Student Name", testData.firstName + " " + testData.lastName)
                .checkResult("Student Email", testData.email)
                .checkResult("Gender", testData.gender)
                .checkResult("Mobile", testData.userNumber)
                .checkResult("Date of Birth", testData.dateOfBirth)
                .checkResult("Subjects", testData.subjects)
                .checkResult("Hobbies", testData.hobbies)
                .checkResult("Picture", testData.uploadImage)
                .checkResult("Address", testData.currentAddress)
                .checkResult("State and City", testData.state + " " + testData.city);
    }
}
