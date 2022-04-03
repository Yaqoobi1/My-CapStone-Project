package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TabletsPageObject extends Base {
  public TabletsPageObject() {
	  PageFactory.initElements(driver , this);
  }
  
  
  @FindBy(xpath = "//a [contains(text(),'Tablets')]")
  private WebElement tablets;
  
  @FindBy(xpath = "//h2[contains(text(),'Tablets')]")
  private WebElement tabletsText;
  
  @FindBy(xpath = "//button[@id='list-view']")
  private WebElement listButton;
  
  @FindBy(xpath = "//button[@id='grid-view']")
  private WebElement gridButton;
  
  @FindBy(xpath = "//a[@id='compare-total']")
  private WebElement productCompare;
  
  @FindBy(xpath = "//select[@id='input-sort']")
  private WebElement sortBy;
  
  @FindBy(xpath = "//select[@id='input-limit']")
  private WebElement show;

  
  
  public void tabletsPageObject() {
	  tablets.click();
  }
  public boolean tabletsTextisPresent() {
	  if(tabletsText.isDisplayed())
		  return true;
	  else
		  return false;
		  
	  
  }

}

