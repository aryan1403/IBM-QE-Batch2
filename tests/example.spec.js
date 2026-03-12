// @ts-check
import { test, expect } from '@playwright/test';

test.skip('contact page title', async ({page}) => {
  await page.goto('http://localhost:3000');
  await expect(page).toHaveTitle(/Pet Shop/);
});

test.skip('contact page submit', async ({page}) => {
  await page.goto('http://localhost:3000');
  const email = page.getByPlaceholder(/name@/);
  const msg = page.locator('#exampleFormControlTextarea1');

  const btn = page.getByText('Submit');

  email.fill('aaryan@gmail.com');
  msg.fill('asdfghjklk');

  await btn.click();
  await msg.screenshot({type: 'png', path: './msg.png'});
  await btn.screenshot({type: 'png', path: './button.png'});
  await page.screenshot({fullPage: true, type: 'png', path: './meow.png'});
});

[
  {email: "aaryan@gmail.com", msg: "Hello Aaryan"},
  {email: "arush@gmail.com", msg: "Hello Arush"}
].forEach(obj => {
  test.skip(`localhost 3000 contact test for ${obj.email}`, async ({ page }) => {
    await page.goto('http://localhost:3000/');
    await page.getByRole('textbox', { name: 'Email address' }).click();
    await page.getByRole('textbox', { name: 'Email address' }).fill(obj.email);
    await page.getByTestId('mytext').click();
    await page.getByTestId('mytext').fill(obj.msg);
    page.once('dialog', dialog => {
      console.log(`Dialog message: ${dialog.message()}`);
      dialog.dismiss().catch(() => {});
    });
    await page.getByRole('button', { name: 'Submit' }).click();
  });
})




test.skip('has title', async ({ page }) => {
  await page.goto('https://playwright.dev/');

  // Expect a title "to contain" a substring.
  await expect(page).toHaveTitle(/Playwright/);
});

test.skip('get started link', async ({ page }) => {
  await page.goto('https://playwright.dev/');

  // Click the get started link.
  await page.getByRole('link', { name: 'Get started' }).click();

  // Expects page to have a heading with the name of Installation.
  await expect(page.getByRole('heading', { name: 'Installation' })).toBeVisible();
});
