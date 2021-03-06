const nome = document.querySelector('#name');
const rgm = document.querySelector('#rgm');
const notaParcial = document.querySelector('#notaParcial');
const notaExercicios = document.querySelector('#notaExercicios');
const notaRegimental = document.querySelector('#notaRegimental');
const exibindoDados = document.querySelector('.exibindoDados');
const mensagem = document.querySelector('.message');

const dados = {
    nome: [],
    rgm: [],
    notaParcial: [],
    notaExercicios: [],
    notaRegimental: [],
};   

const conceito = {
    APROVADO: "Aprovado",
    REPROVADO: "Reprovado",
    AVALIACAOFINAL: "Avaliação Final",
};

document.querySelector('#cadastrar').addEventListener('click', () => {
    dados.nome.push(nome.value);
    dados.rgm.push(rgm.value);
    dados.notaParcial.push(notaParcial.value);
    dados.notaExercicios.push(notaExercicios.value);
    dados.notaRegimental.push(notaRegimental.value);

    mensagem.classList.add('open');

});

document.querySelector('#confirm').addEventListener('click', () => {
    mensagem.classList.remove('open');
});


document.querySelector('#exibirDados').addEventListener('click', () => {
    let tr = document.createElement('tr');
    exibindoDados.appendChild(tr);
    
    dados.nome.forEach(nome => {
        tdNome.textContent = nome;
        tr.appendChild(tdNome);
    });
    
    dados.rgm.forEach(rgm => {
        tdRGM.textContent = rgm;
        tr.appendChild(tdRGM);
    });

    dados.notaExercicios.forEach(el => {
        
    });

});

console.log(conceito.APROVADO);

console.log(dados);