.class public final Le/h/d/a/a/v/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Landroid/content/Context;

.field public final d:Ljava/lang/String;

.field public e:Ljava/util/Timer;

.field public f:Ljava/util/Date;

.field public g:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

.field public h:Landroid/bluetooth/BluetoothDevice;

.field public i:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/v/f;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Le/h/d/a/a/v/f;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Le/h/d/a/a/v/f;->c:Landroid/content/Context;

    .line 5
    const-class p1, Le/h/d/a/a/v/f;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Le/h/d/a/a/v/f;->d:Ljava/lang/String;

    .line 6
    sget-object p1, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->ZERO:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    iput-object p1, p0, Le/h/d/a/a/v/f;->g:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    .line 7
    iput-object p1, p0, Le/h/d/a/a/v/f;->i:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    return-void
.end method

.method public static final synthetic a(Le/h/d/a/a/v/f;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Le/h/d/a/a/v/f;->d:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic a(Le/h/d/a/a/v/f;Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V
    .locals 0

    .line 2
    iput-object p1, p0, Le/h/d/a/a/v/f;->g:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 3
    iget-object v0, p0, Le/h/d/a/a/v/f;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    .line 4
    iput-object p1, p0, Le/h/d/a/a/v/f;->h:Landroid/bluetooth/BluetoothDevice;

    return-void
.end method

.method public final a(Landroid/content/Context;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Le/h/d/a/a/v/f;->d:Ljava/lang/String;

    iget-object v1, p0, Le/h/d/a/a/v/f;->b:Ljava/lang/String;

    const-string v2, "forcing update for zone "

    invoke-static {v2, v1}, Li/h/c/k;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    new-instance v0, Le/h/d/a/a/r/a;

    invoke-direct {v0, p1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    .line 13
    iget-object p1, p0, Le/h/d/a/a/v/f;->h:Landroid/bluetooth/BluetoothDevice;

    .line 14
    iget-object v1, p0, Le/h/d/a/a/v/f;->b:Ljava/lang/String;

    .line 15
    iget-object v2, p0, Le/h/d/a/a/v/f;->a:Ljava/lang/String;

    .line 16
    iget-object v3, p0, Le/h/d/a/a/v/f;->g:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    .line 17
    invoke-virtual {v0, p1, v1, v2, v3}, Le/h/d/a/a/r/a;->a(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V

    return-void
.end method

.method public final a(Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V
    .locals 5

    const-string v0, "value"

    invoke-static {p1, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iput-object p1, p0, Le/h/d/a/a/v/f;->i:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    .line 6
    iget-object v0, p0, Le/h/d/a/a/v/f;->f:Ljava/util/Date;

    if-eqz v0, :cond_1

    .line 7
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iget-object v2, p0, Le/h/d/a/a/v/f;->f:Ljava/util/Date;

    invoke-static {v2}, Li/h/c/k;->a(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    cmpl-double v4, v0, v2

    if-ltz v4, :cond_0

    .line 8
    invoke-virtual {p0, p1}, Le/h/d/a/a/v/f;->b(Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V

    goto :goto_0

    .line 9
    :cond_0
    iget-object p1, p0, Le/h/d/a/a/v/f;->d:Ljava/lang/String;

    const-string v0, "no update needed 1 second timeout is in effect"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {p0, p1}, Le/h/d/a/a/v/f;->b(Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V

    :goto_0
    return-void
.end method

.method public final b()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/d/a/a/v/f;->c:Landroid/content/Context;

    return-object v0
.end method

.method public final b(Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V
    .locals 4

    .line 2
    iget-object v0, p0, Le/h/d/a/a/v/f;->g:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    if-eq p1, v0, :cond_0

    .line 3
    iget-object v0, p0, Le/h/d/a/a/v/f;->c:Landroid/content/Context;

    .line 4
    new-instance v1, Le/h/d/a/a/r/a;

    invoke-direct {v1, v0}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    .line 5
    invoke-virtual {p0}, Le/h/d/a/a/v/f;->d()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    .line 6
    invoke-virtual {p0}, Le/h/d/a/a/v/f;->e()Ljava/lang/String;

    move-result-object v2

    .line 7
    invoke-virtual {p0}, Le/h/d/a/a/v/f;->a()Ljava/lang/String;

    move-result-object v3

    .line 8
    invoke-virtual {v1, v0, v2, v3, p1}, Le/h/d/a/a/r/a;->a(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V

    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Le/h/d/a/a/v/f;->d:Ljava/lang/String;

    const-string v1, "no Change In LEVEL detected"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    :goto_0
    iput-object p1, p0, Le/h/d/a/a/v/f;->g:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    .line 11
    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    iput-object p1, p0, Le/h/d/a/a/v/f;->f:Ljava/util/Date;

    .line 12
    invoke-virtual {p0}, Le/h/d/a/a/v/f;->f()V

    return-void
.end method

.method public final c()Lcom/orange/oab/contactless/packid/rssi/RssiLevel;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/d/a/a/v/f;->i:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    return-object v0
.end method

.method public final d()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/d/a/a/v/f;->h:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/d/a/a/v/f;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final f()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Le/h/d/a/a/v/f;->h()V

    .line 2
    invoke-virtual {p0}, Le/h/d/a/a/v/f;->g()V

    return-void
.end method

.method public final g()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Le/h/d/a/a/v/f;->e:Ljava/util/Timer;

    .line 2
    new-instance v1, Le/h/d/a/a/v/e;

    invoke-direct {v1, p0}, Le/h/d/a/a/v/e;-><init>(Le/h/d/a/a/v/f;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method

.method public final h()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/d/a/a/v/f;->e:Ljava/util/Timer;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    :goto_0
    return-void
.end method
