.class public Lorg/apache/log4j/varia/ReloadingPropertyConfigurator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/log4j/spi/Configurator;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lorg/apache/log4j/PropertyConfigurator;

    invoke-direct {v0}, Lorg/apache/log4j/PropertyConfigurator;-><init>()V

    return-void
.end method


# virtual methods
.method public doConfigure(Ljava/io/InputStream;Lorg/apache/log4j/spi/LoggerRepository;)V
    .locals 0

    return-void
.end method

.method public doConfigure(Ljava/net/URL;Lorg/apache/log4j/spi/LoggerRepository;)V
    .locals 0

    return-void
.end method
