// Base Class
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "no plot here";
    }

    public String getName() {
        return name;
    }
}

// Child class 1
class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A Shark eats lots of people";
    }
}

// Child class 2
class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

// Child class 3
class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Teenagers try to escape a maze";
    }
}

// Child class 4
class HotelRwanda extends Movie {
    public HotelRwanda() {
        super("Hotel Rwanda");
    }

    @Override
    public String plot() {
        return "A hotel that survives during a coup in Rwanda";
    }
}

// Child class 5
class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    //NO plot method
}

// Main method
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <11 ; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                                " : " + movie.getName() + "\n" +
                                "plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        int randNumber = (int) (Math.random() * 5) + 1;
        System.out.println("The random number generated was : " + randNumber);
        switch (randNumber){
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new HotelRwanda();

            case 5:
                return new Forgetable();
        }
        return null;
    }
}
