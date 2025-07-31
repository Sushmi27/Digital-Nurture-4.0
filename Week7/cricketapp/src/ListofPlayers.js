// src/ListofPlayers.js
import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: 'Virat', score: 85 },
    { name: 'Rohit', score: 45 },
    { name: 'Dhoni', score: 90 },
    { name: 'Jadeja', score: 60 },
    { name: 'KL Rahul', score: 74 },
    { name: 'Bumrah', score: 68 },
    { name: 'Gill', score: 80 },
    { name: 'Surya', score: 55 },
    { name: 'Shreyas', score: 95 },
    { name: 'Kuldeep', score: 64 },
    { name: 'Shami', score: 71 }
  ];

  // Filter using arrow function
  const below70 = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((p, i) => (
          <li key={i}>{p.name} - {p.score}</li>
        ))}
      </ul>

      <h2>Players with Score Below 70</h2>
      <ul>
        {below70.map((p, i) => (
          <li key={i}>{p.name} - {p.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
