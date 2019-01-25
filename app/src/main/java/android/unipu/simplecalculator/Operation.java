package android.unipu.simplecalculator;

public class Operation extends Numbers implements Operations {
    private double result;
    private Numbers numbers;

    public Operation(Numbers numbers, double result) {
        super(numbers.getmNumberOne(),numbers.getmNumberTwo());
        this.numbers=numbers;
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public double addition(Numbers numbers) {
        return numbers.getmNumberOne()+numbers.getmNumberTwo();
    }

    @Override
    public double substraction(Numbers numbers) {
        return numbers.getmNumberOne()-numbers.getmNumberTwo();
    }

    @Override
    public double division(Numbers numbers) {
        return numbers.getmNumberOne()/numbers.getmNumberTwo();
    }

    @Override
    public double multiplication(Numbers numbers) {
        return numbers.getmNumberOne()*numbers.getmNumberTwo();
    }
}
