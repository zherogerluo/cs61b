package db;

import java.io.File;
import java.util.List;

public interface Table {

    Table join(Table table);

    Table load(File file);

    boolean store(File file);

    boolean insert(String[] values);

    Table filter(Condition c);

    Table select(ColumnExpression ce);

    @Override
    String toString();
}