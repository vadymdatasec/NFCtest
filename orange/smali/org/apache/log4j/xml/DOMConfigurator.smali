.class public Lorg/apache/log4j/xml/DOMConfigurator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/log4j/spi/Configurator;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/log4j/xml/DOMConfigurator$a;
    }
.end annotation


# static fields
.field public static final e:[Ljava/lang/Class;

.field public static synthetic f:Ljava/lang/Class;

.field public static synthetic g:Ljava/lang/Class;

.field public static synthetic h:Ljava/lang/Class;

.field public static synthetic i:Ljava/lang/Class;


# instance fields
.field public a:Ljava/util/Hashtable;

.field public b:Ljava/util/Properties;

.field public c:Lorg/apache/log4j/spi/LoggerRepository;

.field public d:Lorg/apache/log4j/spi/LoggerFactory;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    .line 1
    sget-object v1, Lorg/apache/log4j/xml/DOMConfigurator;->f:Ljava/lang/Class;

    if-nez v1, :cond_0

    const-string v1, "java.lang.String"

    invoke-static {v1}, Lorg/apache/log4j/xml/DOMConfigurator;->b(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, Lorg/apache/log4j/xml/DOMConfigurator;->f:Ljava/lang/Class;

    :cond_0
    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lorg/apache/log4j/xml/DOMConfigurator;->e:[Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lorg/apache/log4j/xml/DOMConfigurator;->d:Lorg/apache/log4j/spi/LoggerFactory;

    .line 3
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/apache/log4j/xml/DOMConfigurator;->a:Ljava/util/Hashtable;

    return-void
.end method

.method public static a(Ljava/lang/Object;Lorg/w3c/dom/Element;Ljava/util/Properties;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 15
    instance-of v0, p0, Lorg/apache/log4j/xml/UnrecognizedElementHandler;

    if-eqz v0, :cond_0

    .line 16
    check-cast p0, Lorg/apache/log4j/xml/UnrecognizedElementHandler;

    invoke-interface {p0, p1, p2}, Lorg/apache/log4j/xml/UnrecognizedElementHandler;->parseUnrecognizedElement(Lorg/w3c/dom/Element;Ljava/util/Properties;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    .line 17
    new-instance p0, Ljava/lang/StringBuffer;

    invoke-direct {p0}, Ljava/lang/StringBuffer;-><init>()V

    const-string p2, "Unrecognized element "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {p1}, Lorg/w3c/dom/Element;->getNodeName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public static synthetic b(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/NoClassDefFoundError;

    invoke-direct {v0}, Ljava/lang/NoClassDefFoundError;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/NoClassDefFoundError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0
.end method

.method public static b(Ljava/lang/Object;Lorg/w3c/dom/Element;Ljava/util/Properties;)V
    .locals 0

    .line 2
    :try_start_0
    invoke-static {p0, p1, p2}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/Object;Lorg/w3c/dom/Element;Ljava/util/Properties;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 3
    instance-of p1, p0, Ljava/lang/InterruptedException;

    if-nez p1, :cond_0

    instance-of p1, p0, Ljava/io/InterruptedIOException;

    if-eqz p1, :cond_1

    .line 4
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    :cond_1
    const-string p1, "Error in extension content: "

    .line 5
    invoke-static {p1, p0}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static configure(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/parsers/FactoryConfigurationError;
        }
    .end annotation

    .line 3
    new-instance v0, Lorg/apache/log4j/xml/DOMConfigurator;

    invoke-direct {v0}, Lorg/apache/log4j/xml/DOMConfigurator;-><init>()V

    invoke-static {}, Lorg/apache/log4j/LogManager;->getLoggerRepository()Lorg/apache/log4j/spi/LoggerRepository;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->doConfigure(Ljava/lang/String;Lorg/apache/log4j/spi/LoggerRepository;)V

    return-void
.end method

.method public static configure(Ljava/net/URL;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/parsers/FactoryConfigurationError;
        }
    .end annotation

    .line 4
    new-instance v0, Lorg/apache/log4j/xml/DOMConfigurator;

    invoke-direct {v0}, Lorg/apache/log4j/xml/DOMConfigurator;-><init>()V

    invoke-static {}, Lorg/apache/log4j/LogManager;->getLoggerRepository()Lorg/apache/log4j/spi/LoggerRepository;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->doConfigure(Ljava/net/URL;Lorg/apache/log4j/spi/LoggerRepository;)V

    return-void
.end method

.method public static configure(Lorg/w3c/dom/Element;)V
    .locals 2

    .line 1
    new-instance v0, Lorg/apache/log4j/xml/DOMConfigurator;

    invoke-direct {v0}, Lorg/apache/log4j/xml/DOMConfigurator;-><init>()V

    .line 2
    invoke-static {}, Lorg/apache/log4j/LogManager;->getLoggerRepository()Lorg/apache/log4j/spi/LoggerRepository;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->doConfigure(Lorg/w3c/dom/Element;Lorg/apache/log4j/spi/LoggerRepository;)V

    return-void
.end method

.method public static configureAndWatch(Ljava/lang/String;)V
    .locals 2

    const-wide/32 v0, 0xea60

    .line 1
    invoke-static {p0, v0, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->configureAndWatch(Ljava/lang/String;J)V

    return-void
.end method

.method public static configureAndWatch(Ljava/lang/String;J)V
    .locals 1

    .line 2
    new-instance v0, Lm/a/b/n/e;

    invoke-direct {v0, p0}, Lm/a/b/n/e;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0, p1, p2}, Lorg/apache/log4j/helpers/FileWatchdog;->setDelay(J)V

    .line 4
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static parseElement(Lorg/w3c/dom/Element;Ljava/util/Properties;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-string v0, "class"

    .line 1
    invoke-interface {p0, v0}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lorg/apache/log4j/xml/DOMConfigurator;->subst(Ljava/lang/String;Ljava/util/Properties;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 2
    invoke-static {v0, p2, v1}, Lorg/apache/log4j/helpers/OptionConverter;->instantiateByClassName(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 3
    new-instance v0, Lorg/apache/log4j/config/PropertySetter;

    invoke-direct {v0, p2}, Lorg/apache/log4j/config/PropertySetter;-><init>(Ljava/lang/Object;)V

    .line 4
    invoke-interface {p0}, Lorg/w3c/dom/Element;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object p0

    .line 5
    invoke-interface {p0}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 6
    invoke-interface {p0, v2}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v3

    .line 7
    invoke-interface {v3}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_1

    .line 8
    check-cast v3, Lorg/w3c/dom/Element;

    .line 9
    invoke-interface {v3}, Lorg/w3c/dom/Element;->getTagName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "param"

    .line 10
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 11
    invoke-static {v3, v0, p1}, Lorg/apache/log4j/xml/DOMConfigurator;->setParameter(Lorg/w3c/dom/Element;Lorg/apache/log4j/config/PropertySetter;Ljava/util/Properties;)V

    goto :goto_1

    .line 12
    :cond_0
    invoke-static {p2, v3, p1}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/Object;Lorg/w3c/dom/Element;Ljava/util/Properties;)V

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object p2

    :cond_3
    return-object v1
.end method

.method public static setParameter(Lorg/w3c/dom/Element;Lorg/apache/log4j/config/PropertySetter;Ljava/util/Properties;)V
    .locals 2

    const-string v0, "name"

    .line 1
    invoke-interface {p0, v0}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lorg/apache/log4j/xml/DOMConfigurator;->subst(Ljava/lang/String;Ljava/util/Properties;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "value"

    .line 2
    invoke-interface {p0, v1}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 3
    invoke-static {p0}, Lorg/apache/log4j/helpers/OptionConverter;->convertSpecialChars(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p2}, Lorg/apache/log4j/xml/DOMConfigurator;->subst(Ljava/lang/String;Ljava/util/Properties;)Ljava/lang/String;

    move-result-object p0

    .line 4
    invoke-virtual {p1, v0, p0}, Lorg/apache/log4j/config/PropertySetter;->setProperty(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static subst(Ljava/lang/String;Ljava/util/Properties;)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p0, p1}, Lorg/apache/log4j/helpers/OptionConverter;->substVars(Ljava/lang/String;Ljava/util/Properties;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    const-string v0, "Could not perform variable substitution."

    .line 2
    invoke-static {v0, p1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Lorg/apache/log4j/xml/DOMConfigurator;->b:Ljava/util/Properties;

    invoke-static {p1, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->subst(Ljava/lang/String;Ljava/util/Properties;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public a(Lorg/w3c/dom/Document;Ljava/lang/String;)Lorg/apache/log4j/Appender;
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/xml/DOMConfigurator;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/log4j/Appender;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "appender"

    .line 2
    invoke-interface {p1, v0}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object p1

    const/4 v0, 0x0

    .line 3
    :goto_0
    invoke-interface {p1}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_2

    .line 4
    invoke-interface {p1, v0}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v1

    .line 5
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object v3

    const-string v4, "name"

    .line 6
    invoke-interface {v3, v4}, Lorg/w3c/dom/NamedNodeMap;->getNamedItem(Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v3

    .line 7
    invoke-interface {v3}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 8
    check-cast v1, Lorg/w3c/dom/Element;

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    move-object v1, v2

    :goto_1
    if-nez v1, :cond_3

    .line 9
    new-instance p1, Ljava/lang/StringBuffer;

    invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v0, "No appender named ["

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p2, "] could be found."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;)V

    return-object v2

    .line 10
    :cond_3
    invoke-virtual {p0, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->c(Lorg/w3c/dom/Element;)Lorg/apache/log4j/Appender;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 11
    iget-object v0, p0, Lorg/apache/log4j/xml/DOMConfigurator;->a:Ljava/util/Hashtable;

    invoke-virtual {v0, p2, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-object p1
.end method

.method public a(Lorg/w3c/dom/Element;)Lorg/apache/log4j/Appender;
    .locals 1

    const-string v0, "ref"

    .line 12
    invoke-interface {p1, v0}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 13
    invoke-interface {p1}, Lorg/w3c/dom/Element;->getOwnerDocument()Lorg/w3c/dom/Document;

    move-result-object p1

    .line 14
    invoke-virtual {p0, p1, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Document;Ljava/lang/String;)Lorg/apache/log4j/Appender;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lorg/apache/log4j/xml/DOMConfigurator$a;Lorg/apache/log4j/spi/LoggerRepository;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/parsers/FactoryConfigurationError;
        }
    .end annotation

    .line 67
    iput-object p2, p0, Lorg/apache/log4j/xml/DOMConfigurator;->c:Lorg/apache/log4j/spi/LoggerRepository;

    .line 68
    :try_start_0
    new-instance p2, Ljava/lang/StringBuffer;

    invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v0, "System property is :"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, "javax.xml.parsers.DocumentBuilderFactory"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lorg/apache/log4j/helpers/OptionConverter;->getSystemProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 69
    invoke-static {}, Ljavax/xml/parsers/DocumentBuilderFactory;->newInstance()Ljavax/xml/parsers/DocumentBuilderFactory;

    move-result-object p2

    const-string v0, "Standard DocumentBuilderFactory search succeded."

    .line 70
    invoke-static {v0}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 71
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "DocumentBuilderFactory is: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V
    :try_end_0
    .catch Ljavax/xml/parsers/FactoryConfigurationError; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v0, 0x1

    .line 72
    :try_start_1
    invoke-virtual {p2, v0}, Ljavax/xml/parsers/DocumentBuilderFactory;->setValidating(Z)V

    .line 73
    invoke-virtual {p2}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;

    move-result-object p2

    .line 74
    new-instance v0, Lorg/apache/log4j/xml/SAXErrorHandler;

    invoke-direct {v0}, Lorg/apache/log4j/xml/SAXErrorHandler;-><init>()V

    invoke-virtual {p2, v0}, Ljavax/xml/parsers/DocumentBuilder;->setErrorHandler(Lorg/xml/sax/ErrorHandler;)V

    .line 75
    new-instance v0, Lorg/apache/log4j/xml/Log4jEntityResolver;

    invoke-direct {v0}, Lorg/apache/log4j/xml/Log4jEntityResolver;-><init>()V

    invoke-virtual {p2, v0}, Ljavax/xml/parsers/DocumentBuilder;->setEntityResolver(Lorg/xml/sax/EntityResolver;)V

    .line 76
    invoke-interface {p1, p2}, Lorg/apache/log4j/xml/DOMConfigurator$a;->a(Ljavax/xml/parsers/DocumentBuilder;)Lorg/w3c/dom/Document;

    move-result-object p2

    .line 77
    invoke-interface {p2}, Lorg/w3c/dom/Document;->getDocumentElement()Lorg/w3c/dom/Element;

    move-result-object p2

    invoke-virtual {p0, p2}, Lorg/apache/log4j/xml/DOMConfigurator;->b(Lorg/w3c/dom/Element;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 78
    instance-of v0, p2, Ljava/lang/InterruptedException;

    if-nez v0, :cond_0

    instance-of v0, p2, Ljava/io/InterruptedIOException;

    if-eqz v0, :cond_1

    .line 79
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 80
    :cond_1
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "Could not parse "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, "."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void

    :catch_1
    move-exception p1

    .line 81
    invoke-virtual {p1}, Ljavax/xml/parsers/FactoryConfigurationError;->getException()Ljava/lang/Exception;

    move-result-object p2

    const-string v0, "Could not instantiate a DocumentBuilderFactory."

    .line 82
    invoke-static {v0, p2}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 83
    throw p1
.end method

.method public a(Lorg/w3c/dom/Element;Lorg/apache/log4j/Appender;)V
    .locals 7

    const-string v0, "class"

    .line 18
    invoke-interface {p1, v0}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lorg/apache/log4j/xml/DOMConfigurator;->g:Ljava/lang/Class;

    if-nez v1, :cond_0

    const-string v1, "org.apache.log4j.spi.ErrorHandler"

    invoke-static {v1}, Lorg/apache/log4j/xml/DOMConfigurator;->b(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, Lorg/apache/log4j/xml/DOMConfigurator;->g:Ljava/lang/Class;

    :cond_0
    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lorg/apache/log4j/helpers/OptionConverter;->instantiateByClassName(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/log4j/spi/ErrorHandler;

    if-eqz v0, :cond_8

    .line 19
    invoke-interface {v0, p2}, Lorg/apache/log4j/spi/ErrorHandler;->setAppender(Lorg/apache/log4j/Appender;)V

    .line 20
    new-instance v1, Lorg/apache/log4j/config/PropertySetter;

    invoke-direct {v1, v0}, Lorg/apache/log4j/config/PropertySetter;-><init>(Ljava/lang/Object;)V

    .line 21
    invoke-interface {p1}, Lorg/w3c/dom/Element;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object p1

    .line 22
    invoke-interface {p1}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_7

    .line 23
    invoke-interface {p1, v3}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v4

    .line 24
    invoke-interface {v4}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_6

    .line 25
    check-cast v4, Lorg/w3c/dom/Element;

    .line 26
    invoke-interface {v4}, Lorg/w3c/dom/Element;->getTagName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "param"

    .line 27
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 28
    invoke-virtual {p0, v4, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;Lorg/apache/log4j/config/PropertySetter;)V

    goto :goto_2

    :cond_1
    const-string v6, "appender-ref"

    .line 29
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 30
    invoke-virtual {p0, v4}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;)Lorg/apache/log4j/Appender;

    move-result-object v4

    invoke-interface {v0, v4}, Lorg/apache/log4j/spi/ErrorHandler;->setBackupAppender(Lorg/apache/log4j/Appender;)V

    goto :goto_2

    :cond_2
    const-string v6, "logger-ref"

    .line 31
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const-string v5, "ref"

    .line 32
    invoke-interface {v4, v5}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 33
    iget-object v5, p0, Lorg/apache/log4j/xml/DOMConfigurator;->d:Lorg/apache/log4j/spi/LoggerFactory;

    if-nez v5, :cond_3

    iget-object v5, p0, Lorg/apache/log4j/xml/DOMConfigurator;->c:Lorg/apache/log4j/spi/LoggerRepository;

    invoke-interface {v5, v4}, Lorg/apache/log4j/spi/LoggerRepository;->getLogger(Ljava/lang/String;)Lorg/apache/log4j/Logger;

    move-result-object v4

    goto :goto_1

    :cond_3
    iget-object v6, p0, Lorg/apache/log4j/xml/DOMConfigurator;->c:Lorg/apache/log4j/spi/LoggerRepository;

    invoke-interface {v6, v4, v5}, Lorg/apache/log4j/spi/LoggerRepository;->getLogger(Ljava/lang/String;Lorg/apache/log4j/spi/LoggerFactory;)Lorg/apache/log4j/Logger;

    move-result-object v4

    .line 34
    :goto_1
    invoke-interface {v0, v4}, Lorg/apache/log4j/spi/ErrorHandler;->setLogger(Lorg/apache/log4j/Logger;)V

    goto :goto_2

    :cond_4
    const-string v6, "root-ref"

    .line 35
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 36
    iget-object v4, p0, Lorg/apache/log4j/xml/DOMConfigurator;->c:Lorg/apache/log4j/spi/LoggerRepository;

    invoke-interface {v4}, Lorg/apache/log4j/spi/LoggerRepository;->getRootLogger()Lorg/apache/log4j/Logger;

    move-result-object v4

    .line 37
    invoke-interface {v0, v4}, Lorg/apache/log4j/spi/ErrorHandler;->setLogger(Lorg/apache/log4j/Logger;)V

    goto :goto_2

    .line 38
    :cond_5
    iget-object v5, p0, Lorg/apache/log4j/xml/DOMConfigurator;->b:Ljava/util/Properties;

    invoke-static {v0, v4, v5}, Lorg/apache/log4j/xml/DOMConfigurator;->b(Ljava/lang/Object;Lorg/w3c/dom/Element;Ljava/util/Properties;)V

    :cond_6
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 39
    :cond_7
    invoke-virtual {v1}, Lorg/apache/log4j/config/PropertySetter;->activate()V

    .line 40
    invoke-interface {p2, v0}, Lorg/apache/log4j/Appender;->setErrorHandler(Lorg/apache/log4j/spi/ErrorHandler;)V

    :cond_8
    return-void
.end method

.method public a(Lorg/w3c/dom/Element;Lorg/apache/log4j/Logger;Z)V
    .locals 7

    .line 41
    new-instance v0, Lorg/apache/log4j/config/PropertySetter;

    invoke-direct {v0, p2}, Lorg/apache/log4j/config/PropertySetter;-><init>(Ljava/lang/Object;)V

    .line 42
    invoke-virtual {p2}, Lorg/apache/log4j/Category;->removeAllAppenders()V

    .line 43
    invoke-interface {p1}, Lorg/w3c/dom/Element;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object p1

    .line 44
    invoke-interface {p1}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_6

    .line 45
    invoke-interface {p1, v2}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v3

    .line 46
    invoke-interface {v3}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_5

    .line 47
    check-cast v3, Lorg/w3c/dom/Element;

    .line 48
    invoke-interface {v3}, Lorg/w3c/dom/Element;->getTagName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "appender-ref"

    .line 49
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 50
    invoke-virtual {p0, v3}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;)Lorg/apache/log4j/Appender;

    move-result-object v4

    const-string v5, "ref"

    .line 51
    invoke-interface {v3, v5}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v4, :cond_0

    .line 52
    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    const-string v6, "Adding appender named ["

    invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v3, "] to category ["

    invoke-virtual {v5, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p2}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v3, "]."

    invoke-virtual {v5, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    goto :goto_1

    .line 53
    :cond_0
    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    const-string v6, "Appender named ["

    invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v3, "] not found."

    invoke-virtual {v5, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 54
    :goto_1
    invoke-virtual {p2, v4}, Lorg/apache/log4j/Category;->addAppender(Lorg/apache/log4j/Appender;)V

    goto :goto_2

    :cond_1
    const-string v5, "level"

    .line 55
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 56
    invoke-virtual {p0, v3, p2, p3}, Lorg/apache/log4j/xml/DOMConfigurator;->b(Lorg/w3c/dom/Element;Lorg/apache/log4j/Logger;Z)V

    goto :goto_2

    :cond_2
    const-string v5, "priority"

    .line 57
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 58
    invoke-virtual {p0, v3, p2, p3}, Lorg/apache/log4j/xml/DOMConfigurator;->b(Lorg/w3c/dom/Element;Lorg/apache/log4j/Logger;Z)V

    goto :goto_2

    :cond_3
    const-string v5, "param"

    .line 59
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 60
    invoke-virtual {p0, v3, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;Lorg/apache/log4j/config/PropertySetter;)V

    goto :goto_2

    .line 61
    :cond_4
    iget-object v4, p0, Lorg/apache/log4j/xml/DOMConfigurator;->b:Ljava/util/Properties;

    invoke-static {p2, v3, v4}, Lorg/apache/log4j/xml/DOMConfigurator;->b(Ljava/lang/Object;Lorg/w3c/dom/Element;Ljava/util/Properties;)V

    :cond_5
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 62
    :cond_6
    invoke-virtual {v0}, Lorg/apache/log4j/config/PropertySetter;->activate()V

    return-void
.end method

.method public a(Lorg/w3c/dom/Element;Lorg/apache/log4j/config/PropertySetter;)V
    .locals 2

    const-string v0, "name"

    .line 63
    invoke-interface {p1, v0}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "value"

    .line 64
    invoke-interface {p1, v1}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 65
    invoke-static {p1}, Lorg/apache/log4j/helpers/OptionConverter;->convertSpecialChars(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 66
    invoke-virtual {p2, v0, p1}, Lorg/apache/log4j/config/PropertySetter;->setProperty(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b(Lorg/w3c/dom/Element;)V
    .locals 8

    .line 39
    invoke-interface {p1}, Lorg/w3c/dom/Element;->getTagName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "log4j:configuration"

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "configuration"

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "The <configuration> element has been deprecated."

    .line 42
    invoke-static {v0}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;)V

    const-string v0, "Use the <log4j:configuration> element instead."

    .line 43
    invoke-static {v0}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p1, "DOM element is - not a <log4j:configuration> element."

    .line 44
    invoke-static {p1}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    const-string v0, "debug"

    .line 45
    invoke-interface {p1, v0}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 46
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "debug attribute= \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, "\"."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    const-string v1, ""

    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "null"

    const/4 v5, 0x1

    if-nez v3, :cond_2

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 48
    invoke-static {v0, v5}, Lorg/apache/log4j/helpers/OptionConverter;->toBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Lorg/apache/log4j/helpers/LogLog;->setInternalDebugging(Z)V

    goto :goto_1

    :cond_2
    const-string v0, "Ignoring debug attribute."

    .line 49
    invoke-static {v0}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    :goto_1
    const-string v0, "reset"

    .line 50
    invoke-interface {p1, v0}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 51
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    const-string v6, "reset attribute= \""

    invoke-virtual {v3, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 52
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v6, 0x0

    if-nez v3, :cond_3

    .line 53
    invoke-static {v0, v6}, Lorg/apache/log4j/helpers/OptionConverter;->toBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 54
    iget-object v0, p0, Lorg/apache/log4j/xml/DOMConfigurator;->c:Lorg/apache/log4j/spi/LoggerRepository;

    invoke-interface {v0}, Lorg/apache/log4j/spi/LoggerRepository;->resetConfiguration()V

    :cond_3
    const-string v0, "configDebug"

    .line 55
    invoke-interface {p1, v0}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, "The \"configDebug\" attribute is deprecated."

    .line 57
    invoke-static {v3}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;)V

    const-string v3, "Use the \"debug\" attribute instead."

    .line 58
    invoke-static {v3}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;)V

    .line 59
    invoke-static {v0, v5}, Lorg/apache/log4j/helpers/OptionConverter;->toBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Lorg/apache/log4j/helpers/LogLog;->setInternalDebugging(Z)V

    :cond_4
    const-string v0, "threshold"

    .line 60
    invoke-interface {p1, v0}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 61
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    const-string v7, "Threshold =\""

    invoke-virtual {v3, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 62
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 63
    iget-object v1, p0, Lorg/apache/log4j/xml/DOMConfigurator;->c:Lorg/apache/log4j/spi/LoggerRepository;

    invoke-interface {v1, v0}, Lorg/apache/log4j/spi/LoggerRepository;->setThreshold(Ljava/lang/String;)V

    .line 64
    :cond_5
    invoke-interface {p1}, Lorg/w3c/dom/Element;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object p1

    .line 65
    invoke-interface {p1}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v0

    const/4 v1, 0x0

    :goto_2
    const-string v2, "loggerFactory"

    const-string v3, "categoryFactory"

    if-ge v1, v0, :cond_8

    .line 66
    invoke-interface {p1, v1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v4

    .line 67
    invoke-interface {v4}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v7

    if-ne v7, v5, :cond_7

    .line 68
    check-cast v4, Lorg/w3c/dom/Element;

    .line 69
    invoke-interface {v4}, Lorg/w3c/dom/Element;->getTagName()Ljava/lang/String;

    move-result-object v7

    .line 70
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 71
    :cond_6
    invoke-virtual {p0, v4}, Lorg/apache/log4j/xml/DOMConfigurator;->e(Lorg/w3c/dom/Element;)V

    :cond_7
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_8
    :goto_3
    if-ge v6, v0, :cond_f

    .line 72
    invoke-interface {p1, v6}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v1

    .line 73
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v4

    if-ne v4, v5, :cond_e

    .line 74
    check-cast v1, Lorg/w3c/dom/Element;

    .line 75
    invoke-interface {v1}, Lorg/w3c/dom/Element;->getTagName()Ljava/lang/String;

    move-result-object v4

    const-string v7, "category"

    .line 76
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    const-string v7, "logger"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    goto :goto_4

    :cond_9
    const-string v7, "root"

    .line 77
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    .line 78
    invoke-virtual {p0, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->h(Lorg/w3c/dom/Element;)V

    goto :goto_5

    :cond_a
    const-string v7, "renderer"

    .line 79
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    .line 80
    invoke-virtual {p0, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->g(Lorg/w3c/dom/Element;)V

    goto :goto_5

    :cond_b
    const-string v7, "throwableRenderer"

    .line 81
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    .line 82
    iget-object v4, p0, Lorg/apache/log4j/xml/DOMConfigurator;->c:Lorg/apache/log4j/spi/LoggerRepository;

    instance-of v4, v4, Lorg/apache/log4j/spi/ThrowableRendererSupport;

    if-eqz v4, :cond_e

    .line 83
    invoke-virtual {p0, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->i(Lorg/w3c/dom/Element;)Lorg/apache/log4j/spi/ThrowableRenderer;

    move-result-object v1

    if-eqz v1, :cond_e

    .line 84
    iget-object v4, p0, Lorg/apache/log4j/xml/DOMConfigurator;->c:Lorg/apache/log4j/spi/LoggerRepository;

    check-cast v4, Lorg/apache/log4j/spi/ThrowableRendererSupport;

    invoke-interface {v4, v1}, Lorg/apache/log4j/spi/ThrowableRendererSupport;->setThrowableRenderer(Lorg/apache/log4j/spi/ThrowableRenderer;)V

    goto :goto_5

    :cond_c
    const-string v7, "appender"

    .line 85
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_e

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_e

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    .line 86
    iget-object v4, p0, Lorg/apache/log4j/xml/DOMConfigurator;->c:Lorg/apache/log4j/spi/LoggerRepository;

    iget-object v7, p0, Lorg/apache/log4j/xml/DOMConfigurator;->b:Ljava/util/Properties;

    invoke-static {v4, v1, v7}, Lorg/apache/log4j/xml/DOMConfigurator;->b(Ljava/lang/Object;Lorg/w3c/dom/Element;Ljava/util/Properties;)V

    goto :goto_5

    .line 87
    :cond_d
    :goto_4
    invoke-virtual {p0, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->d(Lorg/w3c/dom/Element;)V

    :cond_e
    :goto_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_f
    return-void
.end method

.method public b(Lorg/w3c/dom/Element;Lorg/apache/log4j/Appender;)V
    .locals 7

    const-string v0, "class"

    .line 6
    invoke-interface {p1, v0}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 7
    sget-object v1, Lorg/apache/log4j/xml/DOMConfigurator;->h:Ljava/lang/Class;

    if-nez v1, :cond_0

    const-string v1, "org.apache.log4j.spi.Filter"

    invoke-static {v1}, Lorg/apache/log4j/xml/DOMConfigurator;->b(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, Lorg/apache/log4j/xml/DOMConfigurator;->h:Ljava/lang/Class;

    :cond_0
    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lorg/apache/log4j/helpers/OptionConverter;->instantiateByClassName(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/log4j/spi/Filter;

    if-eqz v0, :cond_4

    .line 8
    new-instance v1, Lorg/apache/log4j/config/PropertySetter;

    invoke-direct {v1, v0}, Lorg/apache/log4j/config/PropertySetter;-><init>(Ljava/lang/Object;)V

    .line 9
    invoke-interface {p1}, Lorg/w3c/dom/Element;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object p1

    .line 10
    invoke-interface {p1}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    .line 11
    invoke-interface {p1, v3}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v4

    .line 12
    invoke-interface {v4}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_2

    .line 13
    check-cast v4, Lorg/w3c/dom/Element;

    .line 14
    invoke-interface {v4}, Lorg/w3c/dom/Element;->getTagName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "param"

    .line 15
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 16
    invoke-virtual {p0, v4, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;Lorg/apache/log4j/config/PropertySetter;)V

    goto :goto_1

    .line 17
    :cond_1
    iget-object v5, p0, Lorg/apache/log4j/xml/DOMConfigurator;->b:Ljava/util/Properties;

    invoke-static {v0, v4, v5}, Lorg/apache/log4j/xml/DOMConfigurator;->b(Ljava/lang/Object;Lorg/w3c/dom/Element;Ljava/util/Properties;)V

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 18
    :cond_3
    invoke-virtual {v1}, Lorg/apache/log4j/config/PropertySetter;->activate()V

    .line 19
    new-instance p1, Ljava/lang/StringBuffer;

    invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "Adding filter of type ["

    invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    const-string v1, "] to appender named ["

    invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {p2}, Lorg/apache/log4j/Appender;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, "]."

    invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 20
    invoke-interface {p2, v0}, Lorg/apache/log4j/Appender;->addFilter(Lorg/apache/log4j/spi/Filter;)V

    :cond_4
    return-void
.end method

.method public b(Lorg/w3c/dom/Element;Lorg/apache/log4j/Logger;Z)V
    .locals 4

    .line 21
    invoke-virtual {p2}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;

    move-result-object v0

    if-eqz p3, :cond_0

    const-string v0, "root"

    :cond_0
    const-string v1, "value"

    .line 22
    invoke-interface {p1, v1}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 23
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "Level value for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v3, " is  ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v3, "]."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    const-string v2, "inherited"

    .line 24
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_5

    const-string v2, "null"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_0

    :cond_1
    const-string p3, "class"

    .line 25
    invoke-interface {p1, p3}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p3, ""

    .line 26
    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    .line 27
    sget-object p1, Lorg/apache/log4j/Level;->DEBUG:Lorg/apache/log4j/Level;

    invoke-static {v1, p1}, Lorg/apache/log4j/helpers/OptionConverter;->toLevel(Ljava/lang/String;Lorg/apache/log4j/Level;)Lorg/apache/log4j/Level;

    move-result-object p1

    invoke-virtual {p2, p1}, Lorg/apache/log4j/Category;->setLevel(Lorg/apache/log4j/Level;)V

    goto :goto_1

    .line 28
    :cond_2
    new-instance p3, Ljava/lang/StringBuffer;

    invoke-direct {p3}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Desired Level sub-class: ["

    invoke-virtual {p3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/16 v2, 0x5d

    invoke-virtual {p3, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {p3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 29
    :try_start_0
    invoke-static {p1}, Lorg/apache/log4j/helpers/Loader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const-string p3, "toLevel"

    .line 30
    sget-object v2, Lorg/apache/log4j/xml/DOMConfigurator;->e:[Ljava/lang/Class;

    invoke-virtual {p1, p3, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    const/4 p3, 0x1

    new-array p3, p3, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v1, p3, v2

    .line 31
    invoke-virtual {p1, v3, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/apache/log4j/Level;

    .line 32
    invoke-virtual {p2, p1}, Lorg/apache/log4j/Category;->setLevel(Lorg/apache/log4j/Level;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 33
    instance-of p2, p1, Ljava/lang/InterruptedException;

    if-nez p2, :cond_3

    instance-of p2, p1, Ljava/io/InterruptedIOException;

    if-eqz p2, :cond_4

    .line 34
    :cond_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V

    .line 35
    :cond_4
    new-instance p2, Ljava/lang/StringBuffer;

    invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V

    const-string p3, "Could not create level ["

    invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p3, "]. Reported error follows."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_5
    :goto_0
    if-eqz p3, :cond_6

    const-string p1, "Root level cannot be inherited. Ignoring directive."

    .line 36
    invoke-static {p1}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;)V

    goto :goto_1

    .line 37
    :cond_6
    invoke-virtual {p2, v3}, Lorg/apache/log4j/Category;->setLevel(Lorg/apache/log4j/Level;)V

    .line 38
    :goto_1
    new-instance p1, Ljava/lang/StringBuffer;

    invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p3, " level set to "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p2}, Lorg/apache/log4j/Category;->getLevel()Lorg/apache/log4j/Level;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    return-void
.end method

.method public c(Lorg/w3c/dom/Element;)Lorg/apache/log4j/Appender;
    .locals 11

    const-string v0, "class"

    .line 1
    invoke-interface {p1, v0}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Class name: ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/16 v2, 0x5d

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 3
    :try_start_0
    invoke-static {v0}, Lorg/apache/log4j/helpers/Loader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    .line 4
    move-object v1, v0

    check-cast v1, Lorg/apache/log4j/Appender;

    .line 5
    new-instance v2, Lorg/apache/log4j/config/PropertySetter;

    invoke-direct {v2, v1}, Lorg/apache/log4j/config/PropertySetter;-><init>(Ljava/lang/Object;)V

    const-string v3, "name"

    .line 6
    invoke-interface {p1, v3}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Lorg/apache/log4j/Appender;->setName(Ljava/lang/String;)V

    .line 7
    invoke-interface {p1}, Lorg/w3c/dom/Element;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object p1

    .line 8
    invoke-interface {p1}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_7

    .line 9
    invoke-interface {p1, v4}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v5

    .line 10
    invoke-interface {v5}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v6

    const/4 v7, 0x1

    if-ne v6, v7, :cond_6

    .line 11
    check-cast v5, Lorg/w3c/dom/Element;

    .line 12
    invoke-interface {v5}, Lorg/w3c/dom/Element;->getTagName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "param"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 13
    invoke-virtual {p0, v5, v2}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;Lorg/apache/log4j/config/PropertySetter;)V

    goto/16 :goto_1

    .line 14
    :cond_0
    invoke-interface {v5}, Lorg/w3c/dom/Element;->getTagName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "layout"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 15
    invoke-virtual {p0, v5}, Lorg/apache/log4j/xml/DOMConfigurator;->f(Lorg/w3c/dom/Element;)Lorg/apache/log4j/Layout;

    move-result-object v5

    invoke-interface {v1, v5}, Lorg/apache/log4j/Appender;->setLayout(Lorg/apache/log4j/Layout;)V

    goto/16 :goto_1

    .line 16
    :cond_1
    invoke-interface {v5}, Lorg/w3c/dom/Element;->getTagName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "filter"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 17
    invoke-virtual {p0, v5, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->b(Lorg/w3c/dom/Element;Lorg/apache/log4j/Appender;)V

    goto/16 :goto_1

    .line 18
    :cond_2
    invoke-interface {v5}, Lorg/w3c/dom/Element;->getTagName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "errorHandler"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 19
    invoke-virtual {p0, v5, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;Lorg/apache/log4j/Appender;)V

    goto :goto_1

    .line 20
    :cond_3
    invoke-interface {v5}, Lorg/w3c/dom/Element;->getTagName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "appender-ref"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const-string v6, "ref"

    .line 21
    invoke-interface {v5, v6}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 22
    instance-of v7, v1, Lorg/apache/log4j/spi/AppenderAttachable;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v8, "] to appender named ["

    if-eqz v7, :cond_4

    .line 23
    :try_start_1
    move-object v7, v1

    check-cast v7, Lorg/apache/log4j/spi/AppenderAttachable;

    .line 24
    new-instance v9, Ljava/lang/StringBuffer;

    invoke-direct {v9}, Ljava/lang/StringBuffer;-><init>()V

    const-string v10, "Attaching appender named ["

    invoke-virtual {v9, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {v1}, Lorg/apache/log4j/Appender;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v9, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v6, "]."

    invoke-virtual {v9, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 25
    invoke-virtual {p0, v5}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;)Lorg/apache/log4j/Appender;

    move-result-object v5

    invoke-interface {v7, v5}, Lorg/apache/log4j/spi/AppenderAttachable;->addAppender(Lorg/apache/log4j/Appender;)V

    goto :goto_1

    .line 26
    :cond_4
    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    const-string v7, "Requesting attachment of appender named ["

    invoke-virtual {v5, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {v1}, Lorg/apache/log4j/Appender;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v6, "] which does not implement org.apache.log4j.spi.AppenderAttachable."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;)V

    goto :goto_1

    .line 27
    :cond_5
    iget-object v6, p0, Lorg/apache/log4j/xml/DOMConfigurator;->b:Ljava/util/Properties;

    invoke-static {v0, v5, v6}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/Object;Lorg/w3c/dom/Element;Ljava/util/Properties;)V

    :cond_6
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 28
    :cond_7
    invoke-virtual {v2}, Lorg/apache/log4j/config/PropertySetter;->activate()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v1

    :catch_0
    move-exception p1

    .line 29
    instance-of v0, p1, Ljava/lang/InterruptedException;

    if-nez v0, :cond_8

    instance-of v0, p1, Ljava/io/InterruptedIOException;

    if-eqz v0, :cond_9

    .line 30
    :cond_8
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_9
    const-string v0, "Could not create an Appender. Reported error follows."

    .line 31
    invoke-static {v0, p1}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public d(Lorg/w3c/dom/Element;)V
    .locals 6

    const-string v0, "name"

    .line 1
    invoke-interface {p1, v0}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "class"

    .line 2
    invoke-interface {p1, v1}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    .line 3
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    const-string v1, "Retreiving an instance of org.apache.log4j.Logger."

    .line 4
    invoke-static {v1}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Lorg/apache/log4j/xml/DOMConfigurator;->d:Lorg/apache/log4j/spi/LoggerFactory;

    if-nez v1, :cond_0

    iget-object v1, p0, Lorg/apache/log4j/xml/DOMConfigurator;->c:Lorg/apache/log4j/spi/LoggerRepository;

    invoke-interface {v1, v0}, Lorg/apache/log4j/spi/LoggerRepository;->getLogger(Ljava/lang/String;)Lorg/apache/log4j/Logger;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lorg/apache/log4j/xml/DOMConfigurator;->c:Lorg/apache/log4j/spi/LoggerRepository;

    invoke-interface {v2, v0, v1}, Lorg/apache/log4j/spi/LoggerRepository;->getLogger(Ljava/lang/String;Lorg/apache/log4j/spi/LoggerFactory;)Lorg/apache/log4j/Logger;

    move-result-object v0

    :goto_0
    move-object v1, v0

    goto :goto_1

    .line 6
    :cond_1
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v5, "Desired logger sub-class: ["

    invoke-virtual {v2, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/16 v5, 0x5d

    invoke-virtual {v2, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 7
    :try_start_0
    invoke-static {v1}, Lorg/apache/log4j/helpers/Loader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getLogger"

    .line 8
    sget-object v5, Lorg/apache/log4j/xml/DOMConfigurator;->e:[Ljava/lang/Class;

    invoke-virtual {v1, v2, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v2, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    aput-object v0, v5, v3

    .line 9
    invoke-virtual {v1, v2, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/log4j/Logger;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    :goto_1
    monitor-enter v1

    :try_start_1
    const-string v0, "additivity"

    .line 11
    invoke-interface {p1, v0}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lorg/apache/log4j/helpers/OptionConverter;->toBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 12
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v4, "Setting ["

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v4, "] additivity to ["

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;

    const-string v4, "]."

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 13
    invoke-virtual {v1, v0}, Lorg/apache/log4j/Category;->setAdditivity(Z)V

    .line 14
    invoke-virtual {p0, p1, v1, v3}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;Lorg/apache/log4j/Logger;Z)V

    .line 15
    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catch_0
    move-exception p1

    .line 16
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Could not retrieve category ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, "]. Reported error follows."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :catch_1
    move-exception p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/InterruptedException;

    if-nez v1, :cond_2

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/io/InterruptedIOException;

    if-eqz v1, :cond_3

    .line 18
    :cond_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 19
    :cond_3
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Could not retrieve category ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, "]. Reported error follows."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public doConfigure(Ljava/io/InputStream;Lorg/apache/log4j/spi/LoggerRepository;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/parsers/FactoryConfigurationError;
        }
    .end annotation

    .line 5
    new-instance v0, Lm/a/b/n/c;

    invoke-direct {v0, p0, p1}, Lm/a/b/n/c;-><init>(Lorg/apache/log4j/xml/DOMConfigurator;Ljava/io/InputStream;)V

    .line 6
    invoke-virtual {p0, v0, p2}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/apache/log4j/xml/DOMConfigurator$a;Lorg/apache/log4j/spi/LoggerRepository;)V

    return-void
.end method

.method public doConfigure(Ljava/io/Reader;Lorg/apache/log4j/spi/LoggerRepository;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/parsers/FactoryConfigurationError;
        }
    .end annotation

    .line 7
    new-instance v0, Lm/a/b/n/d;

    invoke-direct {v0, p0, p1}, Lm/a/b/n/d;-><init>(Lorg/apache/log4j/xml/DOMConfigurator;Ljava/io/Reader;)V

    .line 8
    invoke-virtual {p0, v0, p2}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/apache/log4j/xml/DOMConfigurator$a;Lorg/apache/log4j/spi/LoggerRepository;)V

    return-void
.end method

.method public doConfigure(Ljava/lang/String;Lorg/apache/log4j/spi/LoggerRepository;)V
    .locals 1

    .line 1
    new-instance v0, Lm/a/b/n/a;

    invoke-direct {v0, p0, p1}, Lm/a/b/n/a;-><init>(Lorg/apache/log4j/xml/DOMConfigurator;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, v0, p2}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/apache/log4j/xml/DOMConfigurator$a;Lorg/apache/log4j/spi/LoggerRepository;)V

    return-void
.end method

.method public doConfigure(Ljava/net/URL;Lorg/apache/log4j/spi/LoggerRepository;)V
    .locals 1

    .line 3
    new-instance v0, Lm/a/b/n/b;

    invoke-direct {v0, p0, p1}, Lm/a/b/n/b;-><init>(Lorg/apache/log4j/xml/DOMConfigurator;Ljava/net/URL;)V

    .line 4
    invoke-virtual {p0, v0, p2}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/apache/log4j/xml/DOMConfigurator$a;Lorg/apache/log4j/spi/LoggerRepository;)V

    return-void
.end method

.method public doConfigure(Lorg/w3c/dom/Element;Lorg/apache/log4j/spi/LoggerRepository;)V
    .locals 0

    .line 9
    iput-object p2, p0, Lorg/apache/log4j/xml/DOMConfigurator;->c:Lorg/apache/log4j/spi/LoggerRepository;

    .line 10
    invoke-virtual {p0, p1}, Lorg/apache/log4j/xml/DOMConfigurator;->b(Lorg/w3c/dom/Element;)V

    return-void
.end method

.method public e(Lorg/w3c/dom/Element;)V
    .locals 7

    const-string v0, "class"

    .line 1
    invoke-interface {p1, v0}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    .line 2
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p1, "Category Factory tag class attribute not found."

    .line 3
    invoke-static {p1}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;)V

    const-string p1, "No Category Factory configured."

    .line 4
    invoke-static {p1}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    goto/16 :goto_3

    .line 5
    :cond_0
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Desired category factory: ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/16 v2, 0x5d

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 6
    sget-object v1, Lorg/apache/log4j/xml/DOMConfigurator;->i:Ljava/lang/Class;

    if-nez v1, :cond_1

    const-string v1, "org.apache.log4j.spi.LoggerFactory"

    invoke-static {v1}, Lorg/apache/log4j/xml/DOMConfigurator;->b(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, Lorg/apache/log4j/xml/DOMConfigurator;->i:Ljava/lang/Class;

    :cond_1
    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lorg/apache/log4j/helpers/OptionConverter;->instantiateByClassName(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 7
    instance-of v2, v1, Lorg/apache/log4j/spi/LoggerFactory;

    if-eqz v2, :cond_2

    .line 8
    move-object v0, v1

    check-cast v0, Lorg/apache/log4j/spi/LoggerFactory;

    iput-object v0, p0, Lorg/apache/log4j/xml/DOMConfigurator;->d:Lorg/apache/log4j/spi/LoggerFactory;

    goto :goto_0

    .line 9
    :cond_2
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "Category Factory class "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, " does not implement org.apache.log4j.LoggerFactory"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;)V

    .line 10
    :goto_0
    new-instance v0, Lorg/apache/log4j/config/PropertySetter;

    invoke-direct {v0, v1}, Lorg/apache/log4j/config/PropertySetter;-><init>(Ljava/lang/Object;)V

    .line 11
    invoke-interface {p1}, Lorg/w3c/dom/Element;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object p1

    .line 12
    invoke-interface {p1}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v2

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_5

    .line 13
    invoke-interface {p1, v3}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v4

    .line 14
    invoke-interface {v4}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_4

    .line 15
    check-cast v4, Lorg/w3c/dom/Element;

    .line 16
    invoke-interface {v4}, Lorg/w3c/dom/Element;->getTagName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "param"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 17
    invoke-virtual {p0, v4, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;Lorg/apache/log4j/config/PropertySetter;)V

    goto :goto_2

    .line 18
    :cond_3
    iget-object v5, p0, Lorg/apache/log4j/xml/DOMConfigurator;->b:Ljava/util/Properties;

    invoke-static {v1, v4, v5}, Lorg/apache/log4j/xml/DOMConfigurator;->b(Ljava/lang/Object;Lorg/w3c/dom/Element;Ljava/util/Properties;)V

    :cond_4
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    :goto_3
    return-void
.end method

.method public f(Lorg/w3c/dom/Element;)Lorg/apache/log4j/Layout;
    .locals 8

    const-string v0, "class"

    .line 1
    invoke-interface {p1, v0}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Parsing layout of class: \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, "\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 3
    :try_start_0
    invoke-static {v0}, Lorg/apache/log4j/helpers/Loader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    .line 4
    move-object v1, v0

    check-cast v1, Lorg/apache/log4j/Layout;

    .line 5
    new-instance v2, Lorg/apache/log4j/config/PropertySetter;

    invoke-direct {v2, v1}, Lorg/apache/log4j/config/PropertySetter;-><init>(Ljava/lang/Object;)V

    .line 6
    invoke-interface {p1}, Lorg/w3c/dom/Element;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object p1

    .line 7
    invoke-interface {p1}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    .line 8
    invoke-interface {p1, v4}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v5

    .line 9
    invoke-interface {v5}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v6

    const/4 v7, 0x1

    if-ne v6, v7, :cond_1

    .line 10
    check-cast v5, Lorg/w3c/dom/Element;

    .line 11
    invoke-interface {v5}, Lorg/w3c/dom/Element;->getTagName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "param"

    .line 12
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 13
    invoke-virtual {p0, v5, v2}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;Lorg/apache/log4j/config/PropertySetter;)V

    goto :goto_1

    .line 14
    :cond_0
    iget-object v6, p0, Lorg/apache/log4j/xml/DOMConfigurator;->b:Ljava/util/Properties;

    invoke-static {v0, v5, v6}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/Object;Lorg/w3c/dom/Element;Ljava/util/Properties;)V

    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 15
    :cond_2
    invoke-virtual {v2}, Lorg/apache/log4j/config/PropertySetter;->activate()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p1

    .line 16
    instance-of v0, p1, Ljava/lang/InterruptedException;

    if-nez v0, :cond_3

    instance-of v0, p1, Ljava/io/InterruptedIOException;

    if-eqz v0, :cond_4

    .line 17
    :cond_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_4
    const-string v0, "Could not create the Layout. Reported error follows."

    .line 18
    invoke-static {v0, p1}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public g(Lorg/w3c/dom/Element;)V
    .locals 3

    const-string v0, "renderingClass"

    .line 1
    invoke-interface {p1, v0}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "renderedClass"

    .line 2
    invoke-interface {p1, v1}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 3
    iget-object v1, p0, Lorg/apache/log4j/xml/DOMConfigurator;->c:Lorg/apache/log4j/spi/LoggerRepository;

    instance-of v2, v1, Lorg/apache/log4j/spi/RendererSupport;

    if-eqz v2, :cond_0

    .line 4
    check-cast v1, Lorg/apache/log4j/spi/RendererSupport;

    invoke-static {v1, p1, v0}, Lorg/apache/log4j/or/RendererMap;->addRenderer(Lorg/apache/log4j/spi/RendererSupport;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public h(Lorg/w3c/dom/Element;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/xml/DOMConfigurator;->c:Lorg/apache/log4j/spi/LoggerRepository;

    invoke-interface {v0}, Lorg/apache/log4j/spi/LoggerRepository;->getRootLogger()Lorg/apache/log4j/Logger;

    move-result-object v0

    .line 2
    monitor-enter v0

    const/4 v1, 0x1

    .line 3
    :try_start_0
    invoke-virtual {p0, p1, v0, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;Lorg/apache/log4j/Logger;Z)V

    .line 4
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public i(Lorg/w3c/dom/Element;)Lorg/apache/log4j/spi/ThrowableRenderer;
    .locals 8

    const-string v0, "class"

    .line 1
    invoke-interface {p1, v0}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Parsing throwableRenderer of class: \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, "\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 3
    :try_start_0
    invoke-static {v0}, Lorg/apache/log4j/helpers/Loader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    .line 4
    move-object v1, v0

    check-cast v1, Lorg/apache/log4j/spi/ThrowableRenderer;

    .line 5
    new-instance v2, Lorg/apache/log4j/config/PropertySetter;

    invoke-direct {v2, v1}, Lorg/apache/log4j/config/PropertySetter;-><init>(Ljava/lang/Object;)V

    .line 6
    invoke-interface {p1}, Lorg/w3c/dom/Element;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object p1

    .line 7
    invoke-interface {p1}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    .line 8
    invoke-interface {p1, v4}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v5

    .line 9
    invoke-interface {v5}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v6

    const/4 v7, 0x1

    if-ne v6, v7, :cond_1

    .line 10
    check-cast v5, Lorg/w3c/dom/Element;

    .line 11
    invoke-interface {v5}, Lorg/w3c/dom/Element;->getTagName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "param"

    .line 12
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 13
    invoke-virtual {p0, v5, v2}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;Lorg/apache/log4j/config/PropertySetter;)V

    goto :goto_1

    .line 14
    :cond_0
    iget-object v6, p0, Lorg/apache/log4j/xml/DOMConfigurator;->b:Ljava/util/Properties;

    invoke-static {v0, v5, v6}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/Object;Lorg/w3c/dom/Element;Ljava/util/Properties;)V

    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 15
    :cond_2
    invoke-virtual {v2}, Lorg/apache/log4j/config/PropertySetter;->activate()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p1

    .line 16
    instance-of v0, p1, Ljava/lang/InterruptedException;

    if-nez v0, :cond_3

    instance-of v0, p1, Ljava/io/InterruptedIOException;

    if-eqz v0, :cond_4

    .line 17
    :cond_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_4
    const-string v0, "Could not create the ThrowableRenderer. Reported error follows."

    .line 18
    invoke-static {v0, p1}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method
