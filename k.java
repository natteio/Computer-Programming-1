// Pascal Triangle

private void recursion (int x, int j){
        if (x<0){
            return;
        }
        int k;
        for (k=0;k<j;k++)
            System.out.print(" ");

        for (k=0;k<(x*2)-1; k++)
            System.out.print("*");
            System.out.println();
        recursion(x-1, j+1);
    }
    public void declaration (){
        Scanner get = new Scanner (System.in);
        System.out.println("Input Triangle's level: ");
        int x = get.nextInt();

        recursion(x,0);
    }
