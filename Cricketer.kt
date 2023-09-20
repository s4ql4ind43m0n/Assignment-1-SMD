//Before I knew much about Kotlin syntax, I've mostly dealt with diamond problems in C++
//my proposed algorithm would be something like this
/*interface Cricketer  {
   name:String,
   age:Int,
   nationality: String

   **functions would be something like:

   fun print(some parameter if necessary)
}
**** I was not sure if I had to make
concrete or abstract classes or make an interface
*** by intuition I went with the interfaces.


interface Bowler : Cricketer {
**Since Bowler inherited from Cricketer, it would inherit its attributes also

    wickets:Int
    bowlerRanking:Int
** I'd make my custom setters, i.e.,
    fun setWickets(_wickets:Int){
        wickets=_wickets
    }
**similar case for the BowlerRanking

    fun print(Wickets:Int)
    fun getranking(BowlerRanking:Int)
}

*** I'd write code for Batsman the same way with slight differences
in attributes and methods

class AllRounder : Bowler, Batsman {
     fun print (Score: Int, Wickets: Int){
        Batsman.print(Score) = Score?: 0
        Bowler.print(Wickets)= Wickets?:0
        println("$score, $wickets")

    }
}*/


//However, with some research and with the help of chatGPT,
//I modified the code that follows and is syntactically correct in Kotlin:
//interface Cricketer {
//    //no need for attributes, since they define a state
//    // states or attributes are associated with objects
//    // we cannot create an instance/object of the interface
//    //hence, no need for declaring attributes
//
//    //however we need to focus on the behaviour, for which I created a method
//    fun print(name: String, age: Int, nationality: String)
//}
//
////just for the sake of practice I implemented class ConcreteCricketer also:
//
//class ConcreteCricketer:Cricketer {
//    var name:String =""
//    var age:Int=0
//    var nationality ="Pakistani"
//
//    override fun print(_name: String, _age: Int, _nationality: String) {
//        name=_name
//        age = _age
//        nationality= _nationality
//    println("Details: $name, $age, $nationality")
//    }
//
//}
//to avoid diamond problem, I created two interfaces that inherit
//from Cricketer
//interface Bowler : Cricketer {
//    fun print()
//    fun setWickets(Wickets: Int)
//    fun setBowlerRanking(BowlerRanking: Int)
//    fun getranking() : Int
//    fun getWickets() :Int
//    fun bowlerPrint()
//    fun getBowlerRanking():Int
//}
//
//class ConcreteBowler : Bowler {
//    var _wickets:Int =0
//    var _bowlerRanking:Int = 0
//    override fun print(name: String, age: Int, nationality: String) {
//        // Implement the Cricketer's print method
//        println("$name, $age, $nationality")
//
//    }
//    override fun print(){
//        val wickets = getWickets()
//        val ranking = getranking()
//        println("Ranking: $ranking, wickets: $wickets")    }
//
//    override fun setBowlerRanking(BowlerRanking: Int) {
//        _bowlerRanking= BowlerRanking
//    }
//    override fun getranking():Int {
//        return _bowlerRanking
//    }
//
//    override fun getBowlerRanking(): Int {
//       return getranking()
//    }
//    override fun setWickets(Wickets: Int) {
//       _wickets=Wickets
//    }
//
//    override fun getWickets(): Int {
//        return _wickets
//    }
//    override fun bowlerPrint(){
//        print()
//    }
//}
//interface Batsman : Cricketer {
//    fun print()
//    fun getScore():Int
//    fun getRanking():Int
//    fun setBatsmanRanking(Ranking: Int)
//    fun setScore(Score:Int)
//    fun batsmanPrint()
//    fun getBatsmanRanking():Int
//}
//
//class ConcreteBatsman:Batsman{
//    var _score: Int =0
//    var _batsmanRanking:Int = 0
//    override fun print(name: String, age: Int, nationality: String) {
//        // Implement the Cricketer's print method
//        println("$name, $age, $nationality")
//
//    }
//    override fun setScore(Score:Int){
//        _score = Score
//    }
//    override fun getScore():Int {
//        return _score
//    }
//
//    override fun setBatsmanRanking(Ranking: Int) {
//        _batsmanRanking = Ranking
//    }
//    override fun getRanking():Int {
//        return _batsmanRanking
//    }
//
//    override fun getBatsmanRanking(): Int {
//        return getRanking()
//    }
//    override fun batsmanPrint(){
//        print()
//    }
//    override fun print(){
//        val score = getScore()
//        val ranking = getRanking()
//        println("Ranking: $ranking, Score: $score")
//    }
//
//
//
//}
//
//class AllRounder : Bowler, Batsman {
//    var _score: Int =0
//    var _batsmanRanking:Int = 0
//    var _wickets:Int =0
//    var _bowlerRanking:Int = 0
//    override fun print(name: String, age: Int, nationality: String) {
//        // Implement the Cricketer's print method
//        println("$name, $age, $nationality")
//
//    }
//    override fun setScore(Score:Int){
//        _score = Score
//    }
//    override fun getScore():Int {
//        return _score
//    }
//
//    override fun setBatsmanRanking(Ranking: Int) {
//        _batsmanRanking = Ranking
//    }
//    override fun getRanking():Int {
//        return _batsmanRanking
//    }
//
//    fun getranking(_batsmanRanking:Int, _bowlerRanking: Int): Pair<Int,Int>{
//        return Pair(getBowlerRanking(),  getBatsmanRanking())
//    }
//
//    override fun print(){
//
//        batsmanPrint()
//        bowlerPrint()
//    }
//
//    override fun batsmanPrint() {
//        println("This All-rounder's batsman stats are:")
//        println("Wickets: ${getScore()}, Ranking:  ${getRanking()}")
//    }
//
//    override fun bowlerPrint() {
//        println("This All-rounder's bowler stats are:")
//        println("Wickets: ${getWickets()}, Ranking:  ${getranking()}")  }
//
//    override fun setBowlerRanking(BowlerRanking: Int) {
//        _bowlerRanking= BowlerRanking
//    }
//    override fun getranking():Int {
//        return _bowlerRanking
//    }
//
//    override fun getBatsmanRanking(): Int {
//        return getRanking()
//    }
//
//    override fun getBowlerRanking(): Int {
//        return getranking()
//    }
//    override fun setWickets(Wickets: Int) {
//        _wickets=Wickets
//    }
//
//    override fun getWickets(): Int {
//        return _wickets
//    }
//
//}

// the code above had some issues regarding implementing same methods multiple times, so I changed the code.
interface Cricketer {
    fun print(name: String, age: Int, nationality: String)
}

interface Batsman : Cricketer {
    fun getRanking(): Int // Same method name in Batsman interface
    fun setBatsmanRanking(Ranking: Int)
    fun getScore(): Int
    fun setScore(Score: Int)
    fun print()
}

interface Bowler : Cricketer {
    fun getRanking(): Int // Same method name in Bowler interface
    fun setWickets(Wickets: Int)
    fun setBowlerRanking(BowlerRanking: Int)
    fun getWickets(): Int
    fun print()
}

class ConcreteBatsman : Batsman {
    var _score: Int = 0
    var _batsmanRanking: Int = 0

    override fun print(name: String, age: Int, nationality: String) {
        println("$name, $age, $nationality")
    }

    override fun setScore(Score: Int) {
        _score = Score
    }

    override fun getScore(): Int {
        return _score
    }

    override fun setBatsmanRanking(Ranking: Int) {
        _batsmanRanking = Ranking
    }

    override fun getRanking(): Int {
        return _batsmanRanking
    }

    override fun print(){
        val score = getScore()
        val ranking = getRanking()
        println("Ranking: $ranking, Score: $score")
    }
}

class ConcreteBowler : Bowler {
    var _wickets: Int = 0
    var _bowlerRanking: Int = 0

    override fun print(name: String, age: Int, nationality: String) {
        println("$name, $age, $nationality")
    }

    override fun setWickets(Wickets: Int) {
        _wickets = Wickets
    }

    override fun setBowlerRanking(BowlerRanking: Int) {
        _bowlerRanking = BowlerRanking
    }

    override fun getRanking(): Int {
        return _bowlerRanking
    }

    override fun getWickets(): Int {
        return _wickets
    }

    override fun print(){
        val wickets = getWickets()
        val ranking = getRanking()
        println("Ranking: $ranking, wickets: $wickets")    }
}

class AllRounder : Batsman, Bowler {
    var _score: Int = 0
    var _batsmanRanking: Int = 0
    var _wickets: Int = 0
    var _bowlerRanking: Int = 0

    override fun print(name: String, age: Int, nationality: String) {
        println("$name, $age, $nationality")
    }

    override fun setScore(Score: Int) {
        _score = Score
    }

    override fun getScore(): Int {
        return _score
    }

    override fun setBatsmanRanking(Ranking: Int) {
        _batsmanRanking = Ranking
    }

    override fun getRanking(): Int {
        println("What ranking do you want?\nPress a for Batsman Ranking.\nPress b for Bowler Ranking.\n")
        var option = readLine()
        while(option != "a" && option != "b"){
            println("Please provide correct option\nPress a for Batsman Ranking.\n" +
                    "Press b for Bowler Ranking.\n")
        }
        if(option!="a"){
            return _bowlerRanking
        }
        return _batsmanRanking
    }

    override fun setWickets(Wickets: Int) {
        _wickets = Wickets
    }

    override fun setBowlerRanking(BowlerRanking: Int) {
        _bowlerRanking = BowlerRanking
    }

    override fun getWickets(): Int {
        return _wickets
    }

    override fun print(){

        ("Bowler Ranking is $_bowlerRanking\nBatsman Ranking is $_batsmanRanking")
    }
}
