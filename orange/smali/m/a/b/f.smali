.class public Lm/a/b/f;
.super Ljava/util/GregorianCalendar;
.source "SourceFile"


# instance fields
.field public b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/util/GregorianCalendar;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lm/a/b/f;->b:I

    return-void
.end method

.method public constructor <init>(Ljava/util/TimeZone;Ljava/util/Locale;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/TimeZone;Ljava/util/Locale;)V

    const/4 p1, -0x1

    .line 4
    iput p1, p0, Lm/a/b/f;->b:I

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Date;)Ljava/util/Date;
    .locals 10

    .line 2
    invoke-virtual {p0, p1}, Ljava/util/GregorianCalendar;->setTime(Ljava/util/Date;)V

    .line 3
    iget p1, p0, Lm/a/b/f;->b:I

    const/16 v0, 0xe

    const/16 v1, 0xd

    const/16 v2, 0xc

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz p1, :cond_6

    const/16 v5, 0xb

    if-eq p1, v3, :cond_5

    const/4 v6, 0x2

    const/4 v7, 0x5

    if-eq p1, v6, :cond_3

    const/4 v8, 0x3

    if-eq p1, v8, :cond_2

    const/4 v9, 0x4

    if-eq p1, v9, :cond_1

    if-ne p1, v7, :cond_0

    .line 4
    invoke-virtual {p0, v7, v3}, Ljava/util/GregorianCalendar;->set(II)V

    .line 5
    invoke-virtual {p0, v5, v4}, Ljava/util/GregorianCalendar;->set(II)V

    .line 6
    invoke-virtual {p0, v2, v4}, Ljava/util/GregorianCalendar;->set(II)V

    .line 7
    invoke-virtual {p0, v1, v4}, Ljava/util/GregorianCalendar;->set(II)V

    .line 8
    invoke-virtual {p0, v0, v4}, Ljava/util/GregorianCalendar;->set(II)V

    .line 9
    invoke-virtual {p0, v6, v3}, Ljava/util/GregorianCalendar;->add(II)V

    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unknown periodicity type."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/4 p1, 0x7

    .line 11
    invoke-virtual {p0}, Ljava/util/GregorianCalendar;->getFirstDayOfWeek()I

    move-result v6

    invoke-virtual {p0, p1, v6}, Ljava/util/GregorianCalendar;->set(II)V

    .line 12
    invoke-virtual {p0, v5, v4}, Ljava/util/GregorianCalendar;->set(II)V

    .line 13
    invoke-virtual {p0, v2, v4}, Ljava/util/GregorianCalendar;->set(II)V

    .line 14
    invoke-virtual {p0, v1, v4}, Ljava/util/GregorianCalendar;->set(II)V

    .line 15
    invoke-virtual {p0, v0, v4}, Ljava/util/GregorianCalendar;->set(II)V

    .line 16
    invoke-virtual {p0, v8, v3}, Ljava/util/GregorianCalendar;->add(II)V

    goto :goto_0

    .line 17
    :cond_2
    invoke-virtual {p0, v5, v4}, Ljava/util/GregorianCalendar;->set(II)V

    .line 18
    invoke-virtual {p0, v2, v4}, Ljava/util/GregorianCalendar;->set(II)V

    .line 19
    invoke-virtual {p0, v1, v4}, Ljava/util/GregorianCalendar;->set(II)V

    .line 20
    invoke-virtual {p0, v0, v4}, Ljava/util/GregorianCalendar;->set(II)V

    .line 21
    invoke-virtual {p0, v7, v3}, Ljava/util/GregorianCalendar;->add(II)V

    goto :goto_0

    .line 22
    :cond_3
    invoke-virtual {p0, v2, v4}, Ljava/util/GregorianCalendar;->set(II)V

    .line 23
    invoke-virtual {p0, v1, v4}, Ljava/util/GregorianCalendar;->set(II)V

    .line 24
    invoke-virtual {p0, v0, v4}, Ljava/util/GregorianCalendar;->set(II)V

    .line 25
    invoke-virtual {p0, v5}, Ljava/util/GregorianCalendar;->get(I)I

    move-result p1

    if-ge p1, v2, :cond_4

    .line 26
    invoke-virtual {p0, v5, v2}, Ljava/util/GregorianCalendar;->set(II)V

    goto :goto_0

    .line 27
    :cond_4
    invoke-virtual {p0, v5, v4}, Ljava/util/GregorianCalendar;->set(II)V

    .line 28
    invoke-virtual {p0, v7, v3}, Ljava/util/GregorianCalendar;->add(II)V

    goto :goto_0

    .line 29
    :cond_5
    invoke-virtual {p0, v2, v4}, Ljava/util/GregorianCalendar;->set(II)V

    .line 30
    invoke-virtual {p0, v1, v4}, Ljava/util/GregorianCalendar;->set(II)V

    .line 31
    invoke-virtual {p0, v0, v4}, Ljava/util/GregorianCalendar;->set(II)V

    .line 32
    invoke-virtual {p0, v5, v3}, Ljava/util/GregorianCalendar;->add(II)V

    goto :goto_0

    .line 33
    :cond_6
    invoke-virtual {p0, v1, v4}, Ljava/util/GregorianCalendar;->set(II)V

    .line 34
    invoke-virtual {p0, v0, v4}, Ljava/util/GregorianCalendar;->set(II)V

    .line 35
    invoke-virtual {p0, v2, v3}, Ljava/util/GregorianCalendar;->add(II)V

    .line 36
    :goto_0
    invoke-virtual {p0}, Ljava/util/GregorianCalendar;->getTime()Ljava/util/Date;

    move-result-object p1

    return-object p1
.end method

.method public a(I)V
    .locals 0

    .line 1
    iput p1, p0, Lm/a/b/f;->b:I

    return-void
.end method

.method public b(Ljava/util/Date;)J
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lm/a/b/f;->a(Ljava/util/Date;)Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    return-wide v0
.end method
