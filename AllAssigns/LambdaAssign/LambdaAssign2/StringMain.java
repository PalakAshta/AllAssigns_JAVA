package LambdaAssign2;

public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using lambda function
        fomatable form=(String s)->{
        	String str="";
        	for(int i=0;i<s.length();i++) {
        		str+=s.charAt(i);
        		str+=" ";
        	}
        	return str;
        };
        System.out.println(form.formatString("Palak"));
        AddSpace func=new AddSpace();
        fomatable form2 = func::addspace;
        System.out.println(form2.formatString("Mehak"));
        
	}

}
