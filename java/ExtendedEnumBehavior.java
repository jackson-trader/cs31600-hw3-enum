class ExtendedEnumBehavior
{
    enum Planet
    {
        MERCURY(3.7),
        VENUS(8.87),
        EARTH(9.81),
        MARS(3.71),
        JUPITER(24.79),
        SATURN(10.44),
        URANUS(8.69),
        NEPTUNE(11.15),
        ;

        private final double gravity;

        // Constructor
        Planet(double gravity)
        {
            this.gravity = gravity;
        }

        // Getter
        public double getGravity()
        {
            return gravity;
        }
    }

    public static void main(String[] args) {
        Planet planet = Planet.EARTH;
        System.out.println(planet + " has a surface gravity of " + planet.getGravity() + " m/s^2.");

        // === Beyond Normal Usage ===
        // Invoke a method or access associated data on a null or uninitialized enum variable.

        // Here I am invoking a method (getGravity) on a null enum variable.
        Planet nullPlanet = null;
        try
        {
            System.out.println(nullPlanet.getGravity());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        // Run-time error!
        // java.lang.NullPointerException: Cannot invoke "ExtendedEnumBehavior$Planet.getGravity()" because "<local2>" is null
        // Method invocation 'getGravity' will produce 'NullPointerException'
    }
}