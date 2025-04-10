package hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static baseUrl.Faker_BaseUrl.setUpFaker;
import static baseUrl.Gorest_BaseUrl.setupGorest;
import static baseUrl.Herokuapp_BaseUrl.setupHerokuapp;
import static baseUrl.Herokuapp_BaseUrl_Authentication.setupHerokuapp_Authentication;
import static baseUrl.Herokuapp_XML_BaseUrl.setupHerokuapp_XML;
import static baseUrl.JsonPlaceHolder_BaseUrl.setupJson;
import static baseUrl.PetStore_BaseUrl.setupPetStore;
import static baseUrl.PetStore_BaseUrl_XML.setupPetStore_XML;
import static baseUrl.PetStore_BaseUrl_XML_Post_Jsoup.setupPetStore_XML_Post_Jsoup;
import static baseUrl.Reqres_BaseUrl.setupReqres;

public class Hooks {

    @Before
    public void before() {
        setupReqres();
        setupJson();
        setupHerokuapp();
        setUpFaker();
        setupGorest();
        setupPetStore();
        setupHerokuapp_Authentication();
        setupHerokuapp_XML();
        setupPetStore_XML();
        setupPetStore_XML_Post_Jsoup();
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("After çalıştı");

        if (scenario.isFailed()) {
            String errorMessage = "Senaryo başarısız oldu: " + scenario.getName();

            System.err.println(errorMessage);

            scenario.attach(errorMessage.getBytes(), "text/plain", "HataMesajı");
        }
    }
}
