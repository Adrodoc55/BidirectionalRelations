package bidirectional.impl.list;

import bidirectional.api.ManyToOne;
import bidirectional.api.OneToMany;
import bidirectional.api.OneToManyTest;
import bidirectional.impl.basic.ManyToOneBasicImpl;

public class OneToManyListImpl_ManyToOneBasicImpl_Test extends OneToManyTest {
  @Override
  protected OneToMany newOneToMany() {
    return new OneToManyListImpl();
  }

  @Override
  protected ManyToOne newManyToOne() {
    return new ManyToOneBasicImpl();
  }
}
