/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function crearLaSolicitud() {

    var fechaActual = new Date();

    if (document.getElementById("basic-url").value !== "") {
        axios.post('api/agregarCadena', {
            1: {
                idCadena: '100' + fechaActual.getDate() + fechaActual.getHours() + fechaActual.getMinutes(),
                contenidoCadena: document.getElementById("basic-url").value,
                fechaCadena: fechaActual
            }
        })
                .then(function (response) {
                    console.log(response.data);
                })
    }

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