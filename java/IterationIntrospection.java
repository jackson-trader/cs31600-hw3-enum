class IterationIntrospection
{
   enum Planet
   {
      MERCURY(3.7),
      VENUS(8.87),
      EARTH(9.81),
      MARS(9.81), // Not actually 9.81, it's 3.71, but this is just for the Beyond Normal Usage
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

   public static void main(String[] args)
   {
      for (Planet planet : Planet.values())
      {
         System.out.println(planet + " has a surface gravity of " + planet.getGravity() + " m/s^2.");
      }
      System.out.println();

      // === Beyond Normal Usage ===
      // Assign/cast the same integer to two enum values by name. Then iterate over all values and record exactly what appears.
      // Are both names listed, or does the langauge treat them as one? Does the language allow this at all, and if not, what error does it produce?

      for (Planet planet : Planet.values())
      {
         System.out.println(planet + ": " + planet.getGravity());
      }

      // No error, Java does allow this to happen.
      // Both enum names (EARTH & MARS) are listed with same value (9.81).
      // Two enums can have the same value, and they won't be treated as one (in Java).
   }
}