package br.com.sistemapizzaria.dao;

public class LoginDao {

	private String user;
	private String password;

	public LoginDao() {

	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getUser() {
		return user;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public boolean logar(String username, String password) {
		this.user = username;
		this.password = password;

		if (getUser().equalsIgnoreCase(getUser()) && getPassword().equalsIgnoreCase(getPassword())) {

			System.out.println("Usuário Logado");
			return true;

		} else {
			System.out.println("USUÁRIO NÃO LOGOU");
			return false;

		}

	}

}
