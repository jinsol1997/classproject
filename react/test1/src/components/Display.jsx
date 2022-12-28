import React from "react";

function Display(props) {

    return (
        <li>
            {props.product.name}
        </li>
    )
}

export default Display