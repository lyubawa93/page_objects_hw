package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage {
    private final SelenideElement userNameInput = $("#userName");
    private final SelenideElement userEmailInput = $("#userEmail");
    private final SelenideElement currentAddressInput = $("#currentAddress");
    private final SelenideElement permanentAddressInput = $("#permanentAddress");
    private final SelenideElement submit = $("#submit");
    private final SelenideElement outputName = $("#output #name");
    private final SelenideElement outputEmail = $("#output #email");
    private final SelenideElement outputCurrentAddress = $("#output #currentAddress");
    private final SelenideElement outputPermanentAddress = $("#output #permanentAddress");

    public TextBoxPage openPage() {

        open("/text-box");

        return this;
    }

    public TextBoxPage setUserName(String value) {

        userNameInput.setValue(value);

        return this;
    }

    public TextBoxPage setEmailName(String value) {

        userEmailInput.setValue(value);

        return this;
    }

    public TextBoxPage setCurrentAddress(String value) {

        currentAddressInput.setValue(value);

        return this;
    }

    public TextBoxPage setPermanentAddress(String value) {

        permanentAddressInput.setValue(value);

        return this;
    }

    public TextBoxPage submit() {

        submit.click();

        return this;
    }

    public TextBoxPage checkNameResultValue(String value) {

        outputName.shouldHave(text(value));

        return this;
    }

    public TextBoxPage checkEmailResultValue(String value) {

        outputEmail.shouldHave(text(value));

        return this;
    }

    public TextBoxPage checkCurrentAddressResultValue(String value) {

        outputCurrentAddress.shouldHave(text(value));

        return this;
    }

    public void checkPermanentAddressResultValue(String value) {

        outputPermanentAddress.shouldHave(text(value));

    }
}
