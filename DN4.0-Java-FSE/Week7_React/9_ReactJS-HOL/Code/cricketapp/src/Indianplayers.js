import React from 'react';

const IndianPlayers = () => {
    // Using let, const, array destructuring, and spread operator
    const T20players = ["Rahul", "Hardik", "Rishabh"];
    const RanjiTrophyPlayers = ["Iyer", "Pujara", "Ashwin"];

    const allPlayers = [...T20players, ...RanjiTrophyPlayers];

    // Destructure for Odd and Even players
    const oddTeam = allPlayers.filter((_, index) => index % 2 !== 0);
    const evenTeam = allPlayers.filter((_, index) => index % 2 === 0);

    return (
        <div>
            <h2>Indian Players</h2>
            <h3>All Players</h3>
            <ul>
                {allPlayers.map((player, index) => (
                    <li key={index}>{player}</li>
                ))}
            </ul>

            <h3>Odd Team</h3>
            <ul>
                {oddTeam.map((player, index) => (
                    <li key={index}>{player}</li>
                ))}
            </ul>

            <h3>Even Team</h3>
            <ul>
                {evenTeam.map((player, index) => (
                    <li key={index}>{player}</li>
                ))}
            </ul>
        </div>
    );
};

export default IndianPlayers;
