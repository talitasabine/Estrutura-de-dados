//criando uma Array e inicializando com valores com []
let carro = ['Gol', 'Corsa', 'Palio', 'HB20', 'Celta', 'Mobi', 'Kwid', 'KA']

//criando uma Array e inicializando valores com Array()

let marcas = new Array('Fiat,', 'Ford', 'Jeep')

//Criando um Array vazio
let acessorios = []
//ou dessa forma:
let categoria = new Array();

//Criar uma Array com um valor fixo
let cor = Array(5)

console.table(carro)
console.table(marcas)
console.table(acessorios)
console.table(categoria)
console.table(cor)

//adicionar um novo elemento no final da Array ->PUSH

carro.push('Logan')
console.table(carro)

//adicionar um novo elemento no inicio da Array ->UNSHIFT
carro.unshift('Compass')
console.table(carro)

//remover um elemento no final da Array ->POP
carro.pop()
console.table(carro)

//remover um elemento no incio da Array ->SHIFT
carro.shift()
console.table(carro)

//remover um elemento através da sua posição-> SPLICE
carro.splice(1,1) //remove 1 elemento a partir do index 1

//remover um elemento através de um valor especifico -> FILTER
carro = carro.filter(f=> f !='HB20') 
//tudo que for diferente de HB20 permanece

console.log('filter: ' + carro)

//substituir um elemento ->SPLICE

let carroNew = carro.splice(0, 1, 'Gol')
console.log('splice: '+carroNew)

//convertendo uma Array para uma String ->Join

let texto = carro.join(',')
console.log('join: '+texto)

//localizar um elemento na Array ->FIND
let localiza = carro.find(x=> x == 'Gol')
console.log('find: ' +localiza) //quando nao localiza aparece -> Undefined

//localizar um elemento na Array ->FIND
localiza = carro.find(x=> x == 'Gol')
console.log('find: ' +localiza) //quando localiza -> retorna valor

//localizar um elemento na Array -> INCLUDES
let existe = carro.includes('Gol')
console.log('include: ' +existe) // quando localiza é TRUE, contrário FALSE

//ordenar uma Array em crescente A-Z ou 0-N) -> SORT
carro.sort()
console.log('sort: ' +carro)

//ordenar uma Array em decrescente (Z-A ou N-0) -> Reverse
carro.reverse()
console.log('reverse: '+carro)

console.log(carro)

let numero =[1,2,3,4,5,6,7,8,9]
let dobra = numero.map(x=> x*2)
console.log(dobra)

//Array mesclada
let mesclada = ['Ford', 'Ka', 123, true, null, false, {cor:'vermelho'}]
console.log(mesclada)

//Array de objetos
let aluno = [
    {nome: 'Giovana', idade:22},
    {nome: 'Yago', idade:21},
    {nome: 'Taina', idade:19}
]
console.log(aluno)

//Acesso direto com array simples
console.log(carro[1])
console.log(carro[2])
let veiculo = carro[3]
console.log(veiculo)

console.log(aluno[0]) //recuperando o objeto por completo
console.log(aluno[0].nome) //recuperando o valor do atributo que esta dentro do objeto

//percorrendo uma Array
//for tradicional

for(let i=0; i< carro.length;i++){
    console.log(carro[i])
}

//forEach 
for(let c of carro){
    console.log(c)
}