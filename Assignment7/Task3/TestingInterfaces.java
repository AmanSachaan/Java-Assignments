package Assignment7.Task3;

public class TestingInterfaces
{

    public static void printCenturies(Batsmen batsmen)
    {
        batsmen.printCenturies();
    }
    public static void printWickets(Bowler bowler)
    {
        bowler.printWickets();
    }
    public static void printNoOfCatches(Fielder fielder)
    {
        fielder.printNoOfCatches();
    }
    public static void printTeamName(Cricketer cricketer)
    {
        cricketer.printTeamName();
    }
    public static void main(String[] args)
    {
        Allrounder allrounder=new Allrounder();
        printCenturies(allrounder);
        printWickets(allrounder);
        printNoOfCatches(allrounder);
        printTeamName(allrounder);
    }
}