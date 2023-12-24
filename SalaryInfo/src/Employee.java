public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    int initialYear = 2021;



    Employee(String name, double salary, int workHours, int hireYear)
    {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


double tax () {
    if(this.salary > 1000)

    {
       return this.salary * 0.03;
    }

    return 0;
}

double bonus () {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }

        return 0;
}

double raiseSalary() {


    if (this.hireYear - initialYear > 9 && this.hireYear - initialYear < 20 )
    {
        return this.salary * 0.10;
    }

   if (this.hireYear - initialYear > 20 )
    {
        return this.salary * 0.15;
    }

    return this.salary * 0.05;

}

double totalSalary() {
    return salary + (bonus() - tax()) + raiseSalary();
}

double taxBonusSalary() {
        return  salary + (bonus() - tax());
}

void printEmployeeInfo () {

        System.out.print(" Eleman İsmi: "+ this.name + "\n Maaşı: " + this.salary +
                "\n Çalışma Saati: " + this.workHours + "\n Başlangıç Yılı: "+ this.hireYear
                + "\n Vergi: " + tax() + "\n Bonus: " + bonus() +"\n Maaş Artışı: " + raiseSalary() +
                "\n Vergi ve Bonuslar ile Birlikte Maaş: " + taxBonusSalary() + "\n Toplam Maaş: "+
                totalSalary());

}

}
