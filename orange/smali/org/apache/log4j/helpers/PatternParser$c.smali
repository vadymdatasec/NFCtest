.class public Lorg/apache/log4j/helpers/PatternParser$c;
.super Lorg/apache/log4j/helpers/PatternParser$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/log4j/helpers/PatternParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# direct methods
.method public constructor <init>(Lorg/apache/log4j/helpers/PatternParser;Lorg/apache/log4j/helpers/FormattingInfo;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, Lorg/apache/log4j/helpers/PatternParser$h;-><init>(Lorg/apache/log4j/helpers/FormattingInfo;I)V

    return-void
.end method


# virtual methods
.method public b(Lorg/apache/log4j/spi/LoggingEvent;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;

    move-result-object p1

    invoke-virtual {p1}, Lorg/apache/log4j/spi/LocationInfo;->getClassName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
