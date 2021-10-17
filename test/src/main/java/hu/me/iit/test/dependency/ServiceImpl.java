package hu.me.iit.test.dependency;

public class ServiceImpl implements Service{
    private final Dependency dependency;

    public ServiceImpl(Dependency dependency) {
        this.dependency=dependency;
    }

    @Override
    public void calculate() {
        dependency.helpNoParameterNoReturnValue();
    }

    public int returns() {
        return 5;
    }

    @Override
    public int callHelpAndUseReturnValue() {
        return dependency.helpNoParameterReturnValue();
    }

    @Override
    public int helpNoParameterReturnValue() {
        return 0;
    }
}
