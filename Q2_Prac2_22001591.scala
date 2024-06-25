var a = 2;
var b = 3;
var c = 4;
var d = 5;
var k = 4.3f;


@main def main2(): Unit = {
    b -= 1;
    println(s"--b * a + c * d -- = ${b*a + c*d}");
    d -= 1;
    a += 1;
    println(s"a++ = ${a}");
    println(s"-2 * (g - k) + c = ${-2 * (a-k) + c}");  //g is not defined
    println(s"c=c++ = ${c}");
    c += 1;
    c += 1;
    println(s"c=++c*a++ = ${c*a}");
    a += 1;
}