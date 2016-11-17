package bidirectional.impl.set;

import java.util.Arrays;

import org.junit.runners.Parameterized.Parameters;

import bidirectional.api.ManyToMany;
import bidirectional.api.ParameterizedManyToManyTest;
import bidirectional.impl.list.ManyToManyListImpl;

public class ManyToManySetImplTest extends ParameterizedManyToManyTest<ManyToManySetImpl> {
  @Parameters(name = "{0}")
  public static Iterable<Class<? extends ManyToMany>> supportedInverseClasses() {
    return Arrays.asList(//
        ManyToManyAsymmetricalSetImpl.class, //
        ManyToManyListImpl.class, //
        ManyToManySetImpl.class, //
        ManyToManySymmetricalSetImpl.class//
    );
  }
}
