function newElement(){
    console.log("new element")
    let txtFieldDOM = document.querySelector("#task")
    let text = txtFieldDOM.value
    if(text.length > 0){
        let listDOM = document.querySelector("#list")
        let listItem = document.createElement("li")
        listItem.innerHTML = text
        listDOM.appendChild(listItem)

    }



}