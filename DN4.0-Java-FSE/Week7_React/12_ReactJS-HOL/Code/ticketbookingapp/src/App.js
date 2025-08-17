import React, { useState } from 'react';
import './App.css';

function GuestGreeting() {
  return (
    <div>
      <h2>Please Sign Up</h2>
    </div>
  );
}

function UserGreeting() {
  return (
    <div>
      <h2>Welcome back!</h2>
    </div>
  );
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginLogout = () => {
    setIsLoggedIn(prev => !prev);
  };

  const element = isLoggedIn ? <UserGreeting /> : <GuestGreeting />;

  return (
    <div className="App">
      {element}
      <button onClick={handleLoginLogout}>
        {isLoggedIn ? 'Logout' : 'Login'}
      </button>
    </div>
  );
}

export default App;
