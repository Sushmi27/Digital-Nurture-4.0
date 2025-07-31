import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(count + 1);
    sayHello();
  };

  const sayHello = () => {
    alert("Hello! Static message displayed.");
  };

  const decrement = () => {
    setCount(count - 1);
  };

  const sayWelcome = (msg) => {
    alert(`Welcome Message: ${msg}`);
  };

  const handleClick = () => {
    alert("I was clicked using synthetic event!");
  };

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h1>🎯 React Event Examples</h1>

      <h2>1. Counter</h2>
      <p>Count: {count}</p>
      <button onClick={increment}>Increment</button>{' '}
      <button onClick={decrement}>Decrement</button>

      <h2>2. Welcome Button</h2>
      <button onClick={() => sayWelcome("Welcome to Event Handling!")}>Say Welcome</button>

      <h2>3. Synthetic Event</h2>
      <button onClick={handleClick}>Click Me</button>

      <h2>4. Currency Convertor</h2>
      <CurrencyConvertor />
    </div>
  );
}

export default App;
