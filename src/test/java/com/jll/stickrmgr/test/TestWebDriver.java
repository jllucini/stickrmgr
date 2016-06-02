package com.jll.stickrmgr.test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.stereotype.Component;

public class TestWebDriver extends EventFiringWebDriver {  

	private static FirefoxDriver webDriver;
	
	static {
		String PROXY = "localhost:8080";

		org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
		proxy.setHttpProxy(PROXY)
		     .setFtpProxy(PROXY)
		     .setSslProxy(PROXY);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PROXY, proxy);
		webDriver = new FirefoxDriver(cap);
	}
	
	public TestWebDriver() {
		super(webDriver);
	}
}
