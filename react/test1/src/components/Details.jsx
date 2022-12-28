import React from "react";

function Details(props){

    return(
        <>
        <h3>{props.product.name}</h3>
        <h3>{props.product.price}</h3>
        </>
    )


}

export default Details