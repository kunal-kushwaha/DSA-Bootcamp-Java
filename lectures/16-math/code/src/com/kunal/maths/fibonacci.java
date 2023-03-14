public static void main(String[] args) {
  //example value  
  int index = 6; 

    if (index < 0) {
        System.out.println(-1);
    }
    else if (index == 0) {
        System.out.println(0);
    }
    else if (index == 1) {
        System.out.println(1);
    }
    else {
        System.out.println(ft_fibonacci(index));
    }
}

public static int ft_fibonacci(int index) {
    if (index < 0) {
        return -1;
    }
    else if (index == 0) {
        return 0;
    }
    else if (index == 1) {
        return 1;
    }
    else {
        return ft_fibonacci(index - 2) + ft_fibonacci(index - 1);
    }
}
