


function generateTable() {
  // creates a <table> element and a <tbody> element
  const tbl = document.createElement("table");
  const tblBody = document.createElement("tbody");


  // creating all cells
  for (let i = 0; i < 4; i++) {
    // creates a table row
    const row = document.createElement("tr");

    for (let j = 0; j < 4; j++) {
      // Create a <td> element and a text node, make the text
      // node the contents of the <td>, and put the <td> at
      // the end of the table row
      const cell = document.createElement("td");
      const cellText = document.createTextNode(`cell in row ${i}, column ${j}`);
      cell.appendChild(cellText);
      row.appendChild(cell);
    }

    // add the row to the end of the table body
    tblBody.appendChild(row);
  }
  // put the <tbody> in the <table>
  tbl.appendChild(tblBody);
  // appends <table> into <body>
  document.body.appendChild(tbl);
  // sets the border attribute of tbl to '2'
  tbl.setAttribute("border", "2");
}


// Base URL, to access endpoints just append its name at the end of this base url.
const BASE_BACKEND_URL = "http://172.19.0.2:8080/api/v1"

function requestListFromBackend() {
  const avaliacaoEndpoint = 'avaliacao'
  const getId = `${BASE_BACKEND_URL}/${avaliacaoEndpoint}/2`
  console.log(`Enviando requisição para ${getId}...`)
  let loading = true


  fetch(getId, {
    method: 'GET',
    headers: {
      Accept: 'application/json',
    },
  },
  ).then(response => {
    if (response.ok) {
      response.json().then(json => {
        let avaliacao = json;
        loading = false;
        console.log(avaliacao);

      });
    } else {
      alert(`Erro ao solicitar dados. [Detalhe: Status Code ${response.status}]`)
      console.log(response)

    }
  }).catch(e => alert(`Erro ao solicitar dados. [Detalhe: ${e}]`));

  return false
}
