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

test('check spyOn function working', () => {
  // Setup
  const module = {
    dummyFunction: (a, b) => a + b,
  }
  // mock function using mockImplementation
  spyOn(module, 'dummyFunction')
  module.dummyFunction.mockImplementation((a , b) => 0)

  // Exercise
  let result = module.dummyFunction(2, 3)

  // Verify
  expect(result).toBe(0)
  expect(module.dummyFunction.mock.calls.length).toBe(1)
  expect(module.dummyFunction.mock.calls[0]).toEqual([2, 3])

  // Cleanup
  module.dummyFunction.mockRestore()

  // Cleanup Verify
  result = module.dummyFunction(2, 3)
  expect(result).toBe(5)
  expect(module.dummyFunction.mock).toBeUndefined(); // no longer being mocked
})