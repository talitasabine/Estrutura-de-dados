//Declarando uma fila vazia
//Em JS nativo não há uma estrutura de fila
//é utilizado ArrayList para copiar esse comportamento

let veiculos = []

//Adicionando elementos

veiculos.push('Corsa')
veiculos.push('Astra')
veiculos.push('Uno')

//exibindo a fila
console.log(veiculos)

//prieiro elemento da fila
console.log(veiculos[0])

//removendo elemento da fila
veiculos.shift()
console.log(veiculos)

//tamanho da fila
console.log(veiculos.length)

//a fila esta vazia?
console.log(veiculos.length==0)