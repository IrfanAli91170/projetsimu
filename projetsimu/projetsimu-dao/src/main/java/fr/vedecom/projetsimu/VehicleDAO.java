package fr.vedecom.projetsimu.dao;

import fr.vedecom.projetsimu.domaine.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleDAO {
	
	
	public VehicleDAO() {
		super();
	}

	private List<Vehicle> vehicleList = new ArrayList<>();
	
    public void createVehicle(Vehicle vec) {
    	vehicleList.add(vec);
    }
	
    
    public Vehicle getVehicle(String marque) {
        for (Vehicle vec : vehicleList) {
            if (vec.getMarque().equals(marque)) {
                return vec;
            }
        }
        return null;
    }
	
    
	 
    public void updateVehicle(Vehicle vec) {
    	if (vehicleList.contains(vec)) {
            vehicleList.set(vehicleList.indexOf(vec), vec);
        } else {
        	
        }
    }
    
    
	
    public void deleteVehicle(Vehicle vec) {
        if (vehicleList.remove(vec)) {
        	
        } else {

        }
    }
	
    
    public List<Vehicle> getAllVehicles() {
    	System.out.println("Voici la liste de tous les vehicules presents :");
    	for (Vehicle vehicule : vehicleList) {
    	    System.out.println("Marque: " + vehicule.getMarque() + ", Prix: " + vehicule.getPrix());
    	}
        return new ArrayList<>(vehicleList);
    }
					  

}











