// creating function which will work only with numbers by the metod Vararg
fun addNums(vararg number: Int) {
    //creating result
    var result = 0
    //using for to create mini variable
    for(n in number)
    //cycle
        result += n
    // and output
    println("Number is equal to $result")
}
fun main() {
    // in sum we can add number what we want
    addNums(1, 2, 3,  4, 5, 6, 7, 8, 9)
}