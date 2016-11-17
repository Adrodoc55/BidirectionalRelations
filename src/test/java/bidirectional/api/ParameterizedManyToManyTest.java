package bidirectional.api;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import reflect.ReflectionUtils;

@RunWith(Parameterized.class)
public abstract class ParameterizedManyToManyTest<M extends ManyToMany> extends ManyToManyTest
    implements
      GenericTest<M> {
  @Parameter
  public Class<? extends ManyToMany> inverse;

  @Override
  protected final ManyToMany newA() {
    return ReflectionUtils.newInstance(getClassUnderTest());
  }

  @Override
  protected final ManyToMany newB() {
    return ReflectionUtils.newInstance(inverse);
  }

  /**
   * Ensure there is no "copy-paste-not-modified" error and we did not forget to change the type parameter when creating
   * the sub class of this class.
   */
  @Test
  public void test_name_of_test_class_equals_name_of_class_under_test_with_suffix_Test() {
    String nameOfTestClass = getClass().getSimpleName();
    String expectedNameOfClassUnderTest = nameOfTestClass.replaceFirst("Test$", "");
    String expectedPackageName = getClass().getPackage().getName();
    assertThat(getClassUnderTest().getName()).isEqualTo(expectedPackageName + '.' + expectedNameOfClassUnderTest);
  }
}