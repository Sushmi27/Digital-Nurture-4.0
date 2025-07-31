import React, { useState } from 'react';

function CurrencyConvertor() {
  const [rupees, setRupees] = useState('');
  const [euros, setEuros] = useState(null);

  const handleSubmit = () => {
    if (isNaN(rupees) || rupees.trim() === '') {
      alert("Enter valid rupee amount");
      return;
    }
    const euro = (parseFloat(rupees) / 90).toFixed(2);
    setEuros(euro);
  };

  return (
    <div>
      <input
        type="text"
        placeholder="Amount in INR"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
      />
      <button onClick={handleSubmit}>Convert</button>
      {euros && <p>💶 Euros: €{euros}</p>}
    </div>
  );
}

export default CurrencyConvertor;
