.class public abstract Lorg/apache/log4j/helpers/PatternParser$h;
.super Lorg/apache/log4j/helpers/PatternConverter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/log4j/helpers/PatternParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "h"
.end annotation


# instance fields
.field public e:I


# direct methods
.method public constructor <init>(Lorg/apache/log4j/helpers/FormattingInfo;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/log4j/helpers/PatternConverter;-><init>(Lorg/apache/log4j/helpers/FormattingInfo;)V

    .line 2
    iput p2, p0, Lorg/apache/log4j/helpers/PatternParser$h;->e:I

    return-void
.end method


# virtual methods
.method public a(Lorg/apache/log4j/spi/LoggingEvent;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lorg/apache/log4j/helpers/PatternParser$h;->b(Lorg/apache/log4j/spi/LoggingEvent;)Ljava/lang/String;

    move-result-object p1

    .line 2
    iget v0, p0, Lorg/apache/log4j/helpers/PatternParser$h;->e:I

    if-gtz v0, :cond_0

    return-object p1

    .line 3
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    .line 4
    iget v2, p0, Lorg/apache/log4j/helpers/PatternParser$h;->e:I

    :goto_0
    if-lez v2, :cond_2

    const/16 v3, 0x2e

    add-int/lit8 v1, v1, -0x1

    .line 5
    invoke-virtual {p1, v3, v1}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_1

    return-object p1

    :cond_1
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 6
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public abstract b(Lorg/apache/log4j/spi/LoggingEvent;)Ljava/lang/String;
.end method
