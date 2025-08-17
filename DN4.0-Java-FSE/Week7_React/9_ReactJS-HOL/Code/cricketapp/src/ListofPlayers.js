import React from 'react';

const ListofPlayers = () => {
    const players = [
        { name: "Dhoni", score: 45 },
        { name: "Rohit", score: 85 },
        { name: "Virat", score: 60 },
        { name: "Gill", score: 74 },
        { name: "Hardik", score: 33 },
        { name: "Surya", score: 91 },
        { name: "Rahul", score: 65 },
        { name: "Ashwin", score: 55 },
        { name: "Jadeja", score: 76 },
        { name: "Shami", score: 40 },
        { name: "Bumrah", score: 50 },
    ];

    // Arrow function to filter players with score < 70
    const lowScorers = players.filter(player => player.score < 70);

    return (
        <div>
            <h2>List of All Players</h2>
            <ul>
                {players.map((player, index) => (
                    <li key={index}>{player.name} - {player.score}</li>
                ))}
            </ul>

            <h3>Players with score &lt; 70</h3>
            <ul>
                {lowScorers.map((player, index) => (
                    <li key={index}>{player.name} - {player.score}</li>
                ))}
            </ul>
        </div>
    );
};

export default ListofPlayers;
