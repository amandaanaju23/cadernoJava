fun main(args: Array<String>) {
  // 1- faça um programa em Kotlin que socilicite dois numeros inteiros do usuario, o programa faz a soma desses numeros e exibe a resposta
  
  
  println("Qual seu nome?")
  var texto=readLine()!!
  println("Seja bem vindo " +texto)

  println("Digite um numero inteiro: ")
  var num1=readLine()!!
  var x = num1.toInt()
  println("Digite outro numero inteiro; ")
  var num2=readLine()!!
  var y =num2.toInt()
  var soma= x+y
  println("A soma é: " +soma) 
  //agora inclua as funcionalidades de subtração, multiplicação e  divisão.file

  println("Digite um numero inteiro: ")
  var nume1=readLine()!!
  var s = nume1.toInt()
  println("Digite outro numero inteiro; ")
  var nume2=readLine()!!
  var e =nume2.toInt()
  var subtracao= s-e
  println("O resultado é: " +subtracao)

  println("Digite um numero inteiro: ")
  var numer1=readLine()!!
  var a = numer1.toInt()
  println("Digite outro numero inteiro; ")
  var numer2=readLine()!!
  var b =numer2.toInt()
  var multiplicacao= a*b
  println("O resultado é: " +multiplicacao)

  println("Digite um numero inteiro: ")
  var numero1=readLine()!!
  var i = numero1.toInt()
  println("Digite outro numero inteiro; ")
  var numero2=readLine()!!
  var v =numero2.toInt()
  var divisao= i/v
  println("O resultado é: " +divisao)


  
  
}
