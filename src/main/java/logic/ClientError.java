package logic;

public class ClientError implements DoSomething{
    @Override
    public void doSomething() {
        System.out.println("50 lines of code is working in order to handle client error status");
    }
}
