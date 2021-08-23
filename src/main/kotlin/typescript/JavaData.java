package typescript;

import java.util.Optional;

interface JavaData {

    public Optional<String> getValue();
}


class JavaDataContent implements JavaData{

    private String value;

    @Override
    public Optional<String> getValue() {
        return Optional.ofNullable(value);
    }
}