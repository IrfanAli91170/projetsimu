package fr.vedecom.projetsimu.presentation;

import fr.vedecom.projetsimu.service.VehicleService;

import fr.vedecom.projetsimu.domaine.Vehicle;

public class MonApplication {

	public static void main(String[] args) {


		VehicleService service = new VehicleService();

		
        Vehicle vehicule1 = new Vehicle(17000, "Peugeot");
        service.creerNvVehicule(vehicule1);
        
        
        Vehicle vehicule2 = new Vehicle(23000, "Ford");
        service.creerNvVehicule(vehicule2);
        
        
        service.lireVehicule("Ford");


        vehicule1.setMarque("Mustang");
        vehicule1.setPrix(30000);
        service.mettreajourVehicule(vehicule1);
        

        boolean costCheck = service.comparerVehicules(vehicule1, vehicule2);
        System.out.println("Le vehicule 1 est plus cher " + costCheck);
        

        
        service.voirtousVehicules();
    }

}

