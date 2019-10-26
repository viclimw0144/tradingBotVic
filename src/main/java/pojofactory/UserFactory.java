package pojofactory;

import pojo.Trader;
import pojo.User;
import utils.FactoryUtils;

public class UserFactory {
    private UserFactory(){}
    public static User generateUser(String uName){
        return switch (uName){
            case "Trader":
                yield new Trader();
            default:
                yield null;
        };
    }
}
