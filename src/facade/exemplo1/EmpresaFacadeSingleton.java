package facade.exemplo1;

public class EmpresaFacadeSingleton {

	private static EmpresaFacade instancia;

	public EmpresaFacade getIntancia() {
		if (instancia == null)
			instancia = new EmpresaFacade();
		return instancia;
	}

}
