import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Euler3Test {

    @Test
    public void checkIfGivenNumberIsEven(){
        //given
        long  check = 4613732;
        //when
        boolean flag = check % 2 == 0;

        //then
        Assert.assertThat(check % 2 == 0, CoreMatchers.is(true)); // checking if the value is correct
    }


}
