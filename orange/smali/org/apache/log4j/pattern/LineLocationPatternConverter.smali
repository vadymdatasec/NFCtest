.class public final Lorg/apache/log4j/pattern/LineLocationPatternConverter;
.super Lorg/apache/log4j/pattern/LoggingEventPatternConverter;
.source "SourceFile"


# static fields
.field public static final c:Lorg/apache/log4j/pattern/LineLocationPatternConverter;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/log4j/pattern/LineLocationPatternConverter;

    invoke-direct {v0}, Lorg/apache/log4j/pattern/LineLocationPatternConverter;-><init>()V

    sput-object v0, Lorg/apache/log4j/pattern/LineLocationPatternConverter;->c:Lorg/apache/log4j/pattern/LineLocationPatternConverter;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const-string v0, "Line"

    const-string v1, "line"

    .line 1
    invoke-direct {p0, v0, v1}, Lorg/apache/log4j/pattern/LoggingEventPatternConverter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static newInstance([Ljava/lang/String;)Lorg/apache/log4j/pattern/LineLocationPatternConverter;
    .locals 0

    .line 1
    sget-object p0, Lorg/apache/log4j/pattern/LineLocationPatternConverter;->c:Lorg/apache/log4j/pattern/LineLocationPatternConverter;

    return-object p0
.end method


# virtual methods
.method public format(Lorg/apache/log4j/spi/LoggingEvent;Ljava/lang/StringBuffer;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LocationInfo;->getLineNumber()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_0
    return-void
.end method
