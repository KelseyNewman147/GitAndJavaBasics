package com.theironyard.charlotte;

public class Main {

    public static void main(String[] args) {
        Character harry = new Character();
        //describes character
        harry.name = "Harry Potter";
        harry.age = 15;
        harry.house = "Gryffindor";
        harry.isWizard = true;
        harry.year = 5;
        //call up method to age harry
        harry.hadBirthday();
        System.out.println("Harry's age is " + harry.age);

        Aggressor voldemort = new Aggressor();
        voldemort.isItYouKnowWho = true;
        voldemort.numberOfFoes = 1;
        voldemort.howDangerousAreThey = 9000;
        voldemort.whoIsIt = "He who must not be named";
        voldemort.spellOfChoice = "Avada Kedavra";

        voldemort.attackedHarry();
        System.out.println(voldemort.outcome);

        FantasticBeast buckbeak = new FantasticBeast();
        buckbeak.type = "hippogriff";
        buckbeak.color = "silver";
        buckbeak.numberOfHeads = 1;
        buckbeak.numberOfLegs = 4;
        buckbeak.threatLevel = 4;

        buckbeak.beastIsProvoked();
        System.out.println(buckbeak.outcome);

        House gryffindor = new House();
        gryffindor.headOfHouse = "Minerva McGonagall";
        gryffindor.houseColor = "Scarlett and Gold";
        gryffindor.houseName = "Gryffindor";
        gryffindor.numberOfRooms = 3;
        gryffindor.numberOfStudents = 24;

        gryffindor.newYear();
        System.out.println("Gryffindor now has " + gryffindor.numberOfStudents + " students!");

        Spell avadaKedavra = new Spell();
        avadaKedavra.type = "Killing curse";
        avadaKedavra.defense = "Mother's love";
        avadaKedavra.threatLevel = 7;
        avadaKedavra.deadly = true;
        avadaKedavra.timesHit = 1;

        avadaKedavra.spellCast();
        System.out.println(avadaKedavra.outcome);

        gryffindor.houseCup();
        System.out.println(gryffindor.outcome);

        gryffindor.expandingCharm();
        System.out.println("Too many students! Perform an expanding charm so we will have " + gryffindor.numberOfRooms + " rooms!");

        avadaKedavra.counterCurse();
        System.out.println(avadaKedavra.outcome);

        Spell crucio = new Spell();
        crucio.type = "unforgivable curse";
        crucio.threatLevel = 6;
        crucio.levelOfInjury = 5;

        crucio.iveBeenHit();
        System.out.println(crucio.outcome);

        FantasticBeast hydra = new FantasticBeast();
        hydra.numberOfHeads = 5;

        hydra.cutOffHead();
        System.out.println("Don't cut off its head! Now it has " + hydra.numberOfHeads + "!");

        FantasticBeast bane = new FantasticBeast();
        bane.numberOfLegs = 4;

        bane.humanOrCentaur();
        System.out.println("Is he a human or a centaur? " + bane.outcome + " duh");

        harry.sortingHat();
        System.out.println("You've been sorted into " + harry.outcome);

        harry.owls();
        System.out.println("You've passed your OWLs! Welcome to year " + harry.year);

        Aggressor dracoMalfoy = new Aggressor();
        dracoMalfoy.whoIsIt = "Draco";
        dracoMalfoy.isItYouKnowWho = false;
        dracoMalfoy.numberOfFoes = 1;
        dracoMalfoy.howDangerousAreThey = 4;

        dracoMalfoy.wizardsDuel();
        System.out.println(dracoMalfoy.outcome);

        dracoMalfoy.harryFights();
        System.out.println(dracoMalfoy.outcome);


    }
}
