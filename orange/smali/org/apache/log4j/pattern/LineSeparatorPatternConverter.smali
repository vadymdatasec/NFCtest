.class public final Lorg/apache/log4j/pattern/LineSeparatorPatternConverter;
.super Lorg/apache/log4j/pattern/LoggingEventPatternConverter;
.source "SourceFile"


# static fields
.field public static final d:Lorg/apache/log4j/pattern/LineSeparatorPatternConverter;


# instance fields
.field public final c:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/log4j/pattern/LineSeparatorPatternConverter;

    invoke-direct {v0}, Lorg/apache/log4j/pattern/LineSeparatorPatternConverter;-><init>()V

    sput-object v0, Lorg/apache/log4j/pattern/LineSeparatorPatternConverter;->d:Lorg/apache/log4j/pattern/LineSeparatorPatternConverter;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const-string v0, "Line Sep"

    const-string v1, "lineSep"

    .line 1
    invoke-direct {p0, v0, v1}, Lorg/apache/log4j/pattern/LoggingEventPatternConverter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lorg/apache/log4j/Layout;->LINE_SEP:Ljava/lang/String;

    iput-object v0, p0, Lorg/apache/log4j/pattern/LineSeparatorPatternConverter;->c:Ljava/lang/String;

    return-void
.end method

.method public static newInstance([Ljava/lang/String;)Lorg/apache/log4j/pattern/LineSeparatorPatternConverter;
    .locals 0

    .line 1
    sget-object p0, Lorg/apache/log4j/pattern/LineSeparatorPatternConverter;->d:Lorg/apache/log4j/pattern/LineSeparatorPatternConverter;

    return-object p0
.end method


# virtual methods
.method public format(Ljava/lang/Object;Ljava/lang/StringBuffer;)V
    .locals 0

    .line 2
    iget-object p1, p0, Lorg/apache/log4j/pattern/LineSeparatorPatternConverter;->c:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    return-void
.end method

.method public format(Lorg/apache/log4j/spi/LoggingEvent;Ljava/lang/StringBuffer;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lorg/apache/log4j/pattern/LineSeparatorPatternConverter;->c:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    return-void
.end method
