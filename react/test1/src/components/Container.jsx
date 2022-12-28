import React from "react";
import Details from "./Details";
import Display from "./Display";

function Container(props){

    const product = [
        {name:'상품1', price:'1000'},
        {name:'상품2', price:'2000'},
        {name:'상품3', price:'3000'},
        {name:'상품4', price:'4000'},
        {name:'상품5', price:'5000'},
    ]

    const productList = product.map((product, index) => (<Display key={index} product={product}/>))
    const detailList = product.map((product, index) => (<Details key={index} product={product}/>))

    return (
        <div style={{width:"100vw", marginRight:"auto", marginLeft:"auto", overflow:"hidden"}}>

            <div style={{border:"1px solid gray", float:"left", textAlign:"center"}}>
                <ul>
            {productList}
                </ul>
            </div>

            <div style={{border:"1px solid gray", float:"right", textAlign:"center"}}>
            {detailList}
            </div>
            
        </div>
    )

}

export default Container