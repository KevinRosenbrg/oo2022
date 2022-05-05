import Buildmcom from "../components/Buildmcom";
import { useRef, useState, useEffect } from "react";
import "../components/Buildmcom.jsx";

function BuildMaker() {
    const name1Ref = useRef();
    const name2Ref = useRef();
    const name3Ref = useRef();
    const name4Ref = useRef();


    function addBuild() {
        fetch("http://localhost:8080/builds", {
            method: "POST",
            body: JSON.stringify({
                item1: name1Ref.current.value,
                item2: name2Ref.current.value,
                item3: name3Ref.current.value,
                item4: name4Ref.current.value
            }),
            headers: {
                "Content-Type": "application/json"
            }
        })
    }

    const [items,setProducts] = useState([]);

    useEffect(()=>{
        fetch("http://localhost:8080/items").then(response => response.json()).then(body => setProducts(body));
    },[]);


    return (
        <div>
            <div id="buttonDiv">
                <button id="saveButton" onClick={() => addBuild()}>Save Build</button>
                <div id="drops">
                    <select>
                        {items.map( element => 
                        <option ref={name1Ref} value={element.name}>{element.name}</option>
                        )}
                    </select>
                    <select>
                        {items.map( element => 
                        <option ref={name2Ref} value={element.name}>{element.name}</option>
                        )}
                    </select>
                    <select>
                        {items.map( element => 
                        <option ref={name3Ref} value={element.name}>{element.name}</option>
                        )}
                    </select>
                    <select>
                        {items.map( element => 
                        <option ref={name4Ref} value={element.name}>{element.name}</option>
                        )}
                    </select>
                </div>
            </div>
            <div id="page">
                <Buildmcom />
            </div>
        </div> )
}

export default BuildMaker;