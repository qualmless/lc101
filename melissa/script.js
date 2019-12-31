// Write your JavaScript code here!
window.addEventListener("load", function() {
    fetch("https://handlers.education.launchcode.org/static/planets.json").then( function(response) {
       response.json().then( function(json) {
       let journeyArray = response.json().length;
       alert("To prepare for your destination, please enter information.");
       console.log(journeyArray);
       const div = document.getElementById("missionTarget");
          div.innerHTML = `
             <h2>Mission Destination</h2>
                <ol>
                   <li>Name: ${json[2].name}</li>
                   <li>Diameter: ${json[2].diameter}</li>
                   <li>Star: ${json[2].star}</li>
                   <li>Distance from Earth: ${json[2].distance}</li>
                   <li>Number of Moons: ${json[2].moons}</li>
                </ol>
                <img src="${json[2].image}">
                `
    });
 });
 let form = document.querySelector("form");
 form.addEventListener("submit", function(event) {
    let pilotName = document.querySelector("input[name=pilotName]");
    let coPilotName = document.querySelector("input[name=copilotName]");
    let fuelLevel =  document.querySelector("input[name=fuelLevel]");
    let cargoMass =  document.querySelector("input[name=cargoMass]");
    // let launchReady = false;
    if (pilotName.value === "" || coPilotName.value === "" || fuelLevel.value === "" || cargoMass.value === "") {
       alert("All fields are required!");
       // stop the form submission
       event.preventDefault();
    }
    if((isNaN(fuelLevel.value)) || (isNaN(cargoMass.value))){
       alert("Please enter a valid number input");
       // stop the form submissionq
       event.preventDefault();
    }
    if((!isNaN(pilotName.value)) || (!isNaN(coPilotName.value))){
       alert("Please enter valid name in text");
       // stop the form submission 
       event.preventDefault();
    }
    if((fuelLevel.value < 10000) && (cargoMass.value > 10000)){
       alert("Not enough fuel for journey.");
       
       const div = document.getElementById("launchStatusCheck");
          div.innerHTML = `
          <h2 id="launchStatus" style="color:red;">Shuttle Not Ready for Launch</h2>
          <div  id="faultyItems" style="visibility: visible">
              <ol id="launchList">
                  <li id="pilotStatus">Pilot ${pilotName.value} is ready for launch.</li>
                  <li id="copilotStatus">Co-Pilot ${coPilotName.value} is ready for launch.</li>
                  <li id="fuelStatus">Fuel is too low for launch.</li>
                  <li id="cargoStatus">Cargo mass is too heavy for launch.</li>
              </ol>
              `
              event.preventDefault();
       } //End of 1st condition of launch
    if((fuelLevel.value > 10000) && (cargoMass.value < 10000)){
       alert("Shuttle is ready for journey.");
       // launchReady = true;
             
       const div = document.getElementById("launchStatusCheck");
          div.innerHTML = `
             <h2 id="launchStatus" style="color:green;">Shuttle Is Ready for Launch</h2>
             <div  id="faultyItems" style="visibility: visible">
                <ol id="launchList">
                   <li id="pilotStatus">Pilot ${pilotName.value} is ready for launch.</li>
                   <li id="copilotStatus">Co-Pilot ${coPilotName.value} is ready for launch.</li>
                   <li id="fuelStatus">Fuel is sufficient for launch.</li>
                   <li id="cargoStatus">Cargo mass is sufficient for launch.</li>
                </ol>
                `
                event.preventDefault();
       }//End of 2nd condition
    if((fuelLevel.value > 10000) && (cargoMass.value > 10000)){
       alert("Shuttle is not ready for journey.");
       const div = document.getElementById("launchStatusCheck");
          div.innerHTML = `
             <h2 id="launchStatus" style="color:red;">Shuttle Is Not Ready for Launch</h2>
             <div  id="faultyItems" style="visibility: visible">
                <ol id="launchList">
                   <li id="pilotStatus">Pilot ${pilotName.value} is ready for launch.</li>
                   <li id="copilotStatus">Co-Pilot ${coPilotName.value} is ready for launch.</li>
                   <li id="fuelStatus">Fuel is sufficient for launch.</li>
                   <li id="cargoStatus">Cargo mass is insufficient for launch.</li>
                </ol>
                `
                event.preventDefault();
        }//End of 3rd condition
    if((fuelLevel.value < 10000) && (cargoMass.value < 10000)){
       alert("Shuttle is not ready for journey.");
                                 
             const div = document.getElementById("launchStatusCheck");
                div.innerHTML = `
                   <h2 id="launchStatus" style="color:red;">Shuttle Is Not Ready for Launch</h2>
                      <div  id="faultyItems" style="visibility: visible">
                         <ol id="launchList">
                            <li id="pilotStatus">Pilot ${pilotName.value} is ready for launch.</li>
                            <li id="copilotStatus">Co-Pilot ${coPilotName.value} is ready for launch.</li>
                            <li id="fuelStatus">Fuel is insufficient for launch.</li>
                            <li id="cargoStatus">Cargo mass is sufficient for launch.</li>
                         </ol>
                         `
                         event.preventDefault();
       }//End of 4th condition
          
       
 });
 
 
 });
//    if(launchReady === true){
//       fetch("https://handlers.education.launchcode.org/static/planets.json").then( function(response) {
//          response.json().then( function(json) {
//          let journeyArray = response.json();
//          let randomJourney = journeyArray[Math.random() * journeyArray.length, [i]];
//          alert(randomJourney.length);
//          const div = document.getElementById("missionTarget");
//             div.innerHTML = `
//                <h2>Mission Destination</h2>
//                   <ol>
//                      <li>Name: ${randomJourney.name}</li>
//                      <li>Diameter: ${randomJourney.diameter}</li>
//                      <li>Star: ${randomJourney.star}</li>
//                      <li>Distance from Earth: ${randomJourney.distance}</li>
//                      <li>Number of Moons: ${randomJourney.moons}</li>
//                   </ol>
//                   <img src="${randomJourney.image}">
//                   `
// });
// });
// }
 
             
//    let newLi = document.createElement('li');
//   newLi.innerHTML = 'Hello, world!';
//   list.insertBefore(newLi, list.children[1]);
    

 
 
// This block of code shows how to format the HTML once you fetch some planetary JSON!
// <h2>Mission Destination</h2>
// <ol>
//    <li>Name: ${}</li>
//    <li>Diameter: ${}</li>
//    <li>Star: ${}</li>
//    <li>Distance from Earth: ${}</li>
//    <li>Number of Moons: ${}</li>
// </ol>
// <img src="${}">
// 