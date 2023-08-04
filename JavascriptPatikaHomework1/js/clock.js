let nameVal = prompt("Lütfen isminizi giriniz:")

let myNameDOM = document.querySelector("#myName")
myNameDOM.innerHTML = nameVal

let myClockDOM = document.querySelector("#myClock")

myClockDOM.innerHTML = new Date().toLocaleDateString() +" " + new Date().getSeconds()

function myFunc(){
    myClockDOM.innerHTML = new Date().toLocaleDateString() +" " + new Date().getSeconds()
}


setInterval(myFunc , 1000)



// function showTime(){
//     console.log("showtime")
//     let myClockDOM = document.querySelector("#myClock")
//     myClockDOM.innerHTML = new Date().getDay() +" " + new Date().getSeconds()

// }

