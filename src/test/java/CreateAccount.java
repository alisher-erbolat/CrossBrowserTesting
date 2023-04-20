import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CreateAccount {

    @Parameters({"userId"})
    @Test
    public void aaaa(String userId){
        System.out.println(userId);
    }
}
