import kotlin.math.*
fun main (){
// pede para usuario entrar com os numeros
  println("Calculo de raizes de uma equação")
  println("Uma equação do segundo grau segue o seguinte padrão:")
  println("ax2+bx+c")
  println("digite o coeficiente de a: ")
  var num1=readLine()!!
  println("digite o coeficiente de b: ")
  var num2=readLine()!!
  println("digite o coeficiente de c: ")
  var num3=readLine()!!
  //exibir numeros digitados
  println("VocÊ digitou a:"+num1+",b:"+num2+",c:"+num3)
 //transforma texto (String) digitado em dado Double
  var a=num1.toDouble()
  var b=num2.toDouble()
  var c=num3.toDouble()

  println("numeros do tipo Double-> a:" 
+a+"x2+"+b+"x+"+c+"=0" )
//calculo de delta
  var delta=b*b-(4*a*c)
  println("O Delta é:"+delta) 
  var raizdelta=sqrt(delta)
  println("A raiz de delta é:"+raizdelta)
//calculo de x1
  var x1=(-b+raizdelta)/(2*a)
  println("x1: "+x1)
//calculo de x2
  var x2=(-b-raizdelta)/(2*a)
  println("x2: "+x2)
  
}
