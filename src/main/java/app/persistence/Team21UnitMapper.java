package app.persistence;

public class Team21UnitMapper {
    public static double convert(double value, String unitType){
        if (unitType.equals("km-to-mi")){
            return value * 0.621371;
        } else if (unitType.equals("mi-to-km")) {
            return value / 0.621371;
        } else if (unitType.equals("km-to-ff")) {
            return value / 0.110;
        } else if (unitType.equals("ff-to-km")){
            return value * 0.11;
        }
        return 0;
    }
}
