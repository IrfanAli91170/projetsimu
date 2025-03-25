package fr.vedecom.projetsimu.service;

import fr.vedecom.projetsimu.dao.VehicleDAO;

import fr.vedecom.projetsimu.domaine.Vehicle;



public class VehicleService {
	
    private VehicleDAO vehicledao = new VehicleDAO();	
		

    public void creerNvVehicule(Vehicle vec) {
    	vehicledao.createVehicle(vec); 
        System.out.println("Nouveau vehicule cree : " + vec);
    }
	
    

    public Vehicle lireVehicule(String marque) {
        Vehicle vehicle = vehicledao.getVehicle(marque); 
        System.out.println("Vehicule trouve : " + vehicle);
        return vehicle;
    }
	
    
	
 
    public void mettreajourVehicule(Vehicle vec) {
    	vehicledao.updateVehicle(vec); 
        System.out.println("Mise a jour effectuee pour : " + vec);
    }
    
    

    public void supprimerVehicule(Vehicle vec) {
    	vehicledao.deleteVehicle(vec); 
        System.out.println("Suppression effectuee pour : " + vec);
    }
    
    
    public void voirtousVehicules() {
    	vehicledao.getAllVehicles(); 
    }
	
    
    
    public boolean comparerVehicules(Vehicle vec1, Vehicle vec2) {
    	if (vec1.getPrix() > vec2.getPrix()) {
            System.out.println("Le vehicle 1 est plus cher.");
            return true;
        } else {
            System.out.println("Le vehicle 2 est plus cher.");
            return false;
        }
    }

}



