test('expect matchers test', () => {
  expect(2).toBe(2);
  expect(5).toBeGreaterThan(2);
  expect(5).toBeGreaterThanOrEqual(1);
  expect(5).toBeLessThan(10);
  expect(5).toBeLessThanOrEqual(20);
  // negation
  expect(2).not.toBe(3);
  expect(5).not.toBeGreaterThan(10);
  expect(5).not.toBeGreaterThanOrEqual(10);
  expect(5).not.toBeLessThan(1);
  expect(5).not.toBeLessThanOrEqual(1);
});

test('check mock function working', () => {
  // Setup
  const module = {
    dummyFunction: (a, b) => a + b,
  }
  // mock the function
  module.dummyFunction = fn(() => 0);
  
  // Exercise
  module.dummyFunction(1,2);

  // Verify
  expect(module.dummyFunction.mock.calls.length).toBe(1);
  expect(module.dummyFunction.mock.calls[0]).toEqual([1,2]);
})
