.class public abstract Lorg/apache/log4j/pattern/NamePatternConverter;
.super Lorg/apache/log4j/pattern/LoggingEventPatternConverter;
.source "SourceFile"


# instance fields
.field public final c:Lorg/apache/log4j/pattern/NameAbbreviator;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lorg/apache/log4j/pattern/LoggingEventPatternConverter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    .line 2
    array-length p1, p3

    if-lez p1, :cond_0

    const/4 p1, 0x0

    .line 3
    aget-object p1, p3, p1

    invoke-static {p1}, Lorg/apache/log4j/pattern/NameAbbreviator;->getAbbreviator(Ljava/lang/String;)Lorg/apache/log4j/pattern/NameAbbreviator;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/log4j/pattern/NamePatternConverter;->c:Lorg/apache/log4j/pattern/NameAbbreviator;

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Lorg/apache/log4j/pattern/NameAbbreviator;->getDefaultAbbreviator()Lorg/apache/log4j/pattern/NameAbbreviator;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/log4j/pattern/NamePatternConverter;->c:Lorg/apache/log4j/pattern/NameAbbreviator;

    :goto_0
    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/StringBuffer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/pattern/NamePatternConverter;->c:Lorg/apache/log4j/pattern/NameAbbreviator;

    invoke-virtual {v0, p1, p2}, Lorg/apache/log4j/pattern/NameAbbreviator;->abbreviate(ILjava/lang/StringBuffer;)V

    return-void
.end method
