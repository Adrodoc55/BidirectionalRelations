package bidirectional.impl.manytomany;

import java.util.Arrays;

import org.junit.runners.Parameterized.Parameters;

import bidirectional.api.ManyToMany;
import bidirectional.api.ParameterizedManyToManyTest;

public class ManyToManyAsymmetricalSetImplTest extends ParameterizedManyToManyTest<ManyToManyAsymmetricalSetImpl> {
  @Parameters(name = "{0}")
  public static Iterable<Class<? extends ManyToMany>> supportedInverseClasses() {
    return Arrays.asList(//
        ManyToManyListImpl.class, //
        ManyToManySetImpl.class, //
        ManyToManySymmetricalSetImpl.class//
    );
  }
}