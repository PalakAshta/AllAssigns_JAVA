package LambdaAssignUserPass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IUserPass val=(uname,pass)->{
			String user="Palak";
			String pwd="Palak@123";
			if(uname.equals(user) && pwd.equals(pass))
				return true;
			return false;
		};
		System.out.println(val.validate("Palak", "Palak456"));

	}

}
