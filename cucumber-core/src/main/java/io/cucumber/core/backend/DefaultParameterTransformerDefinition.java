package io.cucumber.core.backend;

import io.cucumber.cucumberexpressions.LocaleParameterByTypeTransformer;
import io.cucumber.cucumberexpressions.ParameterByTypeTransformer;
import org.apiguardian.api.API;

import java.util.Locale;

@API(status = API.Status.STABLE)
public interface DefaultParameterTransformerDefinition extends Located {

    ParameterByTypeTransformer parameterByTypeTransformer();

    default LocaleParameterByTypeTransformer localeParameterByTypeTransformer(Locale locale) {
        return (fromValue, toValueType) -> this.parameterByTypeTransformer().transform(fromValue, toValueType);
    }

}
