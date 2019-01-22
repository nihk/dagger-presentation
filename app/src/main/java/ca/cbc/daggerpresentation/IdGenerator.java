package ca.cbc.daggerpresentation;

import javax.inject.Inject;

class IdGenerator {

    private final Something something;

    @Inject
    public IdGenerator(Something something) {
        this.something = something;
    }
}
