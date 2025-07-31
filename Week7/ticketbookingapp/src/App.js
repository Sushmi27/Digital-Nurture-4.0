// src/App.js

import React, { useState } from 'react';

function GuestPage() {
  return (
    <div>
      <h2>Welcome, Guest!</h2>
      <p>Browse available flights below:</p>
      <ul>
        <li>Flight A - 9:00 AM</li>
        <li>Flight B - 12:30 PM</li>
        <li>Flight C - 7:45 PM</li>
      </ul>
    </div>
  );
}

function UserPage() {
  return (
    <div>
      <h2>Welcome, User!</h2>
      <p>You can now book your flight:</p>
      <button>Book Flight</button>
    </div>
  );
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const toggleLogin = () => setIsLoggedIn(prev => !prev);

  let pageContent = isLoggedIn ? <UserPage /> : <GuestPage />;

  return (
    <div className="App">
      <h1>✈️ Ticket Booking Portal</h1>
      <button onClick={toggleLogin}>
        {isLoggedIn ? 'Logout' : 'Login'}
      </button>
      {pageContent}
    </div>
  );
}

export default App;
