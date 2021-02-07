import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class FindeksSteps extends BaseTest {

    @Step("Anasayfaya gidilir")
    public void mainPage() throws InterruptedException {
        driver.get(url);
        System.out.println("Anasayfa Acilir");
    }

    @Step("<key> tikla")
    public void clickElementStep(String key) {
        clickElement(key);
        System.out.println(key+" Element tiklandi");
    }

    @Step("<key> elementi var mi")
    public void checkElementStep(String key) {
        try {
            findElement(key);
        } catch (Exception e) {
            Assert.fail(convertTurkishChar("Element bulunamadi"));
        }
    }

    @Step("<key> uzerine gel bekle")
    public void hoverElementStep(String key) {
        System.out.println(key+" geldi");
        hoverElement(key);
    }

    @Step("Yeni sekme acmak")
    public void newTabStep() {
        newTab();
        System.out.println("yeni sekme acildi");
    }

    @Step("Yeni Sekme Kapatmak")
    public void closeTabStep() {
        closeTab();
    }
}