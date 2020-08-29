package Excel;

public class ExcelMainClass {

	public static void main(String[] args) {
		String projectpath=System.getProperty("user.dir");
		ExcelTest a=new ExcelTest(projectpath+"/excel/mydata.xlsx", "Sheet1");
		a.getRows();
		a.getNumericValue(1,1);
		a.getStringValue(1,0);
	}

}
