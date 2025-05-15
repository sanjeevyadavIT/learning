import puppeteer from "puppeteer";

(async () => {
  const browser = await puppeteer.launch({
    headless: false,
    slowMo: 50,
  });
  const page = await browser.newPage();

  // Navigate the page to a URL
  await page.goto("https://www.flipkart.com/");

  // Set screen size
  await page.setViewport({
    width: 1080,
    height: 1024,
  });

  // Type into the search box
  await page.type(".Pke_EE", "laptop");

  // Press the Enter key
  await page.keyboard.press("Enter");

  // Wait for the page to load after pressing Enter (if needed)
  await page.waitForNavigation();

  // Click on login button
  await page.click(".wsejfv");

  await page.waitForSelector(".r4vIwl");

  await browser.close();
})();
