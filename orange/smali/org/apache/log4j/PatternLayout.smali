.class public Lorg/apache/log4j/PatternLayout;
.super Lorg/apache/log4j/Layout;
.source "SourceFile"


# static fields
.field public static final DEFAULT_CONVERSION_PATTERN:Ljava/lang/String; = "%m%n"

.field public static final TTCC_CONVERSION_PATTERN:Ljava/lang/String; = "%r [%t] %p %c %x - %m%n"


# instance fields
.field public a:Ljava/lang/StringBuffer;

.field public b:Ljava/lang/String;

.field public c:Lorg/apache/log4j/helpers/PatternConverter;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "%m%n"

    .line 1
    invoke-direct {p0, v0}, Lorg/apache/log4j/PatternLayout;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Lorg/apache/log4j/Layout;-><init>()V

    .line 3
    new-instance v0, Ljava/lang/StringBuffer;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    iput-object v0, p0, Lorg/apache/log4j/PatternLayout;->a:Ljava/lang/StringBuffer;

    .line 4
    iput-object p1, p0, Lorg/apache/log4j/PatternLayout;->b:Ljava/lang/String;

    if-nez p1, :cond_0

    const-string p1, "%m%n"

    .line 5
    :cond_0
    invoke-virtual {p0, p1}, Lorg/apache/log4j/PatternLayout;->a(Ljava/lang/String;)Lorg/apache/log4j/helpers/PatternParser;

    move-result-object p1

    invoke-virtual {p1}, Lorg/apache/log4j/helpers/PatternParser;->parse()Lorg/apache/log4j/helpers/PatternConverter;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/log4j/PatternLayout;->c:Lorg/apache/log4j/helpers/PatternConverter;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lorg/apache/log4j/helpers/PatternParser;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/log4j/helpers/PatternParser;

    invoke-direct {v0, p1}, Lorg/apache/log4j/helpers/PatternParser;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public activateOptions()V
    .locals 0

    return-void
.end method

.method public format(Lorg/apache/log4j/spi/LoggingEvent;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/PatternLayout;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->capacity()I

    move-result v0

    const/16 v1, 0x400

    if-le v0, v1, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuffer;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    iput-object v0, p0, Lorg/apache/log4j/PatternLayout;->a:Ljava/lang/StringBuffer;

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lorg/apache/log4j/PatternLayout;->a:Ljava/lang/StringBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 4
    :goto_0
    iget-object v0, p0, Lorg/apache/log4j/PatternLayout;->c:Lorg/apache/log4j/helpers/PatternConverter;

    :goto_1
    if-eqz v0, :cond_1

    .line 5
    iget-object v1, p0, Lorg/apache/log4j/PatternLayout;->a:Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1, p1}, Lorg/apache/log4j/helpers/PatternConverter;->format(Ljava/lang/StringBuffer;Lorg/apache/log4j/spi/LoggingEvent;)V

    .line 6
    iget-object v0, v0, Lorg/apache/log4j/helpers/PatternConverter;->next:Lorg/apache/log4j/helpers/PatternConverter;

    goto :goto_1

    .line 7
    :cond_1
    iget-object p1, p0, Lorg/apache/log4j/PatternLayout;->a:Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getConversionPattern()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/PatternLayout;->b:Ljava/lang/String;

    return-object v0
.end method

.method public ignoresThrowable()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public setConversionPattern(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/PatternLayout;->b:Ljava/lang/String;

    .line 2
    invoke-virtual {p0, p1}, Lorg/apache/log4j/PatternLayout;->a(Ljava/lang/String;)Lorg/apache/log4j/helpers/PatternParser;

    move-result-object p1

    invoke-virtual {p1}, Lorg/apache/log4j/helpers/PatternParser;->parse()Lorg/apache/log4j/helpers/PatternConverter;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/log4j/PatternLayout;->c:Lorg/apache/log4j/helpers/PatternConverter;

    return-void
.end method
