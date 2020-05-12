package ex;

	public class ClassMember {

	       

        String[]  members = {

                       "고은아","권재준","김보겸","김승연","김혜림","남영준", 

                       "박명훈","박성민","박진명","박현정","박혜미","송가람", 

                       "안정민","양미선","양창일","원윤경","이민수","이혜진", 

                       "임재영","임재영","장윤원","정신우","지용욱","홍세영"

        };

       

        String[][]  place = new String[6][4];

       

        void shuffle(int cnt) {

              

               String temp = "";

               int index=0;

              

               for(int i=0; i<cnt;i++) {

                       index =(int) (Math.random()*members.length);

                       temp = members[0];

                       members[0]=members[index];

                       members[index]=temp;                 

               }

        }

       

        void setPlace() {

       

               for(int i=0; i<place.length; i++) {

                      

                       for(int j=0; j<place[i].length; j++) {

                              place[i][j] = members[((i*4)+j)];

                       }

                      

               }

        }

       

        void printPlace() throws InterruptedException {

              

               for(int i=0; i<place.length; i++) {

                      

                       for(int j=0; j<place[i].length; j++) {

                              Thread.sleep(2000);

                              System.out.print(" " + place[i][j] + " ");

                       }

                      

                       if(i==2 || i==4) {

                              System.out.print("\t");

                       }else {

                              System.out.println();

                       }

                      

               }

        }

       

        public static void main(String[] args) throws InterruptedException {

              

               ClassMember member = new ClassMember();

              

               member.shuffle(100000);

               member.setPlace();

               member.printPlace();

              

        }      

 

}


