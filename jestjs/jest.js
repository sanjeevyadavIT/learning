async function test(title, callback) {
  try {
    await callback();
    console.log(`✔ ${title}`);
  } catch (error) {
    console.error(`✖ ${title}`);
    console.error(error);
  }
}


function expect(actual) {
  return {
    toBe: (expected) => {
      if (actual !== expected) {
        throw new Error(`${actual} is not equal to ${expected}`)
      }
    },
    toBeGreaterThan: (expected) => {
      if (actual <= expected) {
        throw new Error(`${actual} is not greater than ${expected}`)
      }
    },
    toBeGreaterThanOrEqual: (expected) => {
      if (actual < expected) {
        throw new Error(`${actual} is not greater than or equal to ${expected}`)
      }
    },
    toBeLessThan: (expected) => {
      if (actual >= expected) {
        throw new Error(`${actual} is not less than ${expected}`)
      }
    },
    toBeLessThanOrEqual: (expected) => {
      if (actual > expected) {
        throw new Error(`${actual} is not less than or equal to ${expected}`)
      }
    },
    toEqual: (expected) => {
      if (Array.isArray(actual) && Array.isArray(expected)) {
        const errorMessage = `${actual} is not less than or equal to ${expected}`;
        if (actual.length !== expected.length) {
          throw new Error(errorMessage);
        }
        for (let i = 0; i < actual.length; i++) {
          if (actual[i] !== expected[i]) {
            throw new Error(errorMessage);
          }
        }
        return;
      }
      throw new Error('Only Array equality is checked');
    },
    toBeUndefined: (expected) => {
      if(expected !== undefined) {
        throw new Error('expected value was not undefined');
      }
    },
    not: {
      toBe: (expected) => {
        if (actual === expected) {
          throw new Error(`${actual} is equal to ${expected}`)
        }
      },
      toBeGreaterThan: (expected) => {
        if (actual > expected) {
          throw new Error(`${actual} is greater than ${expected}`)
        }
      },
      toBeGreaterThanOrEqual: (expected) => {
        if (actual >= expected) {
          throw new Error(`${actual} is greater than or equal to ${expected}`)
        }
      },
      toBeLessThan: (expected) => {
        if (actual < expected) {
          throw new Error(`${actual} is less than ${expected}`)
        }
      },
      toBeLessThanOrEqual: (expected) => {
        if (actual <= expected) {
          throw new Error(`${actual} is less than or equal to ${expected}`)
        }
      },
    }
  }
}

function fn(impl = () => {}) {
  const mockFunction = (...args) => {
    mockFunction.mock.calls.push(args);
    return impl(...args);
  }
  mockFunction.mock = {
    calls: [],
  }
  mockFunction.mockImplementation = newImpl => (impl = newImpl)
  return mockFunction;
}

function spyOn(object, parameter) {
  const originalValue =  object[parameter];
  object[parameter] = fn();
  object[parameter].mockRestore = () => (object[parameter] = originalValue)
}

global.test = test;
global.expect = expect;
global.fn = fn;
global.spyOn = spyOn;