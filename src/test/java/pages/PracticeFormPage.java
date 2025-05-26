package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.ResultTableComponent;
import tests.TestBase;

import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPage extends TestBase {
    private final SelenideElement firstNameInput = $("#firstName");
    private final SelenideElement lastNameInput = $("#lastName");
    private final SelenideElement userEmailInput = $("#userEmail");
    private final SelenideElement genderWrapper = $("#gender-radio-2+label");
    private final SelenideElement userNumberInput = $("#userNumber");
    private final SelenideElement calendarInput = $("#dateOfBirthInput");
    private final SelenideElement subjectInput = $("#subjectsInput");
    private final SelenideElement hobbiesCheckbox = $("#hobbies-checkbox-1+label");
    private final SelenideElement uploadPicture = $("#uploadPicture");
    private final SelenideElement currentAddress =$("#currentAddress");
    private final SelenideElement state = $("#react-select-3-input");
    private final SelenideElement city = $("#react-select-4-input");
    private final SelenideElement submit = $("#submit");

    CalendarComponent calendarComponent = new CalendarComponent();
    ResultTableComponent resultTableComponent = new ResultTableComponent();

    public PracticeFormPage openPage() {
        open("/automation-practice-form");
        return this;
    }
    public PracticeFormPage removeBanners() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }
    public PracticeFormPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }
    public PracticeFormPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }
    public PracticeFormPage setEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }
    public PracticeFormPage setGender() {
        genderWrapper.click();
        return this;
    }
    public PracticeFormPage setUserNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }
    public PracticeFormPage setDate0fBirth(String day, String month, String year) {
        calendarInput.click();
        calendarComponent.setDate(day, month, year);
        return this;
    }
    public PracticeFormPage setSubjectsInput(String value) {

        subjectInput.setValue(value).pressEnter();
        return this;
    }
    public PracticeFormPage setHobbiesCheckbox() {
        hobbiesCheckbox.click();
        return this;
    }
    public PracticeFormPage selectUploadPicture() {
        uploadPicture.uploadFromClasspath("cat.jpg");
        return this;
    }
    public PracticeFormPage setCurrentAddress(String value) {
        currentAddress.setValue(value);
        return this;
    }
    public PracticeFormPage setState(String value) {
        state.setValue(value).pressEnter();
        return this;
    }

    public PracticeFormPage setCity(String value) {
        city.setValue(value).pressEnter();
        return this;
    }

    public void clickSubmit() {
        submit.click();
    }
    public ResultTableComponent getResultTable() {
        return resultTableComponent;
    }
}
