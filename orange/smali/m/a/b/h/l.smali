.class public Lm/a/b/h/l;
.super Ljavax/swing/AbstractAction;
.source "SourceFile"


# static fields
.field public static synthetic d:Ljava/lang/Class;


# instance fields
.field public final a:Ljavax/swing/JFileChooser;

.field public final b:Lorg/xml/sax/XMLReader;

.field public final c:Lm/a/b/h/s;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lm/a/b/h/l;->d:Ljava/lang/Class;

    if-nez v0, :cond_0

    const-string v0, "org.apache.log4j.chainsaw.LoadXMLAction"

    invoke-static {v0}, Lm/a/b/h/l;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lm/a/b/h/l;->d:Ljava/lang/Class;

    :cond_0
    invoke-static {v0}, Lorg/apache/log4j/Logger;->getLogger(Ljava/lang/Class;)Lorg/apache/log4j/Logger;

    return-void
.end method

.method public constructor <init>(Ljavax/swing/JFrame;Lm/a/b/h/r;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;,
            Ljavax/xml/parsers/ParserConfigurationException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljavax/swing/AbstractAction;-><init>()V

    .line 2
    new-instance p1, Ljavax/swing/JFileChooser;

    invoke-direct {p1}, Ljavax/swing/JFileChooser;-><init>()V

    iput-object p1, p0, Lm/a/b/h/l;->a:Ljavax/swing/JFileChooser;

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p1, v0}, Ljavax/swing/JFileChooser;->setMultiSelectionEnabled(Z)V

    .line 4
    iget-object p1, p0, Lm/a/b/h/l;->a:Ljavax/swing/JFileChooser;

    invoke-virtual {p1, v0}, Ljavax/swing/JFileChooser;->setFileSelectionMode(I)V

    .line 5
    new-instance p1, Lm/a/b/h/s;

    invoke-direct {p1, p2}, Lm/a/b/h/s;-><init>(Lm/a/b/h/r;)V

    iput-object p1, p0, Lm/a/b/h/l;->c:Lm/a/b/h/s;

    .line 6
    invoke-static {}, Ljavax/xml/parsers/SAXParserFactory;->newInstance()Ljavax/xml/parsers/SAXParserFactory;

    move-result-object p1

    invoke-virtual {p1}, Ljavax/xml/parsers/SAXParserFactory;->newSAXParser()Ljavax/xml/parsers/SAXParser;

    move-result-object p1

    invoke-virtual {p1}, Ljavax/xml/parsers/SAXParser;->getXMLReader()Lorg/xml/sax/XMLReader;

    move-result-object p1

    iput-object p1, p0, Lm/a/b/h/l;->b:Lorg/xml/sax/XMLReader;

    .line 7
    iget-object p2, p0, Lm/a/b/h/l;->c:Lm/a/b/h/s;

    invoke-interface {p1, p2}, Lorg/xml/sax/XMLReader;->setContentHandler(Lorg/xml/sax/ContentHandler;)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;)Ljava/lang/Class;
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
