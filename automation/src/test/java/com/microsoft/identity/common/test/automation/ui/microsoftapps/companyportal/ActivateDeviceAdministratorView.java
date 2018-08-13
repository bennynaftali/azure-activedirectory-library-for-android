//  Copyright (c) Microsoft Corporation.
//  All rights reserved.
//
//  This code is licensed under the MIT License.
//
//  Permission is hereby granted, free of charge, to any person obtaining a copy
//  of this software and associated documentation files(the "Software"), to deal
//  in the Software without restriction, including without limitation the rights
//  to use, copy, modify, merge, publish, distribute, sublicense, and / or sell
//  copies of the Software, and to permit persons to whom the Software is
//  furnished to do so, subject to the following conditions :
//
//  The above copyright notice and this permission notice shall be included in
//  all copies or substantial portions of the Software.
//
//  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
//  THE SOFTWARE.

package com.microsoft.identity.common.test.automation.ui.microsoftapps.companyportal;


import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;

public class ActivateDeviceAdministratorView {
    //public static Target SCROLL_VIEW = Target.the("Swipe view").located(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.ScrollView\").instance(0)"));
    //public static Target CATEGORY = Target.the("Category").located(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.RelativeLayout\").instance(6)"));
    public static Target ACTIVATE_BUTTON = Target.the("Activate button").located(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(0)"));
    //public static Target ACTIVATE_BUTTON = Target.the("Activate button").located(By.id("com.android.settings:id/action_button"));
    public static Target CANCEL_BUTTON = Target.the("Cancel button").located(By.id("com.android.settings:id/cancel_button"));
    public static Target UNINSTALL_BUTTON = Target.the("Uninstall button").located(By.id("com.android.settings:id/uninstall_button"));
}
