package static_vs_nonstatic;


import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateUtil {

    final  String TARGET_DATE_PATTERN = "MM/dd/yyyy";

    public String getFormattedDate(Date d){
        SimpleDateFormat sdf = new SimpleDateFormat(TARGET_DATE_PATTERN);
        return sdf.format(d);
    }



}
