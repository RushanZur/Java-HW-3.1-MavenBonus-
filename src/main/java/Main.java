public class Main {
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusMilesService service = new BonusMilesService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        boolean passed = expected == actual;

        // выводим результат
        System.out.println(passed);
    }
}