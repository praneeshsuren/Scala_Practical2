var k = 2;
var i = 2;
var j = 2;
var m = 5;
var n = 5;
var f = 12.0f;
var g = 4.0f;
var c = 'X';

@main def main1(): Unit = {
    println(s"k + 12*m = ${k + 12*m}");
    println(s"m / j = ${m/j}");
    println(s"n % j = ${n%j}");
    println(s"m / j * j = ${m/j*j}");
    println(s"f + 10*5 + g = ${f + 10*5 + g}");
    i += 1;
    println(s"++i*n = ${i*n}"); //Increment Operator ++ is not supported in Scala
}