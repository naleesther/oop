fun main(){
    var Esther =Human("Esther",20,59)
    println(Esther.weight)
    Esther.foodWeight(1)
    Esther.weight
    Esther.speak("Akirachix is the best")
    Esther.birthday(1)
   var person=Champion("Jane","Mary","janemary@gmail.com",1116532902,"jneemee")
   println(person.firstName)
    println(person.email)
}

class Human(var name:String,var age:Int,var weight:Int){
    fun foodWeight(weightOfFood:Int){
        var weightOfFood = 1
        println("I am eating $weightOfFood kg of food")
        weight+=weightOfFood
        println(weight)
    }
    fun speak(speech:String){
        println (speech)
    }
    fun birthday(add:Int){
        age+=1
        println(age)
    }
     }
    data class Champion(var firstName:String,var secondName:String,var email:String,var phoneNumber:Int,var password:String,)



