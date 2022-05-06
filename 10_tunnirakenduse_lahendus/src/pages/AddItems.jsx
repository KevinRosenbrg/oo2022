import { useRef } from "react";
import "./AddItemsStyle.css";

function AddItems() {
    const nameRef = useRef();
    const damageRef = useRef();
    const defenceRef = useRef();
    const descriptionRef = useRef();

    function addItem() {
        fetch("http://localhost:8080/items", {
            method: "POST",
            body: JSON.stringify({
                name: nameRef.current.value,
                damage: damageRef.current.value,
                defence: defenceRef.current.value,
                description: descriptionRef.current.value
            }),
            headers: {
                "Content-Type": "application/json"
            }
        })
    }

    return (<div id="addBox">
        <label htmlFor="">Name</label>
        <input ref={nameRef} type="text" />
        <label htmlFor="">Damage</label>
        <input ref={damageRef} type="number" />
        <label htmlFor="">Defence</label>
        <input ref={defenceRef} type="number" />
        <label htmlFor="">Description</label>
        <input ref={descriptionRef} type="text" />
        <button onClick={() => addItem()} id="saveItem">Lisa</button>
    </div>);
}

export default AddItems;