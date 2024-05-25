import { test, expect } from 'vitest';
import { sayHello } from '../src/hello';

test('Says hello', () => {
    const result = sayHello();
    expect(result).toEqual('Hello World!');
});