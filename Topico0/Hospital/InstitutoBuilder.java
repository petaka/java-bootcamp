package Hospital;

public class InstitutoBuilder implements HospitalBuilder {

	
	private Hospital hospital;
	
	public InstitutoBuilder(){
		hospital = new Hospital();
	}
	
	@Override
	public void buildNombre() {
		// TODO Auto-generated method stub
		hospital.setNombre("Instituto Privado");
	}

	@Override
	public void buildCantidadHabitaciones() {
		// TODO Auto-generated method stub
		hospital.setCantidadHabitaciones(15);
	}

	@Override
	public void buildCantidadPisos() {
		// TODO Auto-generated method stub
		hospital.setCantidadPisos(4);
	}

	@Override
	public Hospital getHospital() {
		// TODO Auto-generated method stub
		return hospital;
	}
	

}
