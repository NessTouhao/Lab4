public class Main {
    public static void main(String[] args) {
        Season Lovely = Season.summer;
        System.out.println(Lovely);
        lovelySeason(Lovely);
        for (Season season: Season.values())
        {
            System.out.println(season + " " + season.getTemp() + " " + season.getDescription());
        }
    }
    private static void  lovelySeason(Season lovely)
    {
        String output = "Я люблю ";
        switch (lovely)
        {
            case winter:
                output += "зиму";
                break;
            case spring:
                output += "весну";
                break;
            case summer:
                output += "лето";
                break;
            case fall:
                output += "осень";
                break;
        }
        System.out.println(output);
    }
}
