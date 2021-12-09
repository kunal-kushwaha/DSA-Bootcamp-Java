class Solution {
    public void setZeroes(int[][] matrix)
    {
        ArrayList<Integer> store1= new ArrayList<>();
        ArrayList<Integer> store2= new ArrayList<>();

        for(int i=0;i< matrix.length;i++)
        {
            for (int j=0;j< matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    store1.add(i);
                    store2.add(j);
                }
            }
        }
        int size1=store1.size();
        int size2=store2.size();
        int c1=0,c2=0;
        for(int i=0;i<matrix.length;i++)
        {
            c1=0;
            c2=0;
            for (int j=0;j< matrix[0].length;j++)
            {
                if(c1<size1 && store1.get(c1)==i)
                {
                    matrix[i][j]=0;
                }
                if(c2<size2 && store2.get(c2)==j)
                {
                    matrix[i][j]=0;
                    c2++;
                }
            }
        }
    }
}
