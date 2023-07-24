.class public Lm/a/b/n/e;
.super Lorg/apache/log4j/helpers/FileWatchdog;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/log4j/helpers/FileWatchdog;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 3

    .line 1
    new-instance v0, Lorg/apache/log4j/xml/DOMConfigurator;

    invoke-direct {v0}, Lorg/apache/log4j/xml/DOMConfigurator;-><init>()V

    iget-object v1, p0, Lorg/apache/log4j/helpers/FileWatchdog;->b:Ljava/lang/String;

    invoke-static {}, Lorg/apache/log4j/LogManager;->getLoggerRepository()Lorg/apache/log4j/spi/LoggerRepository;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/apache/log4j/xml/DOMConfigurator;->doConfigure(Ljava/lang/String;Lorg/apache/log4j/spi/LoggerRepository;)V

    return-void
.end method
