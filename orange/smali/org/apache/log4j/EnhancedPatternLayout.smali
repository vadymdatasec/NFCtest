.class public Lorg/apache/log4j/EnhancedPatternLayout;
.super Lorg/apache/log4j/Layout;
.source "SourceFile"


# static fields
.field public static final DEFAULT_CONVERSION_PATTERN:Ljava/lang/String; = "%m%n"

.field public static final PATTERN_RULE_REGISTRY:Ljava/lang/String; = "PATTERN_RULE_REGISTRY"

.field public static final TTCC_CONVERSION_PATTERN:Ljava/lang/String; = "%r [%t] %p %c %x - %m%n"


# instance fields
.field public a:Lorg/apache/log4j/helpers/PatternConverter;

.field public b:Ljava/lang/String;

.field public c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "%m%n"

    .line 1
    invoke-direct {p0, v0}, Lorg/apache/log4j/EnhancedPatternLayout;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lorg/apache/log4j/Layout;-><init>()V

    .line 3
    iput-object p1, p0, Lorg/apache/log4j/EnhancedPatternLayout;->b:Ljava/lang/String;

    if-nez p1, :cond_0

    const-string p1, "%m%n"

    .line 4
    :cond_0
    invoke-virtual {p0, p1}, Lorg/apache/log4j/EnhancedPatternLayout;->a(Ljava/lang/String;)Lorg/apache/log4j/helpers/PatternParser;

    move-result-object p1

    invoke-virtual {p1}, Lorg/apache/log4j/helpers/PatternParser;->parse()Lorg/apache/log4j/helpers/PatternConverter;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/log4j/EnhancedPatternLayout;->a:Lorg/apache/log4j/helpers/PatternConverter;

    .line 5
    instance-of v0, p1, Lorg/apache/log4j/pattern/BridgePatternConverter;

    if-eqz v0, :cond_1

    .line 6
    check-cast p1, Lorg/apache/log4j/pattern/BridgePatternConverter;

    invoke-virtual {p1}, Lorg/apache/log4j/pattern/BridgePatternConverter;->ignoresThrowable()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lorg/apache/log4j/EnhancedPatternLayout;->c:Z

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lorg/apache/log4j/EnhancedPatternLayout;->c:Z

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lorg/apache/log4j/helpers/PatternParser;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/log4j/pattern/BridgePatternParser;

    invoke-direct {v0, p1}, Lorg/apache/log4j/pattern/BridgePatternParser;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public activateOptions()V
    .locals 0

    return-void
.end method

.method public format(Lorg/apache/log4j/spi/LoggingEvent;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 2
    iget-object v1, p0, Lorg/apache/log4j/EnhancedPatternLayout;->a:Lorg/apache/log4j/helpers/PatternConverter;

    :goto_0
    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1, v0, p1}, Lorg/apache/log4j/helpers/PatternConverter;->format(Ljava/lang/StringBuffer;Lorg/apache/log4j/spi/LoggingEvent;)V

    .line 4
    iget-object v1, v1, Lorg/apache/log4j/helpers/PatternConverter;->next:Lorg/apache/log4j/helpers/PatternConverter;

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getConversionPattern()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/EnhancedPatternLayout;->b:Ljava/lang/String;

    return-object v0
.end method

.method public ignoresThrowable()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/EnhancedPatternLayout;->c:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public setConversionPattern(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lorg/apache/log4j/helpers/OptionConverter;->convertSpecialChars(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/log4j/EnhancedPatternLayout;->b:Ljava/lang/String;

    .line 2
    invoke-virtual {p0, p1}, Lorg/apache/log4j/EnhancedPatternLayout;->a(Ljava/lang/String;)Lorg/apache/log4j/helpers/PatternParser;

    move-result-object p1

    invoke-virtual {p1}, Lorg/apache/log4j/helpers/PatternParser;->parse()Lorg/apache/log4j/helpers/PatternConverter;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/log4j/EnhancedPatternLayout;->a:Lorg/apache/log4j/helpers/PatternConverter;

    .line 3
    instance-of v0, p1, Lorg/apache/log4j/pattern/BridgePatternConverter;

    if-eqz v0, :cond_0

    .line 4
    check-cast p1, Lorg/apache/log4j/pattern/BridgePatternConverter;

    invoke-virtual {p1}, Lorg/apache/log4j/pattern/BridgePatternConverter;->ignoresThrowable()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lorg/apache/log4j/EnhancedPatternLayout;->c:Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lorg/apache/log4j/EnhancedPatternLayout;->c:Z

    :goto_0
    return-void
.end method
