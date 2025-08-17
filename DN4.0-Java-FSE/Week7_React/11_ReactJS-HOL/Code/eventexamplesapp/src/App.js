import logo from './logo.svg';
import './App.css';
import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConverter';

function App() {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(prev => prev + 1);
    alert(`Hello! Member ${count + 1}`);
  };

  const decrement = () => {
    setCount(prev => prev - 1);
    alert(`Hello! Member ${count - 1}`);
  };

  const sayWelcome = () => {
    alert("Welcome");
  };

  const handleClick = (e) => {
    e.preventDefault(); // Synthetic Event
    alert("I am clicked!");
  };

  return (
    <div className="App">
      <h1>Counter: {count}</h1>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>
      <button onClick={sayWelcome}>Say welcome</button>
      <button onClick={handleClick}>Click on me</button>
      
      <br /><br />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
