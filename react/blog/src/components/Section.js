import React from 'react';

function Section({article}) {
    return (
        <article>
            <h2>{article.title}</h2>
            <p>{article.date}</p>
            <img src={article.imgUrl}/>
            <p className="lh-180">
                {article.description}
            </p>
        </article>
    );
}

export default Section;