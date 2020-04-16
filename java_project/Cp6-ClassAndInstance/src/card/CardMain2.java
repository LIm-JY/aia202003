package card;

public class CardMain2 {

	public static void main(String[] args) {
			

		for(int i=0;i<4;i++) {
			for (int j=1;j<13;j++) {
				String kind = "";
				
			
				switch (i) {
				case 0:
					kind="Spade";
					break;
				case 1:
					kind="Clover";
					break;
				case 2:
					kind="Heart";
					break;
				case 3:
					kind="Diamond";
					break;
				}
				Card c = new Card();
				c.kind =kind;
				c.number =j;
				
				System.out.println("높이"+Card.height+"or"+Card.width+"종류"+kind);
			}
		}


	}

}
