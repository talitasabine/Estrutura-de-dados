pilha =[]
//Pilha preenchida
let pilha_dados =['Prato Azul', 'Prato Vermelho', 'Prato Verde']


//Empilhando elementos:PUSH
pilha_dados.push('Prato Branco')
pilha_dados.push('Prato Amarelo')

// Exibir dados da Pilha
console.log(pilha_dados)

//Verificar se a pilha está vazia: precisa verificar o length
console.log(pilha_dados.length ===0)

//Verificar o tamanho da pilha: propriedade length
console.log(pilha_dados.length)

//recorrendo uma pilha
for(let i = pilha_dados.length -1; i >=0; i--){
    console.log(pilha);
}