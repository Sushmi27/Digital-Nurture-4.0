// src/IndianPlayers.js
import React from 'react';

const IndianPlayers = () => {
  const oddTeam = ['Virat', 'Dhoni', 'Gill', 'Shreyas', 'Kuldeep'];
  const evenTeam = ['Rohit', 'Jadeja', 'Rahul', 'Bumrah', 'Surya'];

  // Destructuring example
  const [player1, player2, ...restPlayers] = oddTeam;

  // Merge arrays using spread operator
  const T20players = ['Rohit', 'Virat'];
  const RanjiTrophy = ['Rahane', 'Pujara'];
  const allPlayers = [...T20players, ...RanjiTrophy];

  return (
    <div>
      <h2>Odd Team</h2>
      <ul>
        {oddTeam.map((p, i) => <li key={i}>{p}</li>)}
      </ul>

      <h2>Even Team</h2>
      <ul>
        {evenTeam.map((p, i) => <li key={i}>{p}</li>)}
      </ul>

      <h3>Destructured Players:</h3>
      <p>Player1: {player1}</p>
      <p>Player2: {player2}</p>

      <h3>Merged T20 + Ranji Trophy Players:</h3>
      <ul>
        {allPlayers.map((p, i) => <li key={i}>{p}</li>)}
      </ul>
    </div>
  );
};

export default IndianPlayers;
