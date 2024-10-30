import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DiscountTest {

    @Test
    public void checkDiscount20() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=" +
                "liza&last_name=&email=test%40example.com&password1=12345&password2=12345");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value = Login]")).click();

        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=9");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("20");
        driver.findElement(By.cssSelector("[value = Update]")).click();


        String discountPercent = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discount$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String total = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(discountPercent,
                "2",
                "процент дисконта не равен 2");
        softAssert.assertEquals(discount$,
                "4.0",
                "Сумма дисконта не равна 4.0");
        softAssert.assertEquals(total,
                "196.00",
                "Общая сумма стоимости книг не равна 196");
        driver.quit();
        softAssert.assertAll();
    }


    @Test
    public void checkDiscount48() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=" +
                "liza&last_name=&email=test%40example.com&password1=12345&password2=12345");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value = Login]")).click();

        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=9");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("48");
        driver.findElement(By.cssSelector("[value = Update]")).click();


        String discountPercent = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discount$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String total = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(discountPercent,
                "2",
                "процент дисконта не равен 2");
        softAssert.assertEquals(discount$,
                "9.6",
                "Сумма дисконта не равна 9.6");
        softAssert.assertEquals(total,
                "470.40",
                "Общая сумма стоимости книг не равна 470.40");
        driver.quit();
        softAssert.assertAll();
    }


    @Test
    public void checkDiscount50() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=" +
                "liza&last_name=&email=test%40example.com&password1=12345&password2=12345");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value = Login]")).click();

        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=9");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("50");
        driver.findElement(By.cssSelector("[value = Update]")).click();


        String discountPercent = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discount$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String total = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(discountPercent,
                "3",
                "процент дисконта не равен 3");
        softAssert.assertEquals(discount$,
                "15.0",
                "Сумма дисконта не равна 15.0");
        softAssert.assertEquals(total,
                "485.00",
                "Общая сумма стоимости книг не равна 485");
        driver.quit();
        softAssert.assertAll();
    }


    @Test
    public void checkDiscount99() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=" +
                "liza&last_name=&email=test%40example.com&password1=12345&password2=12345");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value = Login]")).click();

        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=9");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("99");
        driver.findElement(By.cssSelector("[value = Update]")).click();


        String discountPercent = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discount$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String total = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(discountPercent,
                "3",
                "процент дисконта не равен 3");
        softAssert.assertEquals(discount$,
                "29.7",
                "Сумма дисконта не равна 29.7");
        softAssert.assertEquals(total,
                "960.30",
                "Общая сумма стоимости книг не равна 960.30");
        driver.quit();
        softAssert.assertAll();
    }


    @Test
    public void checkDiscount100() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=" +
                "liza&last_name=&email=test%40example.com&password1=12345&password2=12345");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value = Login]")).click();

        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=9");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("100");
        driver.findElement(By.cssSelector("[value = Update]")).click();


        String discountPercent = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discount$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String total = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(discountPercent,
                "4",
                "процент дисконта не равен 4");
        softAssert.assertEquals(discount$,
                "40.0",
                "Сумма дисконта не равна 40.0");
        softAssert.assertEquals(total,
                "960.00",
                "Общая сумма стоимости книг не равна 960");
        driver.quit();
        softAssert.assertAll();
    }


    @Test
    public void checkDiscount499() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=" +
                "liza&last_name=&email=test%40example.com&password1=12345&password2=12345");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value = Login]")).click();

        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=9");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("499");
        driver.findElement(By.cssSelector("[value = Update]")).click();


        String discountPercent = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discount$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String total = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(discountPercent,
                "4",
                "процент дисконта не равен 4");
        softAssert.assertEquals(discount$,
                "199.60",
                "Сумма дисконта не равна 199.6");
        softAssert.assertEquals(total,
                "4790.40",
                "Общая сумма стоимости книг не равна 4790.4");
        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkDiscount500() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=" +
                "liza&last_name=&email=test%40example.com&password1=12345&password2=12345");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value = Login]")).click();

        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=9");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("500");
        driver.findElement(By.cssSelector("[value = Update]")).click();


        String discountPercent = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discount$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String total = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(discountPercent,
                "5",
                "процент дисконта не равен 5");
        softAssert.assertEquals(discount$,
                "250.00",
                "Сумма дисконта не равна 250");
        softAssert.assertEquals(total,
                "4750.00",
                "Общая сумма стоимости книг не равна 4750");
        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkDiscount999() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=" +
                "liza&last_name=&email=test%40example.com&password1=12345&password2=12345");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value = Login]")).click();

        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=9");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("999");
        driver.findElement(By.cssSelector("[value = Update]")).click();


        String discountPercent = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discount$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String total = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(discountPercent,
                "5",
                "процент дисконта не равен 5");
        softAssert.assertEquals(discount$,
                "499.50",
                "Сумма дисконта не равна 250");
        softAssert.assertEquals(total,
                "9490.50",
                "Общая сумма стоимости книг не равна 9490.5");
        driver.quit();
        softAssert.assertAll();
    }


    @Test
    public void checkDiscount1000() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=" +
                "liza&last_name=&email=test%40example.com&password1=12345&password2=12345");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value = Login]")).click();

        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=9");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("1000");
        driver.findElement(By.cssSelector("[value = Update]")).click();


        String discountPercent = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discount$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String total = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(discountPercent,
                "6",
                "процент дисконта не равен 6");
        softAssert.assertEquals(discount$,
                "600.00",
                "Сумма дисконта не равна 600");
        softAssert.assertEquals(total,
                "9490.50",
                "Общая сумма стоимости книг не равна 9400");
        driver.quit();
        softAssert.assertAll();
    }


    @Test
    public void checkDiscount4999() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=" +
                "liza&last_name=&email=test%40example.com&password1=12345&password2=12345");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value = Login]")).click();

        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=9");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("4999");
        driver.findElement(By.cssSelector("[value = Update]")).click();


        String discountPercent = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discount$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String total = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(discountPercent,
                "6",
                "процент дисконта не равен 6");
        softAssert.assertEquals(discount$,
                "2999.40",
                "Сумма дисконта не равна 2999.4");
        softAssert.assertEquals(total,
                "46990.60",
                "Общая сумма стоимости книг не равна 46990.6");
        driver.quit();
        softAssert.assertAll();
    }


    @Test
    public void checkDiscount5000() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=" +
                "liza&last_name=&email=test%40example.com&password1=12345&password2=12345");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value = Login]")).click();

        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=9");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("5000");
        driver.findElement(By.cssSelector("[value = Update]")).click();


        String discountPercent = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discount$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String total = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(discountPercent,
                "7",
                "процент дисконта не равен 7");
        softAssert.assertEquals(discount$,
                "3500.00",
                "Сумма дисконта не равна 3500.0");
        softAssert.assertEquals(total,
                "46500.00",
                "Общая сумма стоимости книг не равна 46500");
        driver.quit();
        softAssert.assertAll();
    }


    @Test
    public void checkDiscount9999() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=" +
                "liza&last_name=&email=test%40example.com&password1=12345&password2=12345");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value = Login]")).click();

        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=9");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("9999");
        driver.findElement(By.cssSelector("[value = Update]")).click();


        String discountPercent = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discount$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String total = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(discountPercent,
                "7",
                "процент дисконта не равен 7");
        softAssert.assertEquals(discount$,
                "6999.30",
                "Сумма дисконта не равна 6999.3");
        softAssert.assertEquals(total,
                "92990.70",
                "Общая сумма стоимости книг не равна 92990.7");
        driver.quit();
        softAssert.assertAll();
    }


    @Test
    public void checkDiscount10000() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=" +
                "liza&last_name=&email=test%40example.com&password1=12345&password2=12345");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value = Login]")).click();

        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=9");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("10000");
        driver.findElement(By.cssSelector("[value = Update]")).click();


        String discountPercent = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discount$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String total = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(discountPercent,
                "8",
                "процент дисконта не равен 8");
        softAssert.assertEquals(discount$,
                "8000.00",
                "Сумма дисконта не равна 8000");
        softAssert.assertEquals(total,
                "92000.00",
                "Общая сумма стоимости книг не равна 92000");
        driver.quit();
        softAssert.assertAll();
    }


    @Test
    public void checkDiscount10001() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=" +
                "liza&last_name=&email=test%40example.com&password1=12345&password2=12345");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value = Login]")).click();

        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=9");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("10001");
        driver.findElement(By.cssSelector("[value = Update]")).click();


        String discountPercent = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discount$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String total = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(discountPercent,
                "8",
                "процент дисконта не равен 8");
        softAssert.assertEquals(discount$,
                "8000.80",
                "Сумма дисконта не равна 8000");
        softAssert.assertEquals(total,
                "92009.20",
                "Общая сумма стоимости книг не равна 92009.2");
        driver.quit();
        softAssert.assertAll();
    }
}