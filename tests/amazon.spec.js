import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {
  await page.goto('https://www.amazon.com/');
  await page.getByRole('button', { name: 'Submit' }).first().click();
  await page.getByRole('link', { name: 'Today\'s Deals' }).click();
  await page.getByRole('link', { name: 'Samsung Galaxy S26 Ultra, Unlocked Android Smartphone + $200 Gift Card, 512GB, Privacy Display, Galaxy AI, AI Camera, Super Fast Charging 3.0, Durable Battery, 2026, US 1 Year Warranty, Sky Blue', exact: true }).click();
  await page.getByRole('radio', { name: 'Galaxy S26+' }).click();
  await page.getByRole('button', { name: 'Pre-order now' }).click();
  await page.getByRole('textbox', { name: 'Enter mobile number or email' }).click();
  await page.getByRole('textbox', { name: 'Enter mobile number or email' }).fill('sdfghjnmk');
  await page.getByRole('button', { name: 'Continue' }).click();
  const invalidMsg = await page.getByText('Invalid email address');
console.log(await invalidMsg.innerText());
});