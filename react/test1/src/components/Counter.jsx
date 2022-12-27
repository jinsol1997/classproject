import React from "react";
import { useState } from "react";

function Counter(props){
    // var count = 0

    const [count, setCount] = useState(0)

    return(
        <div>
            <p>총 {count} 번 클릭</p>
            <button onClick={() => setCount(count+1)}>
                Click
            </button>
        </div>
    )
}

export default Counter