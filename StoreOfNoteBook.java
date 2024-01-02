import java.util.*;

// Скопировать список и если условие не выполняется просто удалять !!! вот и все

public class StoreOfNoteBook {
    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>();

        // Вводим перечень ноутбуков с характеристиками
        Notebook notebook1 = new Notebook();
        notebook1.company = "Apple";
        notebook1.product = "MacBook_Pro";
        notebook1.typeName = "Ultrabook";
        notebook1.inches = 13.3;
        notebook1.ram = 8;
        notebook1.operationSys = "macOS";
        notebook1.weight = 1.37;
        notebook1.price = 120000.0;

        Notebook notebook2 = new Notebook();
        notebook2.company = "Apple";
        notebook2.product = "MacBook_Pro";
        notebook2.typeName = "Ultrabook";
        notebook2.inches = 15.4;
        notebook2.ram = 16;
        notebook2.operationSys = "macOS";
        notebook2.weight = 1.83;
        notebook2.price = 130000.0;

        Notebook notebook3 = new Notebook();
        notebook3.company = "HP";
        notebook3.product = "250 G6";
        notebook3.typeName = "Notebook";
        notebook3.inches = 15.6;
        notebook3.ram = 8;
        notebook3.operationSys = "Windows_10";
        notebook3.weight = 1.86;
        notebook3.price = 80000.0;

        Notebook notebook4 = new Notebook();
        notebook4.company = "Lenovo";
        notebook4.product = "IdeaPad_320-15IKB";
        notebook4.typeName = "Notebook";
        notebook4.inches = 15.6;
        notebook4.ram = 8;
        notebook4.operationSys = "Windows_10";
        notebook4.weight = 2.2;
        notebook4.price = 70000.0;

        Notebook notebook5 = new Notebook();
        notebook5.company = "Apple";
        notebook5.product = "MacBook_ProMax";
        notebook5.typeName = "Notebook";
        notebook5.inches = 13.3;
        notebook5.ram = 8;
        notebook5.operationSys = "macOS";
        notebook5.weight = 1.37;
        notebook5.price = 120000.0;

        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);

//        printSet(notebooks);

//        printSet(test(notebooks, 15.5));

        printSet(numOfParam(notebooks, 2));
        //Вызываем метод выбора критериев

    }


    //метод для проверки, что все корректно выводится
    static void printSet(Set<Notebook> notebooks) {
        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }
    }


    //метод для проверки, что изменились характеристи equels
    static Set<Notebook> test(Set<Notebook> notebooks, Double minInch) {
        Set<Notebook> res = new HashSet<>();
        for (Notebook notebook : notebooks) {
            if (notebook.inches >= minInch) {
                res.add(notebook);
            }
        }
        return res;
    }


    // Метод для выбора критериев фильтрации
    static Set<Notebook> numOfParam(Set<Notebook> notebooks, int ans) {
        Set<Notebook> kriterii = new HashSet<>();
        kriterii=notebooks;
        Scanner scanner = new Scanner(System.in);

        //Выводим список предлагаемых операций
//        textChoice();

        while (ans != 0) {
            textChoice();
            ans = scanner.nextInt();

            if (ans == 1) {
                String s1 = "Введите наименование фирмы из выпадающего списка";
                List<String> spisok1 = new LinkedList<>();

                //можно ли как то оптимизировать код for?
                for (Notebook notebook : notebooks) {
                    if (!spisok1.contains(notebook.company)) {
                        spisok1.add(notebook.company);
                    }
                }

                System.out.println(spisok1+"\n"+s1);

                String ans1 = scanner.next();

                kriterii.removeIf(riter -> !riter.company.equals(ans1));



                printSet(kriterii);
            }

            if (ans == 2) {
                String s2 = "Введите наименование продукта из выпадающего списка";
                List<String> spisok2 = new LinkedList<>();

                for (Notebook notebook : notebooks) {
                    if (!spisok2.contains(notebook.product)) {
                        spisok2.add(notebook.product);
                    }
                }
                System.out.println(s2 + "\n" + spisok2);


                String ans2 = scanner.next();

                kriterii.removeIf(riter -> !riter.product.equals(ans2));

                printSet(kriterii);
            }

            if (ans == 3) {
                String s3 = "Введите тип компьютера из выпадающего списка";
                List<String> spisok3 = new LinkedList<>();

                //можно ли как то оптимизировать код for?
                for (Notebook notebook : notebooks) {
                    if (!spisok3.contains(notebook.typeName)) {
                        spisok3.add(notebook.typeName);
                    }
                }
                System.out.println(s3+ "\n" +spisok3);

                String ans3 = scanner.next();

                kriterii.removeIf(riter -> !riter.typeName.equals(ans3));

                printSet(kriterii);
            }

            if (ans == 4) {
                String s4 = "Введите минамальный размер памяти из выпадающего списка";
                List<Double> spisok4 = new LinkedList<>();
                for (Notebook notebook : notebooks) {
                    if (!spisok4.contains(notebook.inches)) {
                        spisok4.add(notebook.inches);
                    }
                }
                System.out.println(s4 + "\n"+ spisok4);
                Double ans4 = Double.valueOf(scanner.next());

                kriterii.removeIf(riter -> riter.inches<ans4);

                printSet(kriterii);
            }

            if (ans == 5) {
                String s5 = "Введите минамальный размер ram из выпадающего списка";
                List<Integer> spisok5 = new LinkedList<>();
                for (Notebook notebook : notebooks) {
                    if (!spisok5.contains(notebook.ram)) {
                        spisok5.add(notebook.ram);
                    }
                }
                System.out.println(s5 + "\n" +spisok5);
                System.out.println(s5);

                Integer ans5 = Integer.valueOf(scanner.next());

                kriterii.removeIf(riter -> riter.ram<=ans5);

                printSet(kriterii);
            }

            if (ans == 6) {
                String s6 = "Введите наименование операционной системы из выпадающего списка";
                List<String> spisok6 = new LinkedList<>();

                for (Notebook notebook : notebooks) {
                    if (!spisok6.contains(notebook.operationSys)) {
                        spisok6.add(notebook.operationSys);
                    }
                }
                System.out.println(s6 + "\n" + spisok6);

                String ans6 = scanner.next();

                kriterii.removeIf(riter -> !riter.product.equals(ans6));


                printSet(kriterii);
            }

            if (ans == 7) {
                String s7 = "Введите мксимальный вес из выпадающего списка";
                List<Double> spisok7 = new LinkedList<>();
                for (Notebook notebook : notebooks) {
                    if (!spisok7.contains(notebook.weight)) {
                        spisok7.add(notebook.weight);
                    }
                }
                System.out.println(s7 + "\n" + spisok7);

                Double ans7 = Double.valueOf(scanner.next());

                kriterii.removeIf(riter -> riter.weight<=ans7);

                printSet(kriterii);
            }

            if (ans == 8) {
                String s8 = "Введите максимальный размер цены из выпадающего списка";
                List<Double> spisok8 = new LinkedList<>();
                for (Notebook notebook : notebooks) {
                    if (!spisok8.contains(notebook.price)) {
                        spisok8.add(notebook.price);
                    }
                }
                System.out.println(s8 + "\n" + spisok8);

                Double ans8 = Double.valueOf(scanner.next());

                kriterii.removeIf(riter -> riter.price>=ans8);

                printSet(kriterii);
            }

            if (ans == 0) {
                return kriterii;
            }

        }
        return kriterii;
    }


    //Код необходимо дописывать вручную, если добавятся критерии фильтрации / измениться порядок.

    static void textChoice ( ) {
        String text = new String("Введите число для выбора критерия фильтрации:\n" +
                "1 - company: \n" +
                "2 - product: \n" +
                "3 - typeName: \n" +
                "4 - inches: \n" +
                "5 - ram: \n" +
                "6 - operationSys: \n" +
                "7 - weight: \n" +
                "8 - price\n" +
                "0 - завершить ввод критериев для фильтрации и показать результаты");
        System.out.println(text);
    }

}

