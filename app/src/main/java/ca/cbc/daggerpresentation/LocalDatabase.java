package ca.cbc.daggerpresentation;

import javax.inject.Inject;

@AppScope
class LocalDatabase {


    private AnotherDependency anotherDependency;
    private ItemDao itemDao;
    private OtherItemDao otherItemDao;
    private IdGenerator idGenerator;
    private LocalScheduler localScheduler;
    private final Something something;

    @Inject
    public LocalDatabase(AnotherDependency anotherDependency,
                         ItemDao itemDao, OtherItemDao otherItemDao,
                         IdGenerator idGenerator, LocalScheduler localScheduler, Something something) {
        this.anotherDependency = anotherDependency;
        this.itemDao = itemDao;
        this.otherItemDao = otherItemDao;
        this.idGenerator = idGenerator;
        this.localScheduler = localScheduler;
        this.something = something;
    }

    public void doSomething() {
    }
}
