public class NoofDays {
    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            if (year % 4 == 0 && year % 100 != 0){
                return true;
            }else if (year % 4 == 0 && year%100 ==0 && year %400 ==0){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
        //return 0;
    }
    public static int getDaysInMonth(int month, int year){
        if(year >= 1 && year <= 9999 && month>0 && month <=12) {
            if (month == 2 || month == 4 || month == 6 || month == 9 || month == 11) {
                if (month == 2) {
                    if (isLeapYear(year) == true) {
                        return 29;
                    } else {
                        return 28;
                    }
                } else {
                    return 30;
                }
            } else {
                return 31;
            }
        }else {
            return -1;
        }
    }

    public static void main(String[] args){
        System.out.println(isLeapYear(2018) +" "+ getDaysInMonth(22,2020));

    }

}




