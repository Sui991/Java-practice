
package homework;


public class P8_3 {

   
    public static void main(String[] args) {
        int stu[]=new int [8];
        int score[]=new int[8];
        
     char [][] ans={
             {'A','B','A','C','C','D','E','E','A','D'},
             {'D','B','A','B','C','A','E','E','A','D'},
             {'E','D','D','A','C','B','E','E','A','D'},
             {'C','B','A','E','D','C','E','E','A','D'},
             {'A','B','D','C','C','D','E','E','A','D'},
             {'B','B','E','C','C','D','E','E','A','D'},
             {'B','B','A','C','C','D','E','E','A','D'},
             {'E','B','E','C','C','D','E','E','A','D'}}; 
     char []keys={'D','B','D','C','C','D','A','E','A','D'};
    for (int i=0;i<ans.length;i++)
    {
        int correctCount=0;
        for (int j=0;j<ans[i].length;j++)
        {
            if (ans[i][j]==keys[j])
                correctCount+=1;
        }
      stu[i]=i;
      score[i]=correctCount;
//       System.out.println("Student"+i+"'s correct count is "+correctCount);
    }
     int temp;
        int name;
        for (int i=0;i<score.length-1;i++)
     {
            for (int j=0;j<score.length-1-i;j++)
            {
                if (score[j]<score[j+1]    )
                {
                    name=stu[j];
                    stu[j]=stu[j+1];
                    stu[j+1]=name;
                    temp=score[j];
                    score[j]=score[j+1];
                    score[j+1]=temp;
                }
            }
             } 
            for (int j=0;j<stu.length;j++)
        {
            System.out.println("Student"+stu[j]+"'s correct count is "+score[j]);
        }
      
}
   
    }

