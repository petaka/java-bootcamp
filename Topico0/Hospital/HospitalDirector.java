package Hospital;

public class HospitalDirector {

	private HospitalBuilder hospitalBuilder = null;
	
public HospitalDirector (HospitalBuilder hospitalBuilder){
	this.hospitalBuilder = hospitalBuilder;
}
public void constructHospital(){
	hospitalBuilder.buildNombre();
	hospitalBuilder.buildCantidadHabitaciones();
	hospitalBuilder.buildCantidadPisos();
}
public Hospital getHospital(){
	return hospitalBuilder.getHospital();
}
}
