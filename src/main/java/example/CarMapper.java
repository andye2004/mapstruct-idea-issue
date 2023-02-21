package example;

import org.mapstruct.Mapper;

@Mapper(config = CarMapperConfig.class)
public interface CarMapper {
    ToyCar map(Car source);
}
