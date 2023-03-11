package org.com;
class Adharrcard
{
private long adharnum;
private int age;
private long phoneNum;
Adharrcard(long adharnum,int age,long phoneNum)
{
this.adharnum=adharnum;
this.age=age;
this.phoneNum=phoneNum;

}
public long getAdnum()
{
System.out.println("send otp");
System.out.println("validate otp");
System.out.println("otp matched and sussfull");
return adharnum;
}
public int getAge()
{
System.out.println("send otp");
System.out.println("validate otp");
System.out.println("otp matched and sussfull");
return age;

}
public long getphnum()
{
System.out.println("send otp");
System.out.println("validate otp");
System.out.println("otp matched and sussfull");
return phoneNum;
}


public void setAdnum(long adharnum) //ad=234465676454
{
System.out.println("generate otp");
System.out.println("validate otp");
System.out.println("otp validation sussfull");
this.adharnum=adharnum;
}
public void setAge(int age)
{
System.out.println("generate otp");
System.out.println("validate otp");
System.out.println("otp validation sussfull");
this.age=age;
}
public void setPhnum(long phoneNum)
{
System.out.println("generate otp");
System.out.println("validate otp");
System.out.println("otp validation sussfull");
this.phoneNum=phoneNum;
}
}
public class Q_56_Encapsulation {

	public static void main(String[] args) 
	{
		Adharrcard ref1= new Adharrcard(746484474746L,23,9487585784L);
		long rf=ref1.getAdnum();
		System.out.println(rf);
		ref1.setAdnum(234465676454L);
		long ro=ref1.getAdnum();
		System.out.println(ro);

	}

}

