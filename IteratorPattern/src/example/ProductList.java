package example;

import java.util.List;

public class ProductList extends AbstractObjectList {
    public ProductList(List<Object> objects) {
        super(objects);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
