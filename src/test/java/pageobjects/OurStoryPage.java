package pageobjects;

public class OurStoryPage {

    private static OurStoryPage _instance;

    private OurStoryPage() {
    }

    public static OurStoryPage getInstance() {
        if (_instance == null)
            _instance = new OurStoryPage();
        return _instance;
    }

}
