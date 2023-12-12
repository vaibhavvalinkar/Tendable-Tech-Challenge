package pageobjects;

import actions.ActionHelper;
import org.openqa.selenium.By;

public class OurSolution {

    private static OurSolution _instance;

    private OurSolution() {
    }

    public static OurSolution getInstance() {
        if (_instance == null)
            _instance = new OurSolution();
        return _instance;
    }


}
