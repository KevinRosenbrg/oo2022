import { useEffect, useState } from "react";
import "../pages/BuildMakerStyle.css";

function Buildmcom() {
    const [items,setProducts] = useState([]);

    useEffect(()=>{
        fetch("http://localhost:8080/items").then(response => response.json()).then(body => setProducts(body));
    },[]);


    
    return (
        items.map( element => 
            <div id="page">
                <div className="itemContainer">
                    <div >Name: {element.name}</div>
                    <div>Damage: {element.damage}</div>
                    <div>Defence: {element.defence}</div>
                    <div>Description: {element.description}</div>
                    <div hidden>{element.id}</div>
                </div>
            </div> )
    );
}

export default Buildmcom;