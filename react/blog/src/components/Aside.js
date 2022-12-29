import React from 'react';

function Aside({aside}) {

    const categoryList = aside.category.map((category, index) => {
        return (
            <li key={index}>{category}</li>
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
                <li>{aside.latest1}</li>
                <li>{aside.latest2}</li>
                <li>{aside.latest3}</li>
                <li>{aside.latest4}</li>
            </ul>
        </aside>
    );
}

export default Aside;