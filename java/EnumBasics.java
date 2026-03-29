class EnumBasics
{
    enum Season
    {
        SPRING,
        SUMMER,
        FALL,
        WINTER,
    }

    public static void main(String[] args)
    {
        Season currentSeason = Season.SPRING;
        System.out.println("Current season: " + currentSeason);

        // === Beyond Normal Usage ===
        // Assign/cast an integer value outside the defined enum range and attempt to use it.

        try
        {
            Season season = (Season) 1;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        // Compile-time error!
        // java: incompatible types: int cannot be converted to EnumBasics.Season
    }
}