public class Main {
    public static void main(String[] args){

    var dog = 8.0;
    var cat = 3.6;
    var paper = 763789;
    System.out.println(dog);
    System.out.println(cat);
    System.out.println(paper);
    dog=dog+4;
    cat=cat+4;
    paper=paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);
        var firstBoxerWeight=78.2;
        var secondBoxerWeight=82.7;
        var twoBoxersWeight=firstBoxerWeight+secondBoxerWeight;
        System.out.println("общий вес двух бойцов "+ twoBoxersWeight+"кг");
        var differenceWeight=secondBoxerWeight-firstBoxerWeight;
        System.out.println("разница между весами бойцов "+differenceWeight+"кг");
        var overWeight=secondBoxerWeight%firstBoxerWeight;
        System.out.println("разница между весами бойцов "+overWeight+"кг");
        var workTime=640;
        var eachemployeeTime=8;
        var numberEmployeers=workTime/eachemployeeTime;
        System.out.println("Всего работников в компании "+numberEmployeers+" человек");
        numberEmployeers=numberEmployeers+94;
        workTime=workTime*8;
        System.out.println("Если в компании работает "+numberEmployeers+" человека, то всего "+workTime+" часов работы может быть поделено между сотрудниками");
    }

}