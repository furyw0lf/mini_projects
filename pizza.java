import java.util.*;
public class pizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList a1 = new ArrayList<>();
        System.out.println("enter the name of the customer:");
        String a = sc.nextLine();
        System.out.println("enter the mobile number of the customer:");
        String b = sc.nextLine();
        System.out.println("enter the address of the customer");
        String c = sc.nextLine();
        System.out.println("enter the email address of the customer");
        String d = sc.nextLine();
        while (true) {
            if (d.contains("@")) {
                System.out.println("your" + d + " email address is added successfully!!");
            } else {
                System.out.println("you have the undefined email address co check your email address and please try again!!");
                break;
            }
        }
        System.out.println("----------------------");
        System.out.println("welcome tim hortons ");
        System.out.println("------------------------");
        System.out.println("what would like to order?");
        System.out.println("we have the option of veg and non veg");
        String e = sc.nextLine();
        if (e.equals("veg")) {
            System.out.println("what would you like to have in veg?");
            System.out.println("we have the option of");
            System.out.println("veggie deluxe");
            System.out.println("veggie supreme");
            System.out.println("make your option above mentioned ");
            String f = sc.nextLine();
            if (f.equals("veggie deluxe")) {
                System.out.println("nice selection mr" + a + "you have excellent taste bud i must tell you ");
                System.out.println("what would be the size of the pizza you want?");
                System.out.println("make the choice between small\n large\n medium");
                String h = sc.nextLine();
                if (h.equals("small")) {
                    System.out.println("what kind of crust you want to have");
                    System.out.println("we have the option of the thin crust pizza and pan crust pizza");
                    System.out.println("make your choice");
                    String g = sc.nextLine();
                    if (g.equals("thin crust")) {
                        System.out.println("nice choice mr" + a);
                    } else if (g.equals("pan crust")) {
                        System.out.println("nice choice mr" + a);
                    }
                } else if (h.equals("large")) {
                    System.out.println("what kind of crust you want to have");
                    System.out.println("we have the option of the thin crust pizza and pan crust pizza");
                    System.out.println("make your choice");
                    String g = sc.nextLine();
                    if (g.equals("thin crust")) {
                        System.out.println("nice choice mr" + a);
                    } else if (g.equals("pan crust")) {
                        System.out.println("nice choice mr" + a);
                    }
                } else if (h.equals("medium")) {
                    System.out.println("what kind of crust you want to have");
                    System.out.println("we have the option of the thin crust pizza and pan crust pizza");
                    System.out.println("make your choice");
                    String g = sc.nextLine();
                    if (g.equals("thin crust")) {
                        System.out.println("nice choice mr" + a);
                    } else if (g.equals("pan crust")) {
                        System.out.println("nice choice mr" + a);
                    }
                } int cheese=30;
                int ketchup=10;
                int oregano=20;
                int vegetable=40;
                int mushroom=80;
                int olive=90;
                System.out.println("would you like to any add on");
                System.out.println("if yes than press (y) otherwise press (n)");
                String h1 =sc.nextLine();
                if (h1.equals("y")){
                    System.out.println("we have the option of");
                    System.out.println("1 cheese\n2 ketchup\n3 oregano\n4 vegetable\n5 mushroom\n6 olive\n");
                    System.out.println("enter the choice ");
                    int i=sc.nextInt();
                    if (i==1){
                        System.out.println("enter the pack of the cheese you want add");
                        int j=sc.nextInt();
                        int j1=cheese*j;
                        if (j>=1){
                            System.out.println("the price of cheese is "+j1);
                        }
                    } else if (i==2) {
                        System.out.println("enter the pack of ketchup you want to add");
                        int k=sc.nextInt();
                        int k5=ketchup*k;
                        if (k>=1){
                            System.out.println("the price of the ketchup is"+k5);
                        }
                    } else if (i==3) {
                        System.out.println("enter the pack of oregano you want to add");
                        int k1=sc.nextInt();
                        int k6=oregano*k1;
                        if (k1>=1){
                            System.out.println("your price of the oregano is"+k6);
                        }
                    } else if (i==4) {
                        System.out.println("enter the quantity of vegetable you want to add");
                        int k2=sc.nextInt();
                        int k7=vegetable*k2;
                        if(k2>=1){
                            System.out.println("the price of vegetable is "+k7);
                        }
                    } else if (i==5) {
                        System.out.println("enter the quantity of mushroom you want to add");
                        int k3=sc.nextInt();
                        int k8=mushroom*k3;
                        if (k3>=1){
                            System.out.println("the price of the mushroom is"+k8);
                        }
                    } else if (i==6) {
                        System.out.println("enter the quantity of the olive you want to add");
                        int k4=sc.nextInt();
                        int k9=olive*k4;
                        if (k4>=1){
                            System.out.println("your price of olive is"+k9);
                        }
                    }

                }else {
                    System.out.println("thank you for using our service enjoy your meal!!");
                }
            } else if (f.equals("veggie supreme")) {
                System.out.println("nice selection mr" + a + "you have excellent taste bud i must tell you ");
                System.out.println("what would be the size of the pizza you want?");
                System.out.println("make the choice between small\n large\n medium");
                String h = sc.nextLine();
                if (h.equals("small")) {
                    System.out.println("what kind of crust you want to have");
                    System.out.println("we have the option of the thin crust pizza and pan crust pizza");
                    System.out.println("make your choice");
                    String g = sc.nextLine();
                    if (g.equals("thin crust")) {
                        System.out.println("nice choice mr" + a);
                    } else if (g.equals("pan crust")) {
                        System.out.println("nice choice mr" + a);
                    }
                } else if (h.equals("large")) {
                    System.out.println("what kind of crust you want to have");
                    System.out.println("we have the option of the thin crust pizza and pan crust pizza");
                    System.out.println("make your choice");
                    String g = sc.nextLine();
                    if (g.equals("thin crust")) {
                        System.out.println("nice choice mr" + a);
                    } else if (g.equals("pan crust")) {
                        System.out.println("nice choice mr" + a);
                    }
                } else if (h.equals("medium")) {
                    System.out.println("what kind of crust you want to have");
                    System.out.println("we have the option of the thin crust pizza and pan crust pizza");
                    System.out.println("make your choice");
                    String g = sc.nextLine();
                    if (g.equals("thin crust")) {
                        System.out.println("nice choice mr" + a);
                    } else if (g.equals("pan crust")) {
                        System.out.println("nice choice mr" + a);
                    }
                } int cheese=30;
                int ketchup=10;
                int oregano=20;
                int vegetable=40;
                int mushroom=80;
                int olive=90;
                System.out.println("would you like to any add on");
                System.out.println("if yes than press (y) otherwise press (n)");
                String h2 =sc.nextLine();
                if (h2.equals("y")){
                    System.out.println("we have the option of");
                    System.out.println("1 cheese\n2 ketchup\n3 oregano\n4 vegetable\n5 mushroom\n6 olive\n");
                    System.out.println("enter the choice ");
                    int i=sc.nextInt();
                    if (i==1){
                        System.out.println("enter the pack of the cheese you want add");
                        int j=sc.nextInt();
                        int j1=cheese*j;
                        if (j>=1){
                            System.out.println("the price of cheese is "+j1);
                        }
                    } else if (i==2) {
                        System.out.println("enter the pack of ketchup you want to add");
                        int k=sc.nextInt();
                        int k5=ketchup*k;
                        if (k>=1){
                            System.out.println("the price of the ketchup is"+k5);
                        }
                    } else if (i==3) {
                        System.out.println("enter the pack of oregano you want to add");
                        int k1=sc.nextInt();
                        int k6=oregano*k1;
                        if (k1>=1){
                            System.out.println("your price of the oregano is"+k6);
                        }
                    } else if (i==4) {
                        System.out.println("enter the quantity of vegetable you want to add");
                        int k2=sc.nextInt();
                        int k7=vegetable*k2;
                        if(k2>=1){
                            System.out.println("the price of vegetable is "+k7);
                        }
                    } else if (i==5) {
                        System.out.println("enter the quantity of mushroom you want to add");
                        int k3=sc.nextInt();
                        int k8=mushroom*k3;
                        if (k3>=1){
                            System.out.println("the price of the mushroom is"+k8);
                        }
                    } else if (i==6) {
                        System.out.println("enter the quantity of the olive you want to add");
                        int k4=sc.nextInt();
                        int k9=olive*k4;
                        if (k4>=1){
                            System.out.println("your price of olive is"+k9);
                        }
                    }

                }else {
                    System.out.println("thank you for using our service enjoy your meal!!");
                }
            }
        } else if (e.equals("non veg")) {
            System.out.println("what would you like to have in non veg?");
            System.out.println("we have the option of");
            System.out.println("chicken supreme ");
            System.out.println("chicken tikka");
            System.out.println("make your option above mentioned ");
            String f1 = sc.nextLine();
            if (f1.equals("chicken supreme ")) {
                System.out.println("nice selection mr" + a + "you have excellent taste bud i must tell you ");
                System.out.println("what would be the size of the pizza you want?");
                System.out.println("make the choice between small\n large\n medium");
                String h1 = sc.nextLine();
                if (h1.equals("small")) {
                    System.out.println("what kind of crust you want to have");
                    System.out.println("we have the option of the thin crust pizza and pan crust pizza");
                    System.out.println("make your choice");
                    String g = sc.nextLine();
                    if (g.equals("thin crust")) {
                        System.out.println("nice choice mr" + a);
                    } else if (g.equals("pan crust")) {
                        System.out.println("nice choice mr" + a);
                    }
                } else if (h1.equals("large")) {
                    System.out.println("what kind of crust you want to have");
                    System.out.println("we have the option of the thin crust pizza and pan crust pizza");
                    System.out.println("make your choice");
                    String g = sc.nextLine();
                    if (g.equals("thin crust")) {
                        System.out.println("nice choice mr" + a);
                    } else if (g.equals("pan crust")) {
                        System.out.println("nice choice mr" + a);
                    }
                } else if (h1.equals("medium")) {
                    System.out.println("what kind of crust you want to have");
                    System.out.println("we have the option of the thin crust pizza and pan crust pizza");
                    System.out.println("make your choice");
                    String g = sc.nextLine();
                    if (g.equals("thin crust")) {
                        System.out.println("nice choice mr" + a);
                    } else if (g.equals("pan crust")) {
                        System.out.println("nice choice mr" + a);
                    }
                } int cheese=30;
                int ketchup=10;
                int oregano=20;
                int vegetable=40;
                int mushroom=80;
                int olive=90;
                System.out.println("would you like to any add on");
                System.out.println("if yes than press (y) otherwise press (n)");
                String h=sc.nextLine();
                if (h.equals("y")){
                    System.out.println("we have the option of");
                    System.out.println("1 cheese\n2 ketchup\n3 oregano\n4 vegetable\n5 mushroom\n6 olive\n");
                    System.out.println("enter the choice ");
                    int i=sc.nextInt();
                    while (true){
                        if (i==1){
                            System.out.println("enter the pack of the cheese you want add");
                            int j=sc.nextInt();
                            int j1=cheese*j;
                            if (j>=1){
                                System.out.println("the price of cheese is "+j1);
                            }
                        } else if (i==2) {
                            System.out.println("enter the pack of ketchup you want to add");
                            int k=sc.nextInt();
                            int k5=ketchup*k;
                            if (k>=1){
                                System.out.println("the price of the ketchup is"+k5);
                            }
                        } else if (i==3) {
                            System.out.println("enter the pack of oregano you want to add");
                            int k1=sc.nextInt();
                            int k6=oregano*k1;
                            if (k1>=1){
                                System.out.println("your price of the oregano is"+k6);
                            }
                        } else if (i==4) {
                            System.out.println("enter the quantity of vegetable you want to add");
                            int k2=sc.nextInt();
                            int k7=vegetable*k2;
                            if(k2>=1){
                                System.out.println("the price of vegetable is "+k7);
                            }
                        } else if (i==5) {
                            System.out.println("enter the quantity of mushroom you want to add");
                            int k3=sc.nextInt();
                            int k8=mushroom*k3;
                            if (k3>=1){
                                System.out.println("the price of the mushroom is"+k8);
                            }
                        } else if (i==6) {
                            System.out.println("enter the quantity of the olive you want to add");
                            int k4=sc.nextInt();
                            int k9=olive*k4;
                            if (k4>=1){
                                System.out.println("your price of olive is"+k9);
                            }
                        }
                        else System.out.println("thank you for using our service enjoy your meal!!");
                        break;
                    }
                }
            }
            if (f1.equals("chicken tikka")) {
                System.out.println("nice selection mr" + a + "you have excellent taste bud i must tell you ");
                System.out.println("what would be the size of the pizza you want?");
                System.out.println("make the choice between small\n large\n medium");
                String h = sc.nextLine();
                if (h.equals("small")) {
                    System.out.println("what kind of crust you want to have");
                    System.out.println("we have the option of the thin crust pizza and pan crust pizza");
                    System.out.println("make your choice");
                    String g = sc.nextLine();
                    if (g.equals("thin crust")) {
                        System.out.println("nice choice mr" + a);
                    } else if (g.equals("pan crust")) {
                        System.out.println("nice choice mr" + a);
                    }
                } else if (h.equals("large")) {
                    System.out.println("what kind of crust you want to have");
                    System.out.println("we have the option of the thin crust pizza and pan crust pizza");
                    System.out.println("make your choice");
                    String g = sc.nextLine();
                    if (g.equals("thin crust")) {
                        System.out.println("nice choice mr" + a);
                    } else if (g.equals("pan crust")) {
                        System.out.println("nice choice mr" + a);
                    }
                } else if (h.equals("medium")) {
                    System.out.println("what kind of crust you want to have");
                    System.out.println("we have the option of the thin crust pizza and pan crust pizza");
                    System.out.println("make your choice");
                    String g = sc.nextLine();
                    if (g.equals("thin crust")) {
                        System.out.println("nice choice mr" + a);
                    } else if (g.equals("pan crust")) {
                        System.out.println("nice choice mr" + a);
                    }
                } int cheese=30;
                int ketchup=10;
                int oregano=20;
                int vegetable=40;
                int mushroom=80;
                int olive=90;
                System.out.println("would you like to any add on");
                System.out.println("if yes than press (y) otherwise press (n)");
                String h3 =sc.nextLine();
                if (h3.equals("y")){
                    System.out.println("we have the option of");
                    System.out.println("1 cheese\n2 ketchup\n3 oregano\n4 vegetable\n5 mushroom\n6 olive\n");
                    System.out.println("enter the choice ");
                    int i=sc.nextInt();
                    if (i==1){
                        System.out.println("enter the pack of the cheese you want add");
                        int j=sc.nextInt();
                        int j1=cheese*j;
                        if (j>=1){
                            System.out.println("the price of cheese is "+j1);
                        }
                    } else if (i==2) {
                        System.out.println("enter the pack of ketchup you want to add");
                        int k=sc.nextInt();
                        int k5=ketchup*k;
                        if (k>=1){
                            System.out.println("the price of the ketchup is"+k5);
                        }
                    } else if (i==3) {
                        System.out.println("enter the pack of oregano you want to add");
                        int k1=sc.nextInt();
                        int k6=oregano*k1;
                        if (k1>=1){
                            System.out.println("your price of the oregano is"+k6);
                        }
                    } else if (i==4) {
                        System.out.println("enter the quantity of vegetable you want to add");
                        int k2=sc.nextInt();
                        int k7=vegetable*k2;
                        if(k2>=1){
                            System.out.println("the price of vegetable is "+k7);
                        }
                    } else if (i==5) {
                        System.out.println("enter the quantity of mushroom you want to add");
                        int k3=sc.nextInt();
                        int k8=mushroom*k3;
                        if (k3>=1){
                            System.out.println("the price of the mushroom is"+k8);
                        }
                    } else if (i==6) {
                        System.out.println("enter the quantity of the olive you want to add");
                        int k4=sc.nextInt();
                        int k9=olive*k4;
                        if (k4>=1){
                            System.out.println("your price of olive is"+k9);
                        }
                    }

                }else {
                    System.out.println("thank you for using our service enjoy your meal!!");
                }

            }
        }
    }
}
