package arguments;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Stream;

public class AuthValidationArgumentsProvider implements ArgumentsProvider {

    @Override
    public Stream provideArguments(ExtensionContext context) {
        return Stream.of(
                new AuthValidationArgumentsHolder(
                        Collections.emptyMap()
                ),
                new AuthValidationArgumentsHolder(
                        Map.of("key", "fb04999a731923c2e3137153b1ad5de0")
                ),
                new AuthValidationArgumentsHolder(
                        Map.of("token", "b73120fb537fceb444050a2a4c08e2f96f47389931bd80253d2440708f2a57e1")
                )
        ).map(Arguments::of);
    }
}
