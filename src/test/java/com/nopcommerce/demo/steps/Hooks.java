package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.propertyreader.PropertyReader;
import com.nopcommerce.demo.utility.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Utility {
    // from cucumber.java not from testng
    @Before
    public void setup(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }
    //from cucumber.java not from testng
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenshot = getScreenShot();
            scenario.attach(screenshot, "image/png", scenario.getName());
            //screenshot only if test failed
        }
        closeBrowser();
        // this method will always execute whether test pass or fail
    }
}
