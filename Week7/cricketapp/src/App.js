// src/App.js
import React from 'react';
import ListofPlayers from './ListofPlayers';
import IndianPlayers from './IndianPlayers';

function App() {
  const flag = true; // ✅ change to false to view IndianPlayers component

  return (
    <div className="App">
      <h1>🏏 Cricket Application</h1>
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;