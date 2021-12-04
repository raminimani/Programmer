package JavaClass24.InterfaceDemo;

public interface WebDriver {
    public void openBrowser();
    public void closeBrowser();
    public void maximizeWindow();
    public void findElements();

}

class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {

    }

    @Override
    public void closeBrowser() {

    }

    @Override
    public void maximizeWindow() {

    }

    @Override
    public void findElements() {

    }
}
