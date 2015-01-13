package Hospital;

public class ClinicaBuilder implements HospitalBuilder{

	

		private Hospital hospital;

		public ClinicaBuilder(){
			hospital = new Hospital();
		}
		@Override
		public void buildNombre() {
			// TODO Auto-generated method stub
			hospital.setNombre("Clinica Materna");
		}

		@Override
		public void buildCantidadHabitaciones() {
			// TODO Auto-generated method stub
			hospital.setCantidadHabitaciones(25);
		}

		@Override
		public void buildCantidadPisos() {
			// TODO Auto-generated method stub
			hospital.setCantidadPisos(3);
		}

		@Override
		public Hospital getHospital() {
			// TODO Auto-generated method stub
			return hospital;
		}
		
		
	}

