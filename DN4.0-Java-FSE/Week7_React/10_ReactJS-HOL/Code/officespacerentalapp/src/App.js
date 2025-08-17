import logo from './logo.svg';
import './App.css';
import React from 'react';

function App() {
  const element = "Office Space"
  const sr="https://images.unsplash.com/photo-1524758631624-e2822e304c36"
  const jsxatt = <img src={sr} width="25%" height="25%" alt="Office Space" />;
  const ItemName = {
    Name: "DBS",
    Rent: 5000,
    Address: "Chennai"
  };
  return (
      <div className="App">
        <h1>{element} , at Affordable Range </h1>
        {jsxatt}
        <h1>Name: {ItemName.Name}</h1>
        <h3 style={{ color: ItemName.Rent <= 60000 ? 'red' : 'green' }}>Rent: Rs.{ItemName.Rent}</h3>
        <h3>Address: {ItemName.Address}</h3>
      </div>
  );
}

export default App;
