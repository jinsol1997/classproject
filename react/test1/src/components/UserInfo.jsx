import React from "react";
import UserImg from "./userImg";

function UserInfo(props){
    return(
        <div className="userInfo">
                <UserImg user={props.user}/>
                <div className="userInfoName">
                    {props.userName}
                </div>
            </div>
    )
}

export default UserInfo