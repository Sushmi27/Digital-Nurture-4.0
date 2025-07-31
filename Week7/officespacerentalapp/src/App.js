// src/App.js
import React from 'react';

function App() {
  // Office object array
  const offices = [
    {
      name: "Tech Park One",
      rent: 55000,
      address: "123 MG Road, Bangalore",
      image: "https://via.placeholder.com/300x200?text=Office+1"
    },
    {
      name: "GreenField Workspace",
      rent: 75000,
      address: "44 Anna Salai, Chennai",
      image: "https://via.placeholder.com/300x200?text=Office+2"
    },
    {
      name: "Sky Tower Offices",
      rent: 60000,
      address: "56 Gachibowli, Hyderabad",
      image: "https://via.placeholder.com/300x200?text=Office+3"
    }
  ];

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h1>🏢 Office Space Rental App</h1>

      {offices.map((office, index) => {
        const rentStyle = {
          color: office.rent < 60000 ? 'red' : 'green',
          fontWeight: 'bold'
        };

        return (
          <div key={index} style={{ border: '1px solid #ccc', padding: '10px', margin: '10px' }}>
            <img src={office.image} alt={office.name} style={{ width: '300px', height: '200px' }} />
            <h2>{office.name}</h2>
            <p style={rentStyle}>Rent: ₹{office.rent}</p>
            <p>Address: {office.address}</p>
          </div>
        );
      })}
    </div>
  );
}

export default App;