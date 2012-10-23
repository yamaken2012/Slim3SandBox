package jp.SandBox.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2012-10-23 10:25:10")
/** */
public final class UsersMeta extends org.slim3.datastore.ModelMeta<jp.SandBox.model.Users> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.SandBox.model.Users> id = new org.slim3.datastore.StringAttributeMeta<jp.SandBox.model.Users>(this, "id", "id");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.SandBox.model.Users, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.SandBox.model.Users, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.SandBox.model.Users> password = new org.slim3.datastore.StringAttributeMeta<jp.SandBox.model.Users>(this, "password", "password");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.SandBox.model.Users, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.SandBox.model.Users, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final UsersMeta slim3_singleton = new UsersMeta();

    /**
     * @return the singleton
     */
    public static UsersMeta get() {
       return slim3_singleton;
    }

    /** */
    public UsersMeta() {
        super("Users", jp.SandBox.model.Users.class);
    }

    @Override
    public jp.SandBox.model.Users entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.SandBox.model.Users model = new jp.SandBox.model.Users();
        model.setId((java.lang.String) entity.getProperty("id"));
        model.setKey(entity.getKey());
        model.setPassword((java.lang.String) entity.getProperty("password"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.SandBox.model.Users m = (jp.SandBox.model.Users) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("id", m.getId());
        entity.setProperty("password", m.getPassword());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.SandBox.model.Users m = (jp.SandBox.model.Users) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.SandBox.model.Users m = (jp.SandBox.model.Users) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.SandBox.model.Users m = (jp.SandBox.model.Users) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.SandBox.model.Users m = (jp.SandBox.model.Users) model;
        long version = m.getVersion() != null ? m.getVersion().longValue() : 0L;
        m.setVersion(Long.valueOf(version + 1L));
    }

    @Override
    protected void prePut(Object model) {
    }

    @Override
    protected void postGet(Object model) {
    }

    @Override
    public String getSchemaVersionName() {
        return "slim3.schemaVersion";
    }

    @Override
    public String getClassHierarchyListName() {
        return "slim3.classHierarchyList";
    }

    @Override
    protected boolean isCipherProperty(String propertyName) {
        return false;
    }

    @Override
    protected void modelToJson(org.slim3.datastore.json.JsonWriter writer, java.lang.Object model, int maxDepth, int currentDepth) {
        jp.SandBox.model.Users m = (jp.SandBox.model.Users) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getId() != null){
            writer.setNextPropertyName("id");
            encoder0.encode(writer, m.getId());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getPassword() != null){
            writer.setNextPropertyName("password");
            encoder0.encode(writer, m.getPassword());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected jp.SandBox.model.Users jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.SandBox.model.Users m = new jp.SandBox.model.Users();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("id");
        m.setId(decoder0.decode(reader, m.getId()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("password");
        m.setPassword(decoder0.decode(reader, m.getPassword()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}