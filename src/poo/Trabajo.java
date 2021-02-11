package poo;

public class Trabajo {

	public static void main(String[] args) {
		
		Empleado worker = new Empleado("Carmen", "Castro Román", 20000000, 0, 0);
		
		System.out.println("La candidata se llama " + worker.getNombre()  + " " 
		+ worker.getApellido() + " ha entregado: " 
		+ worker.curriculumsEntregados + " curriculums, tiene una experiencia de " 
		+ worker.anhosExperiencia + " años"
		+ " y la han llamado para " + worker.entrevistasRealizadas 
		+ " entrevistas de trabajo");

	}
}

	 class Empleado{
		 
		 final String nombre;
		 final String apellido;
		 int curriculumsEntregados;
		 int anhosExperiencia;
		 int entrevistasRealizadas;
		 
		 
		 public Empleado (String nombre, String apellido, int curriculumsEntregados, int anhosExperiencia, int entrevistasRealizadas) {
			 this.nombre = nombre;
			 this.apellido = apellido;
			 this.curriculumsEntregados = curriculumsEntregados;
			 this.anhosExperiencia = anhosExperiencia;
			 this.entrevistasRealizadas = entrevistasRealizadas;
			 
		 }


		public String getNombre() {
			return nombre;
		}
		

		public String getApellido() {
			return apellido;
		}


		public int getCurriculumsEntregados() {
			return curriculumsEntregados;
		}
		
		public int getAnhosExperiencia() {
			return anhosExperiencia;
		}
		
		public int getEntrevistasRealizadas() {
			return entrevistasRealizadas;
		}
	}
