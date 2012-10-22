package jp.SandBox.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2012-10-22 17:53:48")
/** */
public final class MessageMeta extends org.slim3.datastore.ModelMeta<jp.SandBox.model.Message> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.SandBox.model.Message, java.util.Date> createDate = new org.slim3.datastore.CoreAttributeMeta<jp.SandBox.model.Message, java.util.Date>(this, "createDate", "createDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.SandBox.model.Message, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.SandBox.model.Message, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.SandBox.model.Message> message = new org.slim3.datastore.StringAttributeMeta<jp.SandBox.model.Message>(this, "message", "message");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.SandBox.model.Message> userName = new org.slim3.datastore.StringAttributeMeta<jp.SandBox.model.Message>(this, "userName", "userName");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.SandBox.model.Message, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.SandBox.model.Message, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final MessageMeta slim3_singleton = new MessageMeta();

    /**
     * @return the singleton
     */
    public static MessageMeta get() {
       return slim3_singleton;
    }

    /** */
    public MessageMeta() {
        super("Message", jp.SandBox.model.Message.class);
    }

    @Override
    public jp.SandBox.model.Message entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.SandBox.model.Message model = new jp.SandBox.model.Message();
        model.setCreateDate((java.util.Date) entity.getProperty("createDate"));
        model.setKey(entity.getKey());
        model.setMessage((java.lang.String) entity.getProperty("message"));
        model.setUserName((java.lang.String) entity.getProperty("userName"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.SandBox.model.Message m = (jp.SandBox.model.Message) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("createDate", m.getCreateDate());
        entity.setProperty("message", m.getMessage());
        entity.setProperty("userName", m.getUserName());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.SandBox.model.Message m = (jp.SandBox.model.Message) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.SandBox.model.Message m = (jp.SandBox.model.Message) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.SandBox.model.Message m = (jp.SandBox.model.Message) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.SandBox.model.Message m = (jp.SandBox.model.Message) model;
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
        jp.SandBox.model.Message m = (jp.SandBox.model.Message) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getCreateDate() != null){
            writer.setNextPropertyName("createDate");
            encoder0.encode(writer, m.getCreateDate());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getMessage() != null){
            writer.setNextPropertyName("message");
            encoder0.encode(writer, m.getMessage());
        }
        if(m.getUserName() != null){
            writer.setNextPropertyName("userName");
            encoder0.encode(writer, m.getUserName());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected jp.SandBox.model.Message jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.SandBox.model.Message m = new jp.SandBox.model.Message();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("createDate");
        m.setCreateDate(decoder0.decode(reader, m.getCreateDate()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("message");
        m.setMessage(decoder0.decode(reader, m.getMessage()));
        reader = rootReader.newObjectReader("userName");
        m.setUserName(decoder0.decode(reader, m.getUserName()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}