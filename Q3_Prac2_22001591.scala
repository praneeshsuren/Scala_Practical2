val salPerWorkHour = 250;
val salPerOTHour = 85;
val taxRate = 12;

def netSal(workHours: Int, otHours: Int): Int = {
    var totSal = (workHours * salPerWorkHour) + (otHours * salPerOTHour);
    return (totSal - (totSal * (taxRate / 100)));
}

@main def main3(): Unit = {
    println(s"Take home salary: ${netSal(40, 30)}")
}