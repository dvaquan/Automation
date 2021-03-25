WebDriver driver = new ChromeDriver(); 
String locator = "//button[@class='btn_primary btn_inventory' and text()='ADD TO CART']"; //xpath to get all buttons "ADD TO CART"
Integer numberOfProduct = -1; 

String url = "https://www.saucedemo.com/inventory.html"; 
driver.get(url); //launch webpage

String header = "//div[@class='product_label' and text()='Products']"; //xpath to get Products title
Boolean display = driver.findElement(header).isDisplayed(); //check header is dislayed or not

if (display = true) //header display
{
	try 
	{
		List<WebElement> listOfProduct = driver.findElements(By.xpath(locator)); //find all the buttons "ADD TO CART" on the page
	}
	catch (Exception e)
	{
		system.out.println("There is no product on this page.");
	}
	numberOfProduct = listOfProduct.size(); //get the number of products

	if (numberOfProduct > 0)
	{
		system.out.println("Number of product = " + numberOfProduct);
	}
}
else
{
	system.out.println("Error on page.");
}

