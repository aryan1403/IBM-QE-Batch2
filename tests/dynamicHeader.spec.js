import { test } from "@playwright/test";

async function simpleWay(page) {
  const rows = await page.getByRole("row").all();
  const tableData = [];
  for (const row of rows) {
    const rowValues = await row
      .locator('[role="cell"], [role="columnheader"]')
      .allTextContents();

    if (rowValues.length > 0)
      tableData.push(rowValues);
  }
  return tableData;
}

async function betterWay(page) {
    const rowLocators = await page.getByRole("row").all();
    return await Promise.all(
    rowLocators.map(async (row) => {
      const cellLocators = await row
        .locator('[role="cell"], [role="columnheader"]')
        .all();
      return Promise.all(cellLocators.map((cell) => cell.innerText()));
    }),
  );
}

test("should show header Row ", async ({ page }) => {
  await page.goto("http://uitestingplayground.com/dynamictable");
  
  const tableData = await simpleWay(page);
  const tableData1 = await betterWay(page);
  console.log(tableData);
  console.log(tableData1);
});
