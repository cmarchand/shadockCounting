import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("com/oxiane/katas/shadock/shadock-to-number.feature")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value="com.oxiane.katas.shadock.glues.s2n")
public class ShadockToNumberTest {
}
