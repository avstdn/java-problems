package classic;

/**
 * Забравшийся в магазин вор нашёл больше добычи, чем он может унести с собой.
 * Его рюкзак выдерживает не больше W кг. Ему надо выбрать какие-то
 * из n товаров веса w и стоимости v. Как найти самый дорогой вариант?
 *
 * Пусть, например, рюкзак выдерживает W = 10 кг, а в магазине имеются
 * следующие изделия:
 *
 * Товар  Вес   Стоимость
 * ----------------------
 *   1     6       30
 *   2     3       14
 *   3     4       16
 *   4     2        9
 */
public class Knapsack {

    private int[][] items;
    private int maxWeight;

    public Knapsack(int[][] items, int maxWeight) {
        this.items = items;
        this.maxWeight = maxWeight;
    }

    /**
     * Метод полного перебора
     *
     * @return Максимальная стоимость товаров
     */
    public int getMaxPrice() {
        // Общее количество строк с битами 2^n
        int bitsQuantity = (int)Math.pow(2, items.length);
        int maxPrice = 0;

        // Проходим по каждой строке с битами, представленными в десятичной системе.
        // В дальнейшем при помощи унарного оператора & приводя его в двоичный формат
        for (int i = 0; i < bitsQuantity; i++) {
            int bits = i;
            int price = 0;
            int tempWeight = maxWeight;

            // Проходим по каждому биту, сдвигая его после каждой итерации на один
            // разряд вправо, т.е. для числа 10 получаем 1010 >> 101. При этом, если крайний
            // правый бит равен 1, то рассчитываем вес и стоимость товара соответствующего
            // элемента исходного массива
            for (int[] item : items) {
                if ((bits & 1) > 0) {
                    tempWeight -= item[0];
                    price += item[1];
                }
                bits >>= 1;
            }
            // После полного прохода по битовому числу проверяем, чтобы рассчитанный вес не уходил
            // в минус, а цена товара при каждой итерации выбиралась только максимальная
            if (tempWeight >= 0 && price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }
}
