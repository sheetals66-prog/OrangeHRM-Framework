package com.pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.fileutils.WaitFor;

public class HomePage {
@FindBy(xpath="//span[text() =\"Dashboard\"]")
WebElement dashBoardMenu;

@FindBy(xpath ="//span[text()=\"Admin\"]")
WebElement adminMenu1;

@FindBy(xpath ="//span[text()=\"PIM\"]")
WebElement pimMenu;

@FindBy(xpath  ="//span[text()=\"Leave\"]")
WebElement leaveMenu;

@FindBy(xpath  ="//span[text()=\"Time\"]")
WebElement timeMenu;

@FindBy(xpath  ="//span[text()=\"Recruitment\"]")
WebElement recruitmentMenu;

@FindBy(xpath ="//span[text()=\"My Info\"]")
WebElement myiInfoMenu;

@FindBy(xpath ="//span[text()=\"Performance\"]")
WebElement performanceMenu;

public void waitForpimmenu() {
	WaitFor.elementToBevisible(By.xpath("//span[text() =\"PIM\"]"));
}

}
