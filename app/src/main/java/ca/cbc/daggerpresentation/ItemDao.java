package ca.cbc.daggerpresentation;

import javax.inject.Inject;

class ItemDao {

    private TableMetadata tableMetadata;

    @Inject
    public ItemDao(TableMetadata tableMetadata) {
        this.tableMetadata = tableMetadata;
    }
}
