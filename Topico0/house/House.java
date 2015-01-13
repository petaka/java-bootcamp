package house;


	
	public class House {

		private String direccion;
		private double superficie;
		private int cantidadAmbientes;
		private float precioAlquiler;

		public House(String direccion, double superficie, int cantidadAmbientes, float precioAlquiler) {
			this.direccion = direccion;
			this.superficie = superficie;
			this.cantidadAmbientes = cantidadAmbientes;
			this.precioAlquiler = precioAlquiler;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public double getSuperficie() {
			return superficie;
		}

		public void setSuperficie(double superficie) {
			this.superficie = superficie;
		}

		public int getCantidadAmbientes() {
			return cantidadAmbientes;
		}

		public void setCantidadAmbientes(int cantidadAmbientes) {
			this.cantidadAmbientes = cantidadAmbientes;
		}

		public float getPrecioAlquiler() {
			return precioAlquiler;
		}

		public void setPrecioAlquiler(float precioAlquiler) {
			this.precioAlquiler = precioAlquiler;
		}

		@Override
		public String toString() {
			return "House [direccion=" + direccion + ", superficie=" + superficie + " metros cuadrados " + ", cantidad de Ambientes="
					+ cantidadAmbientes + ", Alquiler mensual=" + precioAlquiler + "]";
		}

	}


