import { useState, useEffect } from "react";
import "./BuildsStyle.css";

function Builds () {
    const [builds,setProducts] = useState([]);

    useEffect(()=>{
        fetch("http://localhost:8080/builds").then(response => response.json()).then(body => setProducts(body));
    },[]);

    return (
        builds.map( element => 
            <div id="itemSet">
                <div>{element.item1}</div>
                <div>{element.item2}</div>
                <div>{element.item3}</div>
                <div>{element.item4}</div>
            </div>)
    );
}

export default Builds;