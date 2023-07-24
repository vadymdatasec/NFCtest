.class public Lorg/apache/log4j/helpers/PatternParser$e;
.super Lorg/apache/log4j/helpers/PatternConverter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/log4j/helpers/PatternParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/apache/log4j/helpers/PatternConverter;-><init>()V

    .line 2
    iput-object p1, p0, Lorg/apache/log4j/helpers/PatternParser$e;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lorg/apache/log4j/spi/LoggingEvent;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p1, p0, Lorg/apache/log4j/helpers/PatternParser$e;->e:Ljava/lang/String;

    return-object p1
.end method

.method public final format(Ljava/lang/StringBuffer;Lorg/apache/log4j/spi/LoggingEvent;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lorg/apache/log4j/helpers/PatternParser$e;->e:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    return-void
.end method
