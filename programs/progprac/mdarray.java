package programs.progprac;
class mdarray 
{
    public static void main(String [] args)
    {
        int [][] grid = {{3,5,7},{2,4,6,},{10,20,30}};
       // System.out.println(grid[0][0]);
        String [][] grids= {{"hello", "hello world"},{"ayush","srivastava"},{"school","education"}};
       System.out.println(grids[2][0]);
       // System.out.println(grid.length);
        for(int row=0;row<grid.length;row++)
        {
            for(int col=0;col<grid[row].length;col++)
             {
                 //System.out.print(grid[row][col]+"\t");

             }
             //System.out.println();  
        }
        String [][] word = new String[2][];
       // System.out.println(word[0]);
        word[0] = new String[3];
        word[0][1] = "hi there";
        System.out.println(word[0][0]);
    }
}