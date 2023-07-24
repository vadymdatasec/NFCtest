.class public Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lm/a/a/a/b/b<",
            "Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;",
            ">;>;"
        }
    .end annotation
.end field

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->a:Ljava/util/Map;

    .line 3
    iput p1, p0, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->b:I

    .line 4
    iput p2, p0, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->c:I

    return-void
.end method


# virtual methods
.method public final a(Lm/a/a/a/b/b;)Ljava/lang/Byte;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm/a/a/a/b/b<",
            "Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;",
            ">;)",
            "Ljava/lang/Byte;"
        }
    .end annotation

    .line 12
    invoke-virtual {p1}, Lm/a/a/a/b/b;->size()I

    move-result v0

    if-lez v0, :cond_0

    add-int/lit8 v0, v0, -0x1

    .line 13
    invoke-virtual {p1, v0}, Lm/a/a/a/b/b;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;

    iget-byte p1, p1, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;->a:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ":"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;)Ljava/util/Date;
    .locals 2

    .line 7
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 8
    iget-object p1, p1, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;->b:Ljava/util/Date;

    invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 9
    iget p1, p0, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->c:I

    const/16 v1, 0xd

    invoke-virtual {v0, v1, p1}, Ljava/util/Calendar;->add(II)V

    .line 10
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    return-object p1
.end method

.method public a()V
    .locals 6

    .line 2
    invoke-static {}, Le/h/d/a/a/n/t;->b()Ljava/util/Date;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->a:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm/a/a/a/b/b;

    .line 4
    invoke-virtual {v2}, Lm/a/a/a/b/b;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;

    .line 5
    invoke-virtual {p0, v4}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->a(Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;)Ljava/util/Date;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result v5

    if-lez v5, :cond_1

    .line 6
    invoke-virtual {v2, v4}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-void
.end method

.method public addValue(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;B)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Lm/a/a/a/b/b;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lm/a/a/a/b/b;

    iget v1, p0, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->b:I

    invoke-direct {v0, v1}, Lm/a/a/a/b/b;-><init>(I)V

    .line 3
    :cond_0
    new-instance v1, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;

    invoke-direct {v1, p4}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;-><init>(B)V

    invoke-virtual {v0, v1}, Lm/a/a/a/b/b;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object p4, p0, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->a:Ljava/util/Map;

    invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p4, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public average(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/Byte;
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Lm/a/a/a/b/b;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    invoke-virtual {p1}, Lm/a/a/a/b/b;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 p3, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;

    .line 3
    iget-byte v0, v0, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;->a:B

    add-int/2addr p3, v0

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p1}, Lm/a/a/a/b/b;->size()I

    move-result p1

    div-int/2addr p3, p1

    int-to-byte p1, p3

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/Byte;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Lm/a/a/a/b/b;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0, p1}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->a(Lm/a/a/a/b/b;)Ljava/lang/Byte;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1, p2}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Lm/a/a/a/b/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfr/mbs/binary/Octets;",
            "Lfr/mbs/binary/Octets;",
            "Ljava/lang/String;",
            ")",
            "Lm/a/a/a/b/b<",
            "Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->a:Ljava/util/Map;

    invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm/a/a/a/b/b;

    return-object p1
.end method

.method public count(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->a()V

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Lm/a/a/a/b/b;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1}, Lm/a/a/a/b/b;->size()I

    move-result p1

    :goto_0
    return p1
.end method

.method public isCalibrationCompleted(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Lm/a/a/a/b/b;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    return p2

    .line 2
    :cond_0
    invoke-virtual {p1}, Lm/a/a/a/b/b;->size()I

    move-result p1

    iget p3, p0, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->b:I

    if-ne p1, p3, :cond_1

    const/4 p2, 0x1

    :cond_1
    return p2
.end method

.method public max(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/Byte;
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Lm/a/a/a/b/b;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    return-object p2

    .line 2
    :cond_0
    invoke-virtual {p1}, Lm/a/a/a/b/b;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;

    if-eqz p2, :cond_2

    .line 3
    iget-byte v0, p3, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;->a:B

    invoke-virtual {p2}, Ljava/lang/Byte;->byteValue()B

    move-result v1

    if-le v0, v1, :cond_1

    :cond_2
    iget-byte p2, p3, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;->a:B

    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p2

    goto :goto_0

    :cond_3
    return-object p2
.end method

.method public min(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/Byte;
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Lm/a/a/a/b/b;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    return-object p2

    .line 2
    :cond_0
    invoke-virtual {p1}, Lm/a/a/a/b/b;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;

    if-eqz p2, :cond_2

    .line 3
    iget-byte v0, p3, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;->a:B

    invoke-virtual {p2}, Ljava/lang/Byte;->byteValue()B

    move-result v1

    if-ge v0, v1, :cond_1

    :cond_2
    iget-byte p2, p3, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;->a:B

    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p2

    goto :goto_0

    :cond_3
    return-object p2
.end method

.method public reset()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public reset(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->a:Ljava/util/Map;

    invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public rssiPerSec(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/Double;
    .locals 4

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Lm/a/a/a/b/b;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p1, p2}, Lm/a/a/a/b/b;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;

    .line 3
    invoke-virtual {p1}, Lm/a/a/a/b/b;->size()I

    move-result p3

    add-int/lit8 p3, p3, -0x1

    invoke-virtual {p1, p3}, Lm/a/a/a/b/b;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;

    .line 4
    invoke-virtual {p1}, Lm/a/a/a/b/b;->size()I

    move-result p1

    int-to-double v0, p1

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double v0, v0, v2

    iget-object p1, p3, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;->b:Ljava/util/Date;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    iget-object p1, p2, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;->b:Ljava/util/Date;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide p1

    sub-long/2addr v2, p1

    long-to-double p1, v2

    div-double/2addr v0, p1

    const-wide/high16 p1, 0x4059000000000000L    # 100.0

    mul-double v0, v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    div-double/2addr v0, p1

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public rssiResults(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->count(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/Byte;

    move-result-object v2

    const-string v3, "last"

    invoke-virtual {p0, v3, v2}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->min(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/Byte;

    move-result-object v2

    const-string v3, "min"

    invoke-virtual {p0, v3, v2}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->average(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/Byte;

    move-result-object v2

    const-string v3, "avg"

    invoke-virtual {p0, v3, v2}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->max(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/Byte;

    move-result-object v2

    const-string v3, "max"

    invoke-virtual {p0, v3, v2}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v2, "nb"

    invoke-virtual {p0, v2, v0}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->rssiPerSec(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/lang/Double;

    move-result-object p1

    const-string p2, "nb/s"

    invoke-virtual {p0, p2, p1}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
