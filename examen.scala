import util.control.Breaks._
// Verificar un numero par
println("Ejercicio 1")
def Par(num:Int): Boolean = {
  if(num%2==0){
    return true
  }
  else{
    return false
  }
}
Par(3)

//Buscar pares en una Lista
println("Ejercicio 2")
val lista = List(1,3,4,5)
def ListaPar(num:Int): Boolean = {
  if(num%2==0){
    println("Hay un numero par en la lista")
    return true
  }
  else{
    return false
  }
}
var i = 0
while(i < lista.size-1){
  if(ListaPar(lista(i)) == true) break

  i = i +1
}

//3 Afortunado numero 7
println("Ejercicio 3")
var newlista = List(1,7,2,7)
def Afortunado(num:Int): Int = {
  if(num==7){
    return 1
  }
  else{
    return 0
  }
}
var total= 0
var count = 0
for(x <- newlista){
  count = count + Afortunado(x)
}
total = newlista.sum + (7*count)
println(total)

//4 Equilibrar
println("Ejercicio 4")
def Equilibrio(Lista4:List[Int], div:Int): Boolean = {
  var parte1 = 0
  var parte2 = 0
  var i = 0
  while(i< Lista4.size){
    if(i <= div-1){
    parte1 = parte1 + Lista4(i)
    println(parte1)
    }
    else{
    parte2= parte2 + Lista4(i)
    println(parte2)
    }
    i = i+1
  }
  if(parte1 == parte2){
    return true
  }else{
    return false
  }
}
var Lista4= List(4,3,7)
var Lista5 = List(1,5,3,3)
var division = Lista4.size/2
var division2 = Lista5.size/2

Equilibrio(Lista4,division)
Equilibrio(Lista5,division2)

//5 palindromo
println("Ejercicio 5")
var palabra = "reconocer"
if(palabra == palabra.reverse){
  println("La palabra es un palindromo")
}else{
  println("La palabra no es un palindromo")
}
