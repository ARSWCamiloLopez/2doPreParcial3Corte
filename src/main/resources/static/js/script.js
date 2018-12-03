/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

async function crearLaSolicitud() {

    var fechaActual = new Date();

    if (document.getElementById("basic-url").value !== "") {
        axios.post('api/agregarCadena', {
            1: {
                contenidoCadena: document.getElementById("basic-url").value,
                fechaCadena: fechaActual
            }
        })
                .then(function (response) {
                    console.log(response.data);
                })
    }

    document.getElementById("tbody").innerHTML = "";
    document.getElementById("basic-url").disabled = true;
    document.getElementById("btnEnviar").disabled = true;

    await sleep(2000);

    actualizarTabla();

    document.getElementById("basic-url").disabled = false;
    document.getElementById("btnEnviar").disabled = false;

}

function actualizarTabla() {

    var columnas = document.getElementById("tbody");

    axios.get("api/cadenas")
            .then(function (response) {
                for (var x in response.data) {
                    var trElement = document.createElement("tr");
                    for (var y in response.data[x]) {
                        var thElement = document.createElement("th");
                        thElement.innerHTML = response.data[x][y]
                        trElement.appendChild(thElement);
                    }
                    columnas.appendChild(trElement);
                }
            })
}

//Para realizar una espera
function sleep(ms) {
    return new Promise(resolve => setTimeout(resolve, ms));
}