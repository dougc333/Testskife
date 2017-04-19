import org.skife.config.Default;
import org.skife.config.Config;
/**
 * Created by dc on 4/19/17.
 */


public interface MyConfig {

    @Config("key")
    @Default("this is the default value for key")
    public String getStuff();
}
