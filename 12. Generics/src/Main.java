public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer Gea = new SoccerPlayer("Gea");

        //Add players to the team
        Team<SoccerPlayer> chelsea = new Team<>("Chelsea");
//        chelsea.addPlayer(joe);
//        chelsea.addPlayer(pat);
        chelsea.addPlayer(Gea);
        chelsea.addPlayer(Gea);
        System.out.println(chelsea.numPlayers());

        Team<BaseballPlayer> chicagoTeam = new Team<>("chicagoTeam");
        chicagoTeam.addPlayer(pat);
        System.out.println(chicagoTeam.numPlayers());

        Team<FootballPlayer> nintendoTeam = new Team<>("nintendoTeam");
        nintendoTeam.addPlayer(joe);
        System.out.println(nintendoTeam.numPlayers());

        Team<FootballPlayer> Leeds = new Team<>("Leeds");
        Team<FootballPlayer> Liverpool = new Team<>("Liverpool");

        Leeds.matchResults(Liverpool, 2, 5);
        Leeds.matchResults(nintendoTeam, 2, 3);

        Liverpool.matchResults(Leeds, 4, 2);
        Liverpool.matchResults(nintendoTeam, 5, 3);

//        Show Football teams Rankings
        System.out.println("Football Teams Rankings");
        System.out.println(Leeds.getName() + ": " + Leeds.ranking());
        System.out.println(Liverpool.getName() + ": " + Liverpool.ranking());
        System.out.println(nintendoTeam.getName() + ": " + nintendoTeam.ranking());
    }
}
