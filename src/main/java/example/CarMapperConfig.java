package example;

import org.mapstruct.Builder;
import org.mapstruct.MapperConfig;

@MapperConfig(builder = @Builder(disableBuilder = true))
public interface CarMapperConfig {
}