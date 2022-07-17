package LOSTandFOUND;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class main
{
    private static final ArrayList<Lost> lostArray = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        lostArray.add(new BookLost("C语言程序设计","2022-07-14"));
        lostArray.add(new BookLost("高等数学（上）","2022-06-04"));
        lostArray.add(new CardLost("重邮一卡通","2022-06-29"));
        lostArray.add(new BookLost("古希腊罗马神话","2022-07-06"));
        lostArray.add(new BookLost("概率论与数理统计","2022-06-24"));

        System.out.println("失物招领");
        while (true)
        {
            System.out.println("请选择选项对应的数字：");
            System.out.println("1.查看失物  2.搜索失物");
            int i = scanner.nextInt();
            switch (i)
            {
                case 1 -> lostList();
                case 2 -> findLost();
                //default -> System.exit(0);
            }
        }
    }

    public static void lostList()
    {
        lostArray.sort(
                new Comparator<>()
                {
                    //@Override
                    public int compare(Lost l1, Lost l2)
                    {
                        return l2.getTime().compareTo(l1.getTime());
                    }
                });
        for (Lost lost : lostArray)
        {
            System.out.println(lost);
        }
    }

    public static void findLost()
    {
        System.out.println("请输入丢失名称关键字：");
        String next = scanner.next();
        for (Lost lost1 : lostArray)
        {
            if (lost1.getName().contains(next))
            {
                System.out.println(lost1);
            }
        }
    }
}
