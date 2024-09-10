/*LeapYearVerifier.java */

class LeapYearVerifier{
    public static void main( String [] args){
        int[][] yearsCollections = {
            {2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, 2048, 1900, 2100, 2200, 2300, 2400, 2500, 2600, 2700, 2800, 2900, 3000},
            {45, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500, 1582, 1600, 1700, 1800, 1900}
        };
        for(int[] years : yearsCollections){

            for(int year : years){
                String checker = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))? " is a leap year." : " is not a leap year";
                System.out.println(year + checker);
            }
        }
    }
}