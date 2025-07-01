package com.qa.utility;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.qa.base.baseclass;

public class WindowUtils extends baseclass {
	WebDriver driver;

    public WindowUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToNewWindow() {
        String parent = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String win : allWindows) {
            if (!win.equals(parent)) {
                driver.switchTo().window(win);
                break;
            }
        }
        System.out.println(driver.getTitle());
    }
}
