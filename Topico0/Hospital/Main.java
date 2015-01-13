package Hospital;

public class Main {

	public static void main(String[] args) {

		HospitalBuilder hospitalBuilder = new ClinicaBuilder();
		HospitalDirector hospitalDirector = new HospitalDirector(hospitalBuilder);
		
		hospitalDirector.constructHospital();
		Hospital hospital = hospitalDirector.getHospital();
		System.out.println(hospital);
		
		hospitalBuilder = new InstitutoBuilder();
		hospitalDirector = new HospitalDirector(hospitalBuilder);
		hospitalDirector.constructHospital();
		hospital = hospitalDirector.getHospital();
		System.out.println(hospital);
	}

}
