package ca.cbc.daggerpresentation;

import javax.inject.Inject;

class OtherItemDao {

    private TableMetadata tableMetadata;

    @Inject
    public OtherItemDao(TableMetadata tableMetadata) {

        this.tableMetadata = tableMetadata;
    }
}
