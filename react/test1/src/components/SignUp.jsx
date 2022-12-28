import React from "react";
import { useState } from "react";

function SingUp(props){

    const [name, setName] = useState('이름')
    const [gender, setGender] = useState('남성')

    const handleSubmit = (event) => {
        event.preventDefault()
        alert(`이름 : ${name} 성별 : ${gender}`)
    }

    return(
        <form>
            <label>
                이름 :
                <input type="text" value={name} onChange={(event) => setName(event.target.value)}/>
            </label><br/>

            <label>
                성별 :
                <select value={gender} onChange={(event) => setGender(event.target.value)}>
                    <option value="남성" >남성</option>
                    <option value="여성" >여성</option>
                </select>
            </label><br/>
            <input type="submit" value="제출" onClick={handleSubmit} />
        </form>
    )
}

export default SingUp