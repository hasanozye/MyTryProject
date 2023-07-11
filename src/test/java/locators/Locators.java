package locators;

public interface Locators extends LocatorsSauceDemo, LocatorsOpencart, LocatorsDemoqa{

    /*
    locator interface'i
    LocatorsSauceDemo, LocatorsOpencart ve locatorDemoqa interface'lerini
    extend eder ki her üçünde tanimlanmiş değişkenleri
    kendi bünyesine alabilsin diye

    Scenarios class'i icinde importlar kısmında
    import static locators.Locator.*;
    ile import edilmeli.

    Bu interface'de herhangi bir değişikliğe gerek yoktur.
     */


}
