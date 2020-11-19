package HomeWork5;

public class prov1 {
    public static void main(String[] args) {
        System.out.println("Пассажирский автомобиль");
        Passenger Car = new Passenger(1000, 50, 5000, "Audi", 4, 5, "cupe", 4);
        Car.allOptions();

        Car.distance( Car.maxSpeed);
        System.out.println();
        System.out.println("Грузовой автомобиль");

        Cargo CarCargo = new Cargo(1000,50,2000,"Mercedes", 4,10,2000);
        CarCargo.allOptions();

        CarCargo.carMass(CarCargo.carrying);
        CivilAirTr Airplane = new CivilAirTr(5000,800,3000,"Boing 744",15, 300, 20, false );

        System.out.println("Гражданский самолет");

        Airplane.allOptions();
        Airplane.airPass(Airplane.numPass);

        System.out.println("Военный самолет");

        MilitaryAirTr Air = new MilitaryAirTr(10000, 2000,6000,"Splinter",30,100,true, 5);
        Air.allOptions();
        Air.shooting(Air.numOfRockets);
        Air.ejSys(Air.ejectionSys);


    }
}
