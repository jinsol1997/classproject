import React from 'react';

function Nav({nav}) {

    const navList = nav.li.map((li, index) => {
        return(
            <li key={index}>{li}</li>
        )
    })

    return (
        <nav>
            <ul>
                {navList}
            </ul>

            <div>
                <input type="text" />
                <input type="button" value="검색" />
            </div>
        </nav>
    );
}

export default Nav;