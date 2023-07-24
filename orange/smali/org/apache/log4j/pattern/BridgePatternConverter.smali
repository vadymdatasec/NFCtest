.class public final Lorg/apache/log4j/pattern/BridgePatternConverter;
.super Lorg/apache/log4j/helpers/PatternConverter;
.source "SourceFile"


# instance fields
.field public e:[Lorg/apache/log4j/pattern/LoggingEventPatternConverter;

.field public f:[Lorg/apache/log4j/pattern/FormattingInfo;

.field public g:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lorg/apache/log4j/helpers/PatternConverter;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lorg/apache/log4j/helpers/PatternConverter;->next:Lorg/apache/log4j/helpers/PatternConverter;

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, p0, Lorg/apache/log4j/pattern/BridgePatternConverter;->g:Z

    .line 4
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 5
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 6
    invoke-static {}, Lorg/apache/log4j/pattern/PatternParser;->getPatternLayoutRules()Ljava/util/Map;

    move-result-object v4

    invoke-static {p1, v2, v3, v0, v4}, Lorg/apache/log4j/pattern/PatternParser;->parse(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V

    .line 7
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lorg/apache/log4j/pattern/LoggingEventPatternConverter;

    iput-object p1, p0, Lorg/apache/log4j/pattern/BridgePatternConverter;->e:[Lorg/apache/log4j/pattern/LoggingEventPatternConverter;

    .line 8
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lorg/apache/log4j/pattern/FormattingInfo;

    iput-object p1, p0, Lorg/apache/log4j/pattern/BridgePatternConverter;->f:[Lorg/apache/log4j/pattern/FormattingInfo;

    .line 9
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 10
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 12
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 13
    instance-of v3, v2, Lorg/apache/log4j/pattern/LoggingEventPatternConverter;

    if-eqz v3, :cond_0

    .line 14
    iget-object v3, p0, Lorg/apache/log4j/pattern/BridgePatternConverter;->e:[Lorg/apache/log4j/pattern/LoggingEventPatternConverter;

    check-cast v2, Lorg/apache/log4j/pattern/LoggingEventPatternConverter;

    aput-object v2, v3, v1

    .line 15
    iget-boolean v2, p0, Lorg/apache/log4j/pattern/BridgePatternConverter;->g:Z

    aget-object v3, v3, v1

    invoke-virtual {v3}, Lorg/apache/log4j/pattern/LoggingEventPatternConverter;->handlesThrowable()Z

    move-result v3

    or-int/2addr v2, v3

    iput-boolean v2, p0, Lorg/apache/log4j/pattern/BridgePatternConverter;->g:Z

    goto :goto_1

    .line 16
    :cond_0
    iget-object v2, p0, Lorg/apache/log4j/pattern/BridgePatternConverter;->e:[Lorg/apache/log4j/pattern/LoggingEventPatternConverter;

    new-instance v3, Lorg/apache/log4j/pattern/LiteralPatternConverter;

    const-string v4, ""

    invoke-direct {v3, v4}, Lorg/apache/log4j/pattern/LiteralPatternConverter;-><init>(Ljava/lang/String;)V

    aput-object v3, v2, v1

    .line 17
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 18
    iget-object v2, p0, Lorg/apache/log4j/pattern/BridgePatternConverter;->f:[Lorg/apache/log4j/pattern/FormattingInfo;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/apache/log4j/pattern/FormattingInfo;

    aput-object v3, v2, v1

    goto :goto_2

    .line 19
    :cond_1
    iget-object v2, p0, Lorg/apache/log4j/pattern/BridgePatternConverter;->f:[Lorg/apache/log4j/pattern/FormattingInfo;

    invoke-static {}, Lorg/apache/log4j/pattern/FormattingInfo;->getDefault()Lorg/apache/log4j/pattern/FormattingInfo;

    move-result-object v3

    aput-object v3, v2, v1

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public a(Lorg/apache/log4j/spi/LoggingEvent;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 2
    invoke-virtual {p0, v0, p1}, Lorg/apache/log4j/pattern/BridgePatternConverter;->format(Ljava/lang/StringBuffer;Lorg/apache/log4j/spi/LoggingEvent;)V

    .line 3
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public format(Ljava/lang/StringBuffer;Lorg/apache/log4j/spi/LoggingEvent;)V
    .locals 3

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget-object v1, p0, Lorg/apache/log4j/pattern/BridgePatternConverter;->e:[Lorg/apache/log4j/pattern/LoggingEventPatternConverter;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/lang/StringBuffer;->length()I

    move-result v1

    .line 3
    iget-object v2, p0, Lorg/apache/log4j/pattern/BridgePatternConverter;->e:[Lorg/apache/log4j/pattern/LoggingEventPatternConverter;

    aget-object v2, v2, v0

    invoke-virtual {v2, p2, p1}, Lorg/apache/log4j/pattern/LoggingEventPatternConverter;->format(Lorg/apache/log4j/spi/LoggingEvent;Ljava/lang/StringBuffer;)V

    .line 4
    iget-object v2, p0, Lorg/apache/log4j/pattern/BridgePatternConverter;->f:[Lorg/apache/log4j/pattern/FormattingInfo;

    aget-object v2, v2, v0

    invoke-virtual {v2, v1, p1}, Lorg/apache/log4j/pattern/FormattingInfo;->format(ILjava/lang/StringBuffer;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public ignoresThrowable()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/pattern/BridgePatternConverter;->g:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
