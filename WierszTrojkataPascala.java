public class WierszTrojkataPascala extends WierzTrojkataPascalaLib//Lepiej tak nie robić jak używa go 1:1 to lepiej nie uzywac extends
{
    int a;
    public WierszTrojkataPascala(int n) throws MyException
    {
        a = n;
        generateTab(n);
    }

    long wspolczynnik(int m) throws MyException
    {
        if(m < 0 || m >= a)
            throw new MyException(m + " - invalid range");
            return tab[m];  
    }
}
