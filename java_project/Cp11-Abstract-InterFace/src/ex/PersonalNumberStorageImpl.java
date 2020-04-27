package ex;
//public class PersonalNumberStorageImpl extends PersonalNumberstorage
public class PersonalNumberStorageImpl implements PersonalNumber {
	
	
	PersonalNumInfo [] perArr;
	int numOfPerInfo;
	
	PersonalNumberStorageImpl(int num){
		perArr = new PersonalNumInfo[num];
		numOfPerInfo =0;
	}
	
	
	
	

	@Override
	public void addPersnalInfo(String perNum, String name) {
		// TODO Auto-generated method stub
		perArr[numOfPerInfo] = new PersonalNumInfo(name, perNum);
		numOfPerInfo++;

	}

	@Override
	public String searchName(String perNum) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<numOfPerInfo; i++) {
			if(perArr[i].gerNumber().equals(perNum)) {
				return perArr[i].getName();
			}
			
		}
		return null;
	}

}
