.class public Lorg/apache/log4j/helpers/PatternParser$f;
.super Lorg/apache/log4j/helpers/PatternConverter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/log4j/helpers/PatternParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field public e:I


# direct methods
.method public constructor <init>(Lorg/apache/log4j/helpers/PatternParser;Lorg/apache/log4j/helpers/FormattingInfo;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lorg/apache/log4j/helpers/PatternConverter;-><init>(Lorg/apache/log4j/helpers/FormattingInfo;)V

    .line 2
    iput p3, p0, Lorg/apache/log4j/helpers/PatternParser$f;->e:I

    return-void
.end method


# virtual methods
.method public a(Lorg/apache/log4j/spi/LoggingEvent;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;

    move-result-object p1

    .line 2
    iget v0, p0, Lorg/apache/log4j/helpers/PatternParser$f;->e:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    const/4 p1, 0x0

    return-object p1

    .line 3
    :pswitch_1
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LocationInfo;->getFileName()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 4
    :pswitch_2
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LocationInfo;->getLineNumber()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 5
    :pswitch_3
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LocationInfo;->getMethodName()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 6
    :pswitch_4
    iget-object p1, p1, Lorg/apache/log4j/spi/LocationInfo;->fullInfo:Ljava/lang/String;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x3e8
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
