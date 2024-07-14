import HW1.*;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hello world!");*/

//        exercise 1
/*
        Dog yorik = new Dog("Luntik", new BigDecimal("5"), new String("yorik"));
        System.out.println(yorik.getName());
        System.out.println(yorik.getAge());
        System.out.println(yorik.getPoroda());

        yorik.setName(new String("Leo"));
        System.out.println(yorik.getName());

        yorik.setAge(new BigDecimal("8"));
        System.out.println(yorik.getAge());

        yorik.setPoroda(new String("yorkshire terrier"));
        System.out.println(yorik.getPoroda());

        Dog span = new Dog("Lola", new BigDecimal("2"), new String("Spaniel"));
        System.out.println(span.getName());
        System.out.println(span.getAge());
        System.out.println(span.getPoroda());

        span.setName(new String("Luna"));
        System.out.println(span.getName());

        span.setAge(new BigDecimal("4"));
        System.out.println(span.getAge());

        span.setPoroda(new String("cocker spaniel"));
        System.out.println(span.getPoroda());

        Dog pit = new Dog("Bonk", new BigDecimal("1.5"), new String("Pit bull"));
        System.out.println(pit.getName());
        System.out.println(pit.getAge());
        System.out.println(pit.getPoroda());

        pit.setName(new String("Bars"));
        System.out.println(pit.getName());

        pit.setAge(new BigDecimal("2"));
        System.out.println(pit.getAge());

        pit.setPoroda(new String("Pitbul"));
        System.out.println(pit.getPoroda());

        Dog shepherd = new Dog("Pes", new BigDecimal("7"), new String("Shepherd"));
        System.out.println(shepherd.getName());
        System.out.println(shepherd.getAge());
        System.out.println(shepherd.getPoroda());

        shepherd.setName(new String("Graf"));
        System.out.println(shepherd.getName());

        shepherd.setAge(new BigDecimal("8.5"));
        System.out.println(shepherd.getAge());

        shepherd.setPoroda(new String("German Shepherd"));
        System.out.println(shepherd.getPoroda());

        Dog bolonka = new Dog("Alza", new BigDecimal("4.5"), new String("bolonka"));
        System.out.println(bolonka.getName());
        System.out.println(bolonka.getAge());
        System.out.println(bolonka.getPoroda());

        bolonka.setName(new String("Graf"));
        System.out.println(bolonka.getName());

        bolonka.setAge(new BigDecimal("8.5"));
        System.out.println(bolonka.getAge());

        bolonka.setPoroda(new String("Bolognese "));
        System.out.println(bolonka.getPoroda());

    }*/

//    -----------------------------------------------

       /* Car mers = new Car("mers", new BigDecimal("100"), new BigDecimal("1.6"), new String("EK7"));
        System.out.println(mers.getModel());
        System.out.println(mers.getPower());
        System.out.println(mers.getTurbo());
        System.out.println(mers.getVolume());

        mers.setModel(new String("Mercedes G"));
        System.out.println(mers.getModel());

        mers.setPower(new BigDecimal("200"));
        System.out.println(mers.getPower());

        mers.setTurbo(new String("ER9"));
        System.out.println(mers.getTurbo());

        mers.setVolume(new BigDecimal("2.1"));
        System.out.println(mers.getVolume());


        Car peugeot = new Car("Peugeot 307", new BigDecimal("72"), new BigDecimal("1.6"), new String("ER1"));
        System.out.println(peugeot.getModel());
        System.out.println(peugeot.getPower());
        System.out.println(peugeot.getTurbo());
        System.out.println(peugeot.getVolume());

        peugeot.setModel(new String("Peugeot 208"));
        System.out.println(peugeot.getModel());

        peugeot.setPower(new BigDecimal("100"));
        System.out.println(peugeot.getPower());

        peugeot.setTurbo(new String("KH5"));
        System.out.println(peugeot.getTurbo());

        peugeot.setVolume(new BigDecimal("1.8"));
        System.out.println(peugeot.getVolume());

        Car opel = new Car("Opel Astra", new BigDecimal("80"), new BigDecimal("2.2"), new String("TI3"));
        System.out.println(opel.getModel());
        System.out.println(opel.getPower());
        System.out.println(opel.getTurbo());
        System.out.println(opel.getVolume());

        opel.setModel(new String("Opel Insigna"));
        System.out.println(opel.getModel());

        opel.setPower(new BigDecimal("150"));
        System.out.println(opel.getPower());

        opel.setTurbo(new String("JD8"));
        System.out.println(opel.getTurbo());

        opel.setVolume(new BigDecimal("2.1"));
        System.out.println(opel.getVolume());


        Car nissan = new Car("Nissan Qashqai", new BigDecimal("150"), new BigDecimal("1.7"), new String("TD1"));
        System.out.println(nissan.getModel());
        System.out.println(nissan.getPower());
        System.out.println(nissan.getTurbo());
        System.out.println(nissan.getVolume());

        nissan.setModel(new String("Nissan Juke"));
        System.out.println(nissan.getModel());

        nissan.setPower(new BigDecimal("220"));
        System.out.println(nissan.getPower());

        nissan.setTurbo(new String("HS5"));
        System.out.println(nissan.getTurbo());

        nissan.setVolume(new BigDecimal("2.8"));
        System.out.println(nissan.getVolume());

        Car toyota = new Car("Toyota Camry", new BigDecimal("250"), new BigDecimal("2.9"), new String("YG3"));
        System.out.println(toyota.getModel());
        System.out.println(toyota.getPower());
        System.out.println(toyota.getTurbo());
        System.out.println(toyota.getVolume());

        toyota.setModel(new String("Toyota Supra"));
        System.out.println(toyota.getModel());

        toyota.setPower(new BigDecimal("150"));
        System.out.println(toyota.getPower());

        toyota.setTurbo(new String("PL4"));
        System.out.println(toyota.getTurbo());

        toyota.setVolume(new BigDecimal("1.7"));
        System.out.println(toyota.getVolume());*/

//        -------------------------------------------------------------
      /*  Book bell = new Book("Beauty and Beast", new BigDecimal("400"));
        System.out.println(bell.getTitle());
        System.out.println(bell.getPages());

        bell.setGenre(new String("Romance"));
        System.out.println(bell.getGenre());

        bell.addAuhors("Janna-Mary");
        bell.addAuhors("Brothers Grimm");
        bell.addAuhors("Jan Pero");

        *//*bell.removeAuhors("Janna-Mary");*//*
        System.out.println(bell.getAuhors());

        for (int index = 0; index < bell.getAuhors().size(); index++)
            System.out.println(bell.getAuhors().get(index ));

        for (String author : bell.getAuhors()){
            System.out.println(author);
        }

        int index = 0;
        while (index < bell.getAuhors().size()){
            System.out.println(bell.getAuhors().get(index));
            index++;
        }

        if (bell.getAuhors().size() > 0){
            System.out.println("Bell have authors");
        }

        Book anaconda = new Book("Anaconda", new BigDecimal("342"));
        System.out.println(anaconda.getTitle());
        System.out.println(anaconda.getPages());

        anaconda.setGenre(new String("Documentary"));
        System.out.println(anaconda.getGenre());

        anaconda.addAuhors("Karlos Luis");
        anaconda.addAuhors("Rex Status");
        anaconda.addAuhors("Jorj Simeron");
        anaconda.addAuhors("Marcus Simenson");

        *//*anaconda.removeAuhors("Rex Status");*//*
        System.out.println(anaconda.getAuhors());

        for (int index2 = 0; index2 < anaconda.getAuhors().size(); index2++)
            System.out.println(anaconda.getAuhors().get(index2));

        for (String author : anaconda.getAuhors()){
            System.out.println(author);
        }

        int index2 = 0;
        while (index2 < anaconda.getAuhors().size()){
            System.out.println(anaconda.getAuhors().get(index2));
            index2++;
        }

        if (anaconda.getAuhors().size() > 0){
            System.out.println("Anaconda have authors");
        }

        Book potter = new Book("Harry Potter", new BigDecimal("1000"));
        System.out.println(potter.getTitle());
        System.out.println(potter.getPages());

        potter.setGenre(new String("Fantasy"));
        System.out.println(potter.getGenre());

        potter.addAuhors("Emma Wotson");
        potter.addAuhors("Rupert Grint");
        potter.addAuhors("Daniel Radcliffe");


        *//*potter.removeAuhors("Rupert Grint");*//*
        System.out.println(potter.getAuhors());

        for (int index3 = 0; index3 < potter.getAuhors().size(); index3++)
            System.out.println(potter.getAuhors().get(index3));

        for (String author : potter.getAuhors()){
            System.out.println(author);
        }

        int index3 = 0;
        while (index3 < potter.getAuhors().size()){
            System.out.println(potter.getAuhors().get(index3));
            index3++;
        }

        if (potter.getAuhors().size() > 0){
            System.out.println("Harry Potter have authors");
        }

        Book holms = new Book("Sherlok Holms", new BigDecimal("850"));
        System.out.println(holms.getTitle());
        System.out.println(holms.getPages());

        holms.setGenre(new String("Detective"));
        System.out.println(holms.getGenre());

        holms.addAuhors("Artur Konan Dojl");
        holms.addAuhors("Doctor Watson");



        *//*holms.removeAuhors("Doctor Watson");*//*
        System.out.println(holms.getAuhors());

        for (int index4 = 0; index4 < holms.getAuhors().size(); index4++)
            System.out.println(holms.getAuhors().get(index4));

        for (String author : holms.getAuhors()){
            System.out.println(author);
        }

        int index4 = 0;
        while (index4 < holms.getAuhors().size()){
            System.out.println(holms.getAuhors().get(index4));
            index4++;
        }

        if (holms.getAuhors().size() > 0){
            System.out.println("Sherlok Holms have authors");
        }

        Book snow = new Book("Snow White", new BigDecimal("600"));
        System.out.println(snow.getTitle());
        System.out.println(snow.getPages());

        snow.setGenre(new String("Fantasy"));
        System.out.println(snow.getGenre());

        snow.addAuhors("Brothers Grimm");
        snow.addAuhors("Sharl Pero");
        snow.addAuhors("Luisa Marco");



        *//*snow.removeAuhors("Sharl Pero");*//*
        System.out.println(snow.getAuhors());

        for (int index5 = 0; index5 < snow.getAuhors().size(); index5++)
            System.out.println(snow.getAuhors().get(index5));

        for (String author : snow.getAuhors()){
            System.out.println(author);
        }

        int index5 = 0;
        while (index5 < snow.getAuhors().size()){
            System.out.println(snow.getAuhors().get(index5));
            index5++;
        }

        if (snow.getAuhors().size() > 0){
            System.out.println("Snow White have authors");
        }*/

//        Exercise2

        /*Exercise2 user1 = new Exercise2(new BigDecimal("75"), new BigDecimal("1"), new String("The best dreams happen when you’re awake"), new String("Accept who you are. Unless you’re a serial killer.» (Ellen DeGeneres, Seriously… I’m Kidding"));
        System.out.println(user1.getUserId());
        System.out.println(user1.getId());
        System.out.println(user1.getBody());
        System.out.println(user1.getTitle());

        user1.setTitle("You can never be overdressed or overeducated.");
        System.out.println(user1.getTitle());


        Exercise2 user2 = new Exercise2(new BigDecimal("45"), new BigDecimal("2"), new String("Fall seven times and stand up eigh"), new String("Success is not the key to happiness. Happiness is the key to success"));
        System.out.println(user2.getUserId());
        System.out.println(user2.getId());
        System.out.println(user2.getBody());
        System.out.println(user2.getTitle());

        user2.setUserId(new BigDecimal("38"));
        System.out.println(user2.getUserId());

        Exercise2 user3 = new Exercise2(new BigDecimal("7"), new BigDecimal("3"), new String("Learning is a treasure that will follow its owner everywhere"), new String("Success is the child of audacity"));
        System.out.println(user3.getUserId());
        System.out.println(user3.getId());
        System.out.println(user3.getBody());
        System.out.println(user3.getTitle());

        user3.setBody(new String("To have another language is to possess a second soul"));
        System.out.println(user3.getBody());

        Exercise2 user4 = new Exercise2(new BigDecimal("101"), new BigDecimal("4"), new String("We do not remember days, we remember moments"), new String("Always forgive your enemies. Nothing annoys them more"));
        System.out.println(user4.getUserId());
        System.out.println(user4.getId());
        System.out.println(user4.getBody());
        System.out.println(user4.getTitle());

        user4.setId(new BigDecimal("6"));
        System.out.println(user4.getBody());


        Exercise2 user5 = new Exercise2(new BigDecimal("54"), new BigDecimal("5"), new String("Knowledge is power."), new String("Love all, trust a few, do wrong to none."));
        System.out.println(user5.getUserId());
        System.out.println(user5.getId());
        System.out.println(user5.getBody());
        System.out.println(user5.getTitle());

        user5.setBody(new String("I’ll think about it tomorrow"));
        System.out.println(user5.getBody());*/

        Exercise3 post1 = new Exercise3(new BigDecimal("40"), new BigDecimal("1"), new String("Maria"), new String("masha@mail.com"), new String("Remember who you are"));
        System.out.println(post1.getId());
        System.out.println(post1.getPostId());
        System.out.println(post1.getBody());
        System.out.println(post1.getName());
        System.out.println(post1.getEmail());

        post1.setBody(new String("Life is a series of choices."));
        System.out.println(post1.getBody());

        Exercise3 post2 = new Exercise3(new BigDecimal("10"), new BigDecimal("2"), new String("Nadiia"), new String("nadia@mail.com"), new String("Love  is a  friendship  set  to  music."));
        System.out.println(post2.getId());
        System.out.println(post2.getPostId());
        System.out.println(post2.getBody());
        System.out.println(post2.getName());
        System.out.println(post2.getEmail());

        post2.setEmail(new String("nadiaSribna@mail.com"));
        System.out.println(post2.getEmail());

        Exercise3 post3 = new Exercise3(new BigDecimal("81"), new BigDecimal("3"), new String("Olga"), new String("ola@mail.com"), new String("Money often costs too much"));
        System.out.println(post3.getId());
        System.out.println(post3.getPostId());
        System.out.println(post3.getBody());
        System.out.println(post3.getName());
        System.out.println(post3.getEmail());

        post3.setPostId(new BigDecimal("21"));
        System.out.println(post3.getPostId());

        Exercise3 post4 = new Exercise3(new BigDecimal("17"), new BigDecimal("4"), new String("Maryna"), new String("mary@mail.com"), new String("Enjoy every moment"));
        System.out.println(post4.getId());
        System.out.println(post4.getPostId());
        System.out.println(post4.getBody());
        System.out.println(post4.getName());
        System.out.println(post4.getEmail());

        post4.setName(new String("Mary"));
        System.out.println(post4.getName());

        Exercise3 post5 = new Exercise3(new BigDecimal("21"), new BigDecimal("5"), new String("Nastya"), new String("nasty@mail.com"), new String("Never look back"));
        System.out.println(post5.getId());
        System.out.println(post5.getPostId());
        System.out.println(post5.getBody());
        System.out.println(post5.getName());
        System.out.println(post5.getEmail());

        post5.setBody(new String("Your time is limited, so don’t waste it living someone else’s life"));
        System.out.println(post5.getBody());
    }
}
