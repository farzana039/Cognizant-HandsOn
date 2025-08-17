import React from 'react';
import ListofPlayers from './ListofPlayers';
import IndianPlayers from './Indianplayers';

function App() {
  const flag = true;
  //const flag = false; 

  return (
    <div className="App">
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;