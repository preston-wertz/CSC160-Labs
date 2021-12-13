/**
 * @Author Preston C. Wertz
 * @Section CSC160 - 179
 * @Instructor Doug Lundin
 * @Date 2021-10-31
 *
 * @Description
 *
 * HW # 9 Stock
 *
 */
public class Stock
{
    String symbol;
    String name;
    Double previousClosingPrice;
    Double currentPrice;

    public Stock(String symbol, String name, Double currentPrice, Double previousClosingPrice)
    {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public Double getChangePercent()
    {
        return ((currentPrice - previousClosingPrice)/(previousClosingPrice)) * 100;
    }
}
