import React, { useState } from 'react';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');
  const [converted, setConverted] = useState(null);

  const handleSubmit = (e) => {
    e.preventDefault();

    if (currency.toLowerCase() === 'euro') {
      const euroRate = 0.011; // Example: 1 INR = 0.011 Euro
      const result = parseFloat(amount) * euroRate;
      setConverted(result.toFixed(2));
    } else {
      alert('Only "euro" is supported. Please type euro in the currency field.');
    }
  };

  return (
    <div>
      <h2>INR to Euro Converter</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="number"
          placeholder="Enter amount in INR"
          value={amount}
          onChange={(e) => setAmount(e.target.value)}
          required
        />
        <input
          type="text"
          placeholder="Enter currency (e.g., euro)"
          value={currency}
          onChange={(e) => setCurrency(e.target.value)}
          required
        />
        <button type="submit">Convert</button>
      </form>

      {converted && (
        alert(`${amount} INR = € ${converted}`)
      )}
    </div>
  );
}

export default CurrencyConvertor;
