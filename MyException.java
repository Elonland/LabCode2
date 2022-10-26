public class MyException extends Exception//Nie musi miec cpp jesli jest maly
{
	String str1;
    public MyException(String msg)
    {
        str1 = msg;
    }
    public String toString()
    {
    	return(str1);
    }
}
