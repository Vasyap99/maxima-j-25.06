package dz25_06;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.Getter;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@ToString(includeFieldNames = false)
@Getter
@EqualsAndHashCode
public class Program{
    private final String name;
}

