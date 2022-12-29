import React from 'react';

function Aside({aside}) {

    const categoryList = aside.category.map((category, index) => {
        return (
            <li key={index}>{category}</li>
        )
    })

    const latestList = aside.latest.map((latest, index) => {
        return (
            <li key={index}>{latest}</li>
        )
    })

    return (
        <aside>
            <h4>카테고리</h4>
            <ul>
                {categoryList}
            </ul>
            <h4>최근 글</h4>
            <ul>
                {latestList}
            </ul>
        </aside>
    );
}

export default Aside;