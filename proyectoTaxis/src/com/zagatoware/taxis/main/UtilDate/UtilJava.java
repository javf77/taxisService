package mx.edu.upemor.icalendar.util.fecha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class UtilFechas {

	public static Date iCaltoString (String str) throws ParseException
	
	{	
		System.out.println ("Cadena de fecha "+str);
		String arr[] = str.split("T");
		for (int i = 0;i<arr.length;i++)
		{
			System.out.println ("["+i+"]="+arr[i]);
		}
		String hr = arr[0]+arr[1].substring(0,arr[1].length()-1);
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMddhhmmss");
		Date parseDate = dateformat.parse (hr);
		return parseDate;
		
	}
	public static String StrFechaFormat (Date fecha)
	{
		SimpleDateFormat otroFormato = new SimpleDateFormat ("dd/MM/yyyy hh:mm:ss");
		
		return otroFormato.format(fecha);
	}
	public static String dateToTimeStamp (Date fecha)
	{
		SimpleDateFormat otroFormato = new SimpleDateFormat ("YYYY-MM-dd HH:mm:ss");
		
		return otroFormato.format(fecha);
	}
	public static String dateToTimeStamp2 (Date fecha)
	{
		SimpleDateFormat otroFormato = new SimpleDateFormat ("YYYY-MM-dd");
		
		return otroFormato.format(fecha);
	}
	public static String strtoICal (Date fecha)
	{
		SimpleDateFormat parte1 = new SimpleDateFormat("yyyyMMdd"), parte2= new SimpleDateFormat("HHmmss");
		return parte1.format(fecha)+"T"+parte2.format(fecha)+"Z";
		
	}
	public static int dia (Date fecha){
		SimpleDateFormat parte1 = new SimpleDateFormat("dd");
		return Integer.parseInt(parte1.format(fecha));
		
	}
	public static int mes (Date fecha){
		SimpleDateFormat parte1 = new SimpleDateFormat("MM");
		return Integer.parseInt(parte1.format(fecha));
		
	}
	public static int anno (Date fecha){
		SimpleDateFormat parte1 = new SimpleDateFormat("yyyy");
		return Integer.parseInt(parte1.format(fecha));
		
	}
	public static Date strToDate (String strFecha) throws ParseException
	{
		SimpleDateFormat parte1 = new SimpleDateFormat("dd/MM/yyyy");
		return parte1.parse(strFecha);
	}
	public static Date strToDateHr (String strFecha) throws ParseException
	{
		SimpleDateFormat parte1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return parte1.parse(strFecha);
	}
	public static int dayOfWeek (Date fecha)
	{
		Calendar c = Calendar.getInstance();
		
		c.setTime(fecha);
		return c.get(Calendar.DAY_OF_WEEK);
	}
	public static int numeroDiasPosMes (Date fecha)
	{
		Calendar c= Calendar.getInstance();
		c.setTime(fecha);
		return c.getActualMaximum(Calendar.DAY_OF_MONTH);
	}
	public static Date getPrimerDiaDelMes() {
        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(Calendar.YEAR), 
                cal.get(Calendar.MONTH),
                cal.getActualMinimum(Calendar.DAY_OF_MONTH),
                cal.getMinimum(Calendar.HOUR_OF_DAY),
                cal.getMinimum(Calendar.MINUTE),
                cal.getMinimum(Calendar.SECOND));
        return cal.getTime();
    }

    public static Date getUltimoDiaDelMes() {
        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH),
                cal.getActualMaximum(Calendar.DAY_OF_MONTH),
                cal.getMaximum(Calendar.HOUR_OF_DAY),
                cal.getMaximum(Calendar.MINUTE),
                cal.getMaximum(Calendar.SECOND));
        return cal.getTime();
    }
    public static int diaActual ()
    {
    	GregorianCalendar cal = new GregorianCalendar();
    	return  cal.get(GregorianCalendar.DAY_OF_MONTH); 
    }
    public static int mesActual ()
    {
    	GregorianCalendar cal = new GregorianCalendar();
    	return  cal.get(GregorianCalendar.MONTH);
    }
    public static int annoActual ()
    {
    	GregorianCalendar cal = new GregorianCalendar();
    	return  cal.get(GregorianCalendar.YEAR);
    }
    public static String dateToHr (Date fecha)
	{
		SimpleDateFormat otroFormato = new SimpleDateFormat ("HH:mm:ss");
		
		return otroFormato.format(fecha);
	}
}